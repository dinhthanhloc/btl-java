package dinhthanhloc.dao.imp;

import java.util.List;

import dinhthanhloc.dao.ISinhVien;
import dinhthanhloc.mapper.SinhVienMapper;
import dinhthanhloc.model.SinhVienEntity;

public class SinhVienDao extends AbstractDAO<SinhVienEntity> implements ISinhVien {
	public static SinhVienDao getInstance() {
		return new SinhVienDao();
	}
	@Override
	public SinhVienEntity findOne(Long MaSinhVien) {
		String sql = "SELECT * FROM sinhvien WHERE MaSinhVien = ?";
		List<SinhVienEntity> sinhvien = query(sql, new SinhVienMapper(), MaSinhVien);
		return sinhvien.isEmpty() ? null : sinhvien.get(0);
	}

	@Override
	public Long save(SinhVienEntity newSinhVien) {
		StringBuilder sql = new StringBuilder("INSERT INTO sinhvien (MaSinhVien, HoTen, Lop,");
		sql.append(" NienKhoa, MaNganh, MaTaiKhoan)");
		sql.append(" VALUES(?,?,?,?,?,?)");
		return insert(sql.toString(), newSinhVien.getMaSinhVien(), newSinhVien.getHoTen(), newSinhVien.getLop(),
				newSinhVien.getNienKhoa(), newSinhVien.getMaNganh(), newSinhVien.getMaTaiKhoan());
	}

	@Override
	public void update(SinhVienEntity updateSinhVien) {
		StringBuilder sql = new StringBuilder("UPDATE sinhvien SET HoTen=?,");
		sql.append(" Lop=?, NienKhoa=?, MaNganh=?, MaTaiKhoan=?");
		sql.append(" WHERE MaSinhVien = ?");
		update(sql.toString(), updateSinhVien.getHoTen(), updateSinhVien.getLop(), updateSinhVien.getNienKhoa(),
				updateSinhVien.getMaNganh(), updateSinhVien.getMaTaiKhoan(), updateSinhVien.getMaSinhVien());

	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM sinhvien WHERE MaSinhVien = ?";
		update(sql, id);
	}

	@Override
	public List<SinhVienEntity> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM sinhvien");
		return query(sql.toString(), new SinhVienMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM sinhvien";
		return count(sql);
	}
}
