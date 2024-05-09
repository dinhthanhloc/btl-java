package dinhthanhloc.dao;

import dinhthanhloc.model.TaiKhoanEntity;

public interface ITaiKhoan extends GenericDAO<TaiKhoanEntity>{
	TaiKhoanEntity findOne(Long MaTaiKhoan);
	Long save(TaiKhoanEntity newTaiKhoan);
	void update(TaiKhoanEntity updateTaiKhoan);
	void delete(long id);
	TaiKhoanEntity findOneById(String Username);
	TaiKhoanEntity findOneByUserNameAndPassword(String Username, String Password);
}
