package dinhthanhloc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import dinhthanhloc.model.GiangVienEntity;

public class GiangVienMapper implements RowMapper<GiangVienEntity> {
	@Override
	public GiangVienEntity mapRow(ResultSet resultSet) {
		try {
			GiangVienEntity giangvien = new GiangVienEntity();
			giangvien.setMaGiangVien(resultSet.getString("MaGiangVien"));
			giangvien.setTenGiangVien(resultSet.getString("TenGiangVien"));
			giangvien.setMaKhoa(resultSet.getInt("MaKhoa"));
			giangvien.setTrinhDo(resultSet.getString("TrinhDo"));
			giangvien.setMaTaiKhoan(resultSet.getInt("MaTaiKhoan"));
			return giangvien;
		} catch (SQLException e) {
			return null;
		}
	}
}
