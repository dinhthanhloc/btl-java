package dinhthanhloc.controller.sinhvien;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dinhthanhloc.dao.imp.DeTaiDAO;
import dinhthanhloc.dao.imp.SinhVienDao;
import dinhthanhloc.model.DetaiEntity;
import dinhthanhloc.model.NhomEntity;
import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.model.TaiKhoanEntity;


@Controller(value = "detaiControllerOfSinhVien")
	public class DeTaiController {

	@RequestMapping(value = "/them-detai", method = RequestMethod.GET)
	public ModelAndView themNhom() {

		ModelAndView mav = new ModelAndView("sinhvien/createDeTai", "detai", new DeTaiEntity);

		return mav;

	}

	@RequestMapping(value = "/save-detai", method = RequestMethod.POST)
	public String saveNhom(@ModelAttribute("detai") DeTaiEntity detai) {
		
		if(maSVs!= null) {
			for(String maSV : maSVs) {
				SinhVienEntity sv = SinhVienDao.getInstance().findOne(Long.parseLong(maSV));
				if(sv != null) {
					JSONObject jsonThanhVien = new JSONObject(sv.toString());
					StringBuilder thanhvien = new StringBuilder("");
					thanhvien.append(jsonThanhVien);
				}else {
					return "redirect:/them-nhom";
				}
			}
			NhomEntity nhom = new NhomEntiy(TenNhom,thanhvien);
			return "redirect:/trang-chu";
		}
		
		return "redirect:/them-nhom";

	}
	}

