package dinhthanhloc.controller.giangvien;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.dao.imp.DeTaiDAO;
import dinhthanhloc.model.DetaiEntity;
@Controller(value = "detaiControllerOfGiangVien")
public class DeTaiController {

	@RequestMapping(value = "/quan-tri/listDeTai", method = RequestMethod.GET)
	public ModelAndView listDeTai(@ModelAttribute("model") DetaiEntity model) {
		ModelAndView mav = new ModelAndView("giangvien/detai/list");
		model.setListResult(DeTaiDAO.getInstance().findAll());
		mav.addObject("model", model);
		return mav;
	}
	@RequestMapping(value = "/quan-tri/chamDeTai", method = RequestMethod.GET)
	public ModelAndView chamDiem(@ModelAttribute("model") DetaiEntity model) {
		ModelAndView mav = new ModelAndView("giangvien/detai/chamdiem");
		model.setListResult(DeTaiDAO.getInstance().findByTrangThai(3));
		mav.addObject("model", model);
		return mav;
	}
}
