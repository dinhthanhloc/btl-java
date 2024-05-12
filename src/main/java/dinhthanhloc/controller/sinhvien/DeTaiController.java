package dinhthanhloc.controller.sinhvien;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.dao.imp.DeTaiDAO;
import dinhthanhloc.dao.imp.GiangVienDAO;
import dinhthanhloc.dao.imp.NhomDAO;
import dinhthanhloc.model.DetaiEntity;
import dinhthanhloc.model.GiangVienEntity;
import dinhthanhloc.model.NhomEntity;


@Controller(value = "detaiControllerOfSinhVien")
	public class DeTaiController {

	@RequestMapping(value = "/them-detai", method = RequestMethod.GET)
	public ModelAndView themNhom(HttpServletRequest request) {
		String message = (String)request.getParameter("message");
		request.setAttribute("message", message);
		ModelAndView mav = new ModelAndView("sinhvien/createDeTai");

		return mav;

	}

	@RequestMapping(value = "/save-detai", method = RequestMethod.GET)
	public String saveDeTai(HttpServletRequest request) {
		String tenDeTai =(String) request.getParameter("tenDeTai");
		String tenGV =(String) request.getParameter("tenGV");
		String tenNhom =(String) request.getParameter("tenNhom");
		
		GiangVienEntity gv = GiangVienDAO.getInstance().findOneByTen(tenGV);
		NhomEntity nhom = NhomDAO.getInstance().findOneByTen(tenNhom);
		if(gv!= null && nhom!=null) {
			
			DetaiEntity detai = new DetaiEntity(tenDeTai,gv.getMaGiangVien(),(int)nhom.getMaNhom(),123,2);
			DeTaiDAO.getInstance().save(detai);
			return "redirect:/trang-chu";
		}else {
			String message = "Thông tin GV hoặc Nhóm sai";
			request.setAttribute("message", message);
			return "redirect:/them-detai";
		}
		
		
	}
	}

