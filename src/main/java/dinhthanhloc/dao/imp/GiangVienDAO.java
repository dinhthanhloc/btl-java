package dinhthanhloc.dao.imp;

import java.util.List;

import dinhthanhloc.dao.IGiangVien;
import dinhthanhloc.mapper.GiangVienMapper;
import dinhthanhloc.model.GiangVienEntity;

public class GiangVienDAO extends AbstractDAO<GiangVienEntity> implements IGiangVien {
	public static GiangVienDAO getInstance() {
		return new GiangVienDAO();
	}
	@Override
	public GiangVienEntity findOne(Long MaGiangVien) {
		String sql = "SELECT * FROM giangvien WHERE MaGiangVien = ?";
		List<GiangVienEntity> giangvien = query(sql, new GiangVienMapper(), MaGiangVien);
		return giangvien.isEmpty() ? null : giangvien.get(0);
	}

	@Override
	public Long save(GiangVienEntity newGiangVien) {
		StringBuilder sql = new StringBuilder("INSERT INTO giangvien (MaGiangVien, TenGiangVien, MaKhoa,");
		sql.append("MaTaiKhoan, TrinhDo)");
		sql.append(" VALUES(?,?,?,?,?,?)");
		return insert(sql.toString(), newGiangVien.getMaGiangVien(), newGiangVien.getTenGiangVien(), newGiangVien.getMaKhoa(),
				newGiangVien.getMaTaiKhoan(), newGiangVien.getTrinhDo());
	}

	@Override
	public void update(GiangVienEntity updateGiangVien) {
		StringBuilder sql = new StringBuilder("UPDATE giangvien SET TenGiangVien=?,");
		sql.append(" MaKhoa=?, MaTaiKhoan=?, TrinhDo=?=");
		sql.append(" WHERE MaGiangVien = ?");
		update(sql.toString(), updateGiangVien.getTenGiangVien(), updateGiangVien.getMaKhoa(),
				updateGiangVien.getMaTaiKhoan(), updateGiangVien.getTrinhDo(), updateGiangVien.getMaGiangVien());

	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM giangvien WHERE MaGiangVien = ?";
		update(sql, id);
	}

	@Override
	public List<GiangVienEntity> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM giangvien");
		return query(sql.toString(), new GiangVienMapper());
	}

	@Override
	public GiangVienEntity findOneByMaTK(Long MaTaiKhoan) {
		String sql = "SELECT * FROM giangvien WHERE MaTaiKhoan = ?";
		List<GiangVienEntity> giangvien = query(sql, new GiangVienMapper(), MaTaiKhoan);
		return giangvien.isEmpty() ? null : giangvien.get(0);
	}
}
