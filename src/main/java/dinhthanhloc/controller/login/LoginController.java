package dinhthanhloc.controller.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import dinhthanhloc.dao.imp.GiangVienDAO;
import dinhthanhloc.dao.imp.SinhVienDao;
import dinhthanhloc.dao.imp.TaiKhoanDAO;
import dinhthanhloc.hash.hashcode;
import dinhthanhloc.model.GiangVienEntity;
import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.model.TaiKhoanEntity;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login", "taikhoan", new TaiKhoanEntity());
		return mav;
	}

	@RequestMapping(value = "/save-login", method = RequestMethod.GET)
	public String saveLogin(@ModelAttribute("taikhoan") TaiKhoanEntity taikhoan, HttpSession session,
			RedirectAttributes redirectAttributes) {
		String hashPass = hashcode.getInstance().hashMD5(taikhoan.getPassword());
		TaiKhoanEntity tk = TaiKhoanDAO.getInstance().findOneByUserNameAndPassword(taikhoan.getUsername(), hashPass);
		if (tk != null) {
			session.setAttribute("TKMODEL", tk);
			if (tk.getMaLoaiTaiKhoan() == 1) {
				SinhVienEntity sv = SinhVienDao.getInstance().findOneByMaTK((long) tk.getMaTaiKhoan());
				session.setAttribute("USERMODEL", sv);
				return "redirect:/trang-chu";
			} else if (tk.getMaLoaiTaiKhoan() == 2) {
				GiangVienEntity gv = GiangVienDAO.getInstance().findOneByMaTK((long) tk.getMaTaiKhoan());
				session.setAttribute("USERMODEL", gv);
				
				return "redirect:/quan-tri/home";
				
			}
			
		}
		String message = "Thông tin đăng nhập không hợp lệ";
		redirectAttributes.addFlashAttribute("message", message);
		return "redirect:/dang-nhap";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		ModelAndView mav = new ModelAndView("redirect:/dang-nhap");
		return mav;
	}
}
