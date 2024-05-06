package dinhthanhloc.dao;

import java.util.List;

import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.paging.Pageble;

public interface ISinhVien extends GenericDAO<SinhVienEntity>{
	SinhVienEntity findOne(Long MaSinhVien);
	Long save(SinhVienEntity newSinhVien);
	void update(SinhVienEntity updateSinhVien);
	void delete(long id);
	List<SinhVienEntity> findAll();
	int getTotalItem();
}
