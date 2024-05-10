package dinhthanhloc.controller.giangvien;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.dao.imp.NganhDAO;
import dinhthanhloc.dao.imp.SinhVienDao;
import dinhthanhloc.dao.imp.TaiKhoanDAO;
import dinhthanhloc.hash.hashcode;
import dinhthanhloc.model.NganhEntity;
import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.model.TaiKhoanEntity;

@Controller
@MultipartConfig(maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 20, // 20MB
		fileSizeThreshold = 1024 * 1024 * 1 // 1MB
)
public class HomeController {

	@RequestMapping(value = "/quan-tri/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("giangvien/home");
		return mav;
	}

	@RequestMapping(value = "/quan-tri/add", method = RequestMethod.GET)
	public ModelAndView viewAdd() {
		ModelAndView mav = new ModelAndView("giangvien/addData");
		return mav;
	}

	@RequestMapping(value = "/quan-tri/addData", method = RequestMethod.POST)
	public String addData(HttpServletRequest request) throws IOException, ServletException {

		for (Part part : request.getParts()) {
			if (part.getContentType() != null && part.getContentType().startsWith("multipart")) {
				InputStream inputStream = part.getInputStream();
				String line = "";
				try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

					line = reader.readLine();
					while ((line = reader.readLine()) != null && !line.isEmpty()) {
						String fields[] = line.split(",");
						String hashPass = hashcode.getInstance().hashMD5(fields[0]);
						TaiKhoanEntity newTaiKhoan = new TaiKhoanEntity(fields[0], hashPass, "", fields[1], 1);
						TaiKhoanDAO.getInstance().save(newTaiKhoan);
						TaiKhoanEntity tk = TaiKhoanDAO.getInstance().findOneById(fields[0]);
						NganhEntity nganh = NganhDAO.getInstance().findOne(fields[4]);
						if (tk != null && nganh != null) {
							SinhVienEntity newSinhVien = new SinhVienEntity(fields[0], fields[1], fields[2], fields[3],
									(int) nganh.getMaNganh(), (int) tk.getMaTaiKhoan());
							SinhVienDao.getInstance().save(newSinhVien);
						}
					}

					return "redirect:/quan-tri/add";
				} catch (IOException e) {
					e.printStackTrace();
					return "redirect:/quan-tri/home";
				}
			} else {
				return "redirect:/quan-tri/home";
			}
		}
		return "redirect:/quan-tri/home";
	}
}