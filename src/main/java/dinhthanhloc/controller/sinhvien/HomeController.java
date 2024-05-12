package dinhthanhloc.controller.sinhvien;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.json.JSONObject;

import dinhthanhloc.dao.imp.NhomDAO;
import dinhthanhloc.dao.imp.SinhVienDao;
import dinhthanhloc.dao.imp.TaiKhoanDAO;
import dinhthanhloc.model.NhomEntity;
import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.model.TaiKhoanEntity;

@Controller(value = "homeControllerOfSinhVien")
public class HomeController {

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage(HttpSession session) {
		SinhVienEntity sv = (SinhVienEntity) session.getAttribute("USERMODEL");
		if (sv != null) {
			System.out.println(sv.toString());
		}
		ModelAndView mav = new ModelAndView("sinhvien/home");
		return mav;
	}

	@RequestMapping(value = "/them-nhom", method = RequestMethod.GET)
	public ModelAndView themNhom() {

		ModelAndView mav = new ModelAndView("sinhvien/createNhom");

		return mav;

	}

	@RequestMapping(value = "/save-nhom", method = RequestMethod.GET)
	public String saveNhom(HttpServletRequest request) {
		String[] maSVs = request.getParameterValues("maSV");
		String tenNhom = (String)request.getParameter("tenNhom");
		if(maSVs!= null) {
			StringBuilder thanhvien = new StringBuilder("");
			for(String maSV : maSVs) {
				SinhVienEntity sv = SinhVienDao.getInstance().findOne(Long.parseLong(maSV));
				
				if(sv != null) {
					thanhvien.append(sv.toString());
				}else {
					return "redirect:/them-nhom";
				}
			}
			NhomEntity newNhom = new NhomEntity(tenNhom, thanhvien.toString());
			NhomDAO.getInstance().save(newNhom);
			return "redirect:/trang-chu";
		}
		
		return "redirect:/them-nhom";

	}
}
