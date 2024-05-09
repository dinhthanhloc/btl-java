package dinhthanhloc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import dinhthanhloc.model.NganhEntity;

public class NganhMapper implements RowMapper<NganhEntity> {
	@Override
	public NganhEntity mapRow(ResultSet resultSet) {
		try {
			NganhEntity nganh = new NganhEntity();
			nganh.setMaNganh(resultSet.getInt("MaNganh"));
			nganh.setTenNganh(resultSet.getString("TenNganh"));
			nganh.setMaKhoa(resultSet.getInt("MaKhoa"));
			
			return nganh;
		} catch (SQLException e) {
			return null;
		}
	}
}
