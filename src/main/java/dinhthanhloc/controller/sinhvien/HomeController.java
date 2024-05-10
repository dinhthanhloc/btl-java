package dinhthanhloc.controller.sinhvien;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.dao.imp.GiangVienDAO;
import dinhthanhloc.dao.imp.SinhVienDao;
import dinhthanhloc.dao.imp.TaiKhoanDAO;
import dinhthanhloc.hash.hashcode;
import dinhthanhloc.model.GiangVienEntity;
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
	@RequestMapping(value = "/add-nhom", method = RequestMethod.POST)
	public ModelAndView saveLogin(@ModelAttribute("nhom") NhomEntity nhom) {
		
		
			ModelAndView mav = new ModelAndView("redirect:/dang-nhap");
			
			return mav;
	
	}
}
