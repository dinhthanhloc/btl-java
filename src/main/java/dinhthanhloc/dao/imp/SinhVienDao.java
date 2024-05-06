package dinhthanhloc.dao.imp;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import dinhthanhloc.dao.ISinhVien;
import dinhthanhloc.mapper.SinhVienMapper;
import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.paging.Pageble;

public class SinhVienDao extends AbstractDAO<SinhVienEntity> implements ISinhVien {
	@Override
	public SinhVienEntity findOne(Long MaSinhVien) {
		String sql = "SELECT * FROM sinhvien WHERE MaSinhVien = ?";
		List<SinhVienEntity> sinhvien = query(sql, new SinhVienMapper(), MaSinhVien);
		return sinhvien.isEmpty() ? null : sinhvien.get(0);
	}

	@Override
	public Long save(SinhVienEntity newSinhVien) {
		StringBuilder sql = new StringBuilder("INSERT INTO detai (MaSinhVien, HoTen, Lop,");
		sql.append(" NienKhoa, MaNganh, MaTaiKhoan)");
		sql.append(" VALUES(?,?,?,?,?,?)");
		return insert(sql.toString(), newSinhVien.getMaTaiKhoan(), newSinhVien.getHoTen(), newSinhVien.getLop(),
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
	public List<SinhVienEntity> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM sinhvien");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
				&& StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
		}
		return query(sql.toString(), new SinhVienMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM sinhvien";
		return count(sql);
	}
}
