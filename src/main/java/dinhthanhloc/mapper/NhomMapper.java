package dinhthanhloc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import dinhthanhloc.model.NhomEntity;

public class NhomMapper implements RowMapper<NhomEntity> {
	@Override
	public NhomEntity mapRow(ResultSet resultSet) {
		try {
			NhomEntity nhom = new NhomEntity();
			nhom.setTenNhom(resultSet.getString("TenNhom"));
			nhom.setThanhVien(resultSet.getString("ThanhVien"));
			return nhom;
		} catch (SQLException e) {
			return null;
		}
	}
}
