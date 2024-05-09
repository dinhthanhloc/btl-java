package dinhthanhloc.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.dao.imp.TaiKhoanDAO;
import dinhthanhloc.hash.hashcode;
import dinhthanhloc.model.TaiKhoanEntity;


@Controller
public class LoginController {
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login", "taikhoan", new TaiKhoanEntity());
		return mav;
	}
	
	@RequestMapping(value = "/save-login", method = RequestMethod.POST)
	public ModelAndView saveLogin(@ModelAttribute("taikhoan") TaiKhoanEntity taikhoan) {
		String hashPass = hashcode.getInstance().hashMD5(taikhoan.getPassword());
		TaiKhoanEntity tk = TaiKhoanDAO.getInstance().findOneByUserNameAndPassword(taikhoan.getUsername(), hashPass);
		if (tk != null) {
			if (tk.getMaLoaiTaiKhoan() == 1) {
				ModelAndView mav = new ModelAndView("redirect:/trang-chu");
				return mav;
			} else if (tk.getMaLoaiTaiKhoan() == 2) {
				ModelAndView mav = new ModelAndView("redirect:/quan-tri/home");
				return mav;
			}
		}
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("message","Thông tin tk hoặc mk không chính xác");
		return mav;
	}
}
