package dinhthanhloc.dao.imp;

import java.util.List;

import dinhthanhloc.dao.ITaiKhoan;
import dinhthanhloc.mapper.TaiKhoanMapper;
import dinhthanhloc.model.TaiKhoanEntity;

public class TaiKhoanDAO extends AbstractDAO<TaiKhoanEntity> implements ITaiKhoan {
	public static TaiKhoanDAO getInstance() {
		return new TaiKhoanDAO();
	}
	@Override
	public TaiKhoanEntity findOne(Long MaTaiKhoan) {
		String sql = "SELECT * FROM taikhoan WHERE MaTaiKhoan = ?";
		List<TaiKhoanEntity> taikhoan = query(sql, new TaiKhoanMapper(), MaTaiKhoan);
		return taikhoan.isEmpty() ? null : taikhoan.get(0);
	}

	@Override
	public Long save(TaiKhoanEntity newTaiKhoan) {
		StringBuilder sql = new StringBuilder("INSERT INTO taikhoan (Username,");
		sql.append(" Password, Email, HoTen, MaLoaiTaiKhoan)");
		sql.append(" VALUES(?, ?, ?, ?, ?)");
		return insert(sql.toString(), newTaiKhoan.getUsername(), newTaiKhoan.getPassword(), newTaiKhoan.getEmail(),
				newTaiKhoan.getHoTen(), newTaiKhoan.getMaLoaiTaiKhoan());
	}

	@Override
	public void update(TaiKhoanEntity updateTaiKhoan) {
		StringBuilder sql = new StringBuilder("UPDATE detai SET Username = ?, Password = ?,");
		sql.append(" Email = ?, HoTen = ?, MaLoaiTaiKhoan = ?");
		sql.append(" WHERE MaTaiKhoan = ?");
		update(sql.toString(), updateTaiKhoan.getUsername(), updateTaiKhoan.getPassword(), updateTaiKhoan.getEmail(),
				updateTaiKhoan.getHoTen(), updateTaiKhoan.getMaLoaiTaiKhoan(), updateTaiKhoan.getMaTaiKhoan());
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM taikhoan WHERE MaTaiKhoan = ?";
		update(sql, id);

	}
	@Override
	public TaiKhoanEntity findOneById(String Username) {
		String sql = "SELECT * FROM taikhoan WHERE Username = ?";
		List<TaiKhoanEntity> taikhoan = query(sql, new TaiKhoanMapper(), Username);
		return taikhoan.isEmpty() ? null : taikhoan.get(0);
	}
	@Override
	public TaiKhoanEntity findOneByUserNameAndPassword(String Username, String Password) {
		String sql = "SELECT * FROM taikhoan WHERE Username = ? AND Password = ?";
		List<TaiKhoanEntity> taikhoan = query(sql, new TaiKhoanMapper(), Username, Password);
		return taikhoan.isEmpty() ? null : taikhoan.get(0);
	}

}
