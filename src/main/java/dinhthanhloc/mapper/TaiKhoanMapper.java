package dinhthanhloc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import dinhthanhloc.model.TaiKhoanEntity;

public class TaiKhoanMapper implements RowMapper<TaiKhoanEntity> {
	@Override
	public TaiKhoanEntity mapRow(ResultSet resultSet) {
		try {
			TaiKhoanEntity taikhoan = new TaiKhoanEntity();
			taikhoan.setMaTaiKhoan(resultSet.getInt("MaTaiKhoan"));
			taikhoan.setUsername(resultSet.getString("Username"));
			taikhoan.setPassword(resultSet.getString("Password"));
			taikhoan.setEmail(resultSet.getString("Email"));
			taikhoan.setHoTen(resultSet.getString("HoTen"));
			taikhoan.setMaLoaiTaiKhoan(resultSet.getInt("MaLoaiTaiKhoan"));
			return taikhoan;
		} catch (SQLException e) {
			return null;
		}
	}
}
