package dinhthanhloc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import dinhthanhloc.model.DetaiEntity;

public class DeTaiMapper implements RowMapper<DetaiEntity>{
	@Override
	public DetaiEntity mapRow(ResultSet resultSet) {
		try {
			DetaiEntity detai = new DetaiEntity();
			detai.setMaDeTai(resultSet.getInt("MaDeTai"));
			detai.setTenDeTai(resultSet.getString("TenDeTai"));
			detai.setMaGiangVien(resultSet.getString("MaGiangVien"));
			detai.setMaNhom(resultSet.getInt("MaNhom"));
			detai.setMaNganh(resultSet.getInt("MaNganh"));
			detai.setMaTrangThai(resultSet.getInt("MaTrangThai"));
			detai.setKetQua(resultSet.getDouble("KetQua"));
			
			
			return detai;
		} catch (SQLException e) {
			return null;
		}	
	}
}
