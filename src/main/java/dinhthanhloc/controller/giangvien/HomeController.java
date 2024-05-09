package dinhthanhloc.controller.giangvien;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfGiangVien")
public class HomeController {

	@RequestMapping(value = "/quan-tri/home", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("giangvien/home");
		return mav;
	}
}
