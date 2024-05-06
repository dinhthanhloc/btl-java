package dinhthanhloc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import dinhthanhloc.model.SinhVienEntity;

public class SinhVienMapper implements RowMapper<SinhVienEntity> {
	@Override
	public SinhVienEntity mapRow(ResultSet resultSet) {
		try {
			SinhVienEntity sinhvien = new SinhVienEntity();
			sinhvien.setMaSinhVien(resultSet.getString("MaSinhVien"));
			sinhvien.setHoTen(resultSet.getString("HoTen"));
			sinhvien.setLop(resultSet.getString("Lop"));
			sinhvien.setNienKhoa(resultSet.getString("NienKhoa"));
			sinhvien.setMaNganh(resultSet.getInt("MaNganh"));
			sinhvien.setMaTaiKhoan(resultSet.getInt("MaTaiKhoan"));
			return sinhvien;
		} catch (SQLException e) {
			return null;
		}
	}
}
