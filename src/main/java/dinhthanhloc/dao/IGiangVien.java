package dinhthanhloc.dao;

import java.util.List;

import dinhthanhloc.model.GiangVienEntity;

public interface IGiangVien extends GenericDAO<GiangVienEntity>{
	GiangVienEntity findOne(Long MaGiangVien);
	Long save(GiangVienEntity newGiangVien);
	void update(GiangVienEntity updateGiangVien);
	void delete(long id);
	List<GiangVienEntity> findAll();
	GiangVienEntity findOneByMaTK(Long MaGiangVien);
}
