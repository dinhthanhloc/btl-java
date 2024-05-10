package dinhthanhloc.controller.sinhvien;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.model.NhomEntity;
import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.model.TaiKhoanEntity;

@Controller(value = "homeControllerOfSinhVien")
public class HomeController {

	
	@RequestMapping(value="/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage(HttpSession session) {
		SinhVienEntity sv = (SinhVienEntity)session.getAttribute("USERMODEL");
		if(sv != null) {
			System.out.println(sv.toString());
		}
		ModelAndView mav = new ModelAndView("sinhvien/home");
		return mav;
	}
	@RequestMapping(value = "/them-nhom", method = RequestMethod.GET)
	public ModelAndView themNhom() {
		
			ModelAndView mav = new ModelAndView("sinhvien/createNhom", "nhom", new NhomEntity());
			
			return mav;
	
	}
	@RequestMapping(value = "/save-nhom", method = RequestMethod.POST)
	public ModelAndView saveNhom(@ModelAttribute("nhom") NhomEntity nhom) {
		
			ModelAndView mav = new ModelAndView("sinhvien/createNhom", "nhom", new NhomEntity());
			
			return mav;
	
	}
}
