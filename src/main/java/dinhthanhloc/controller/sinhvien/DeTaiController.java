package dinhthanhloc.controller.sinhvien;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.dao.imp.DeTaiDAO;
import dinhthanhloc.model.DetaiEntity;

public class DeTaiController {
	@Controller(value = "detaiControllerOfSinhVien")
	public class DeTaiController {

		@RequestMapping(value = "/detai/add", method = RequestMethod.POST)
		public ModelAndView showList(@ModelAttribute("detai") DetaiEntity detai) {
			ModelAndView mav = new ModelAndView("admin/new/list");
			detai.setListResult(DeTaiDAO.getInstance().findAll());
			mav.addObject("model", detai);
			return mav;
		}
	}

}
