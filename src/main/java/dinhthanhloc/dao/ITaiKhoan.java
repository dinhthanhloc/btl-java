package dinhthanhloc.dao;

import java.util.List;

import dinhthanhloc.model.TaiKhoanEntity;
import dinhthanhloc.paging.Pageble;

public interface ITaiKhoan extends GenericDAO<TaiKhoanEntity>{
	TaiKhoanEntity findOne(Long MaTaiKhoan);
	Long save(TaiKhoanEntity newTaiKhoan);
	void update(TaiKhoanEntity updateTaiKhoan);
	void delete(long id);
	List<TaiKhoanEntity> findAll(Pageble pageble);
	int getTotalItem();
}
