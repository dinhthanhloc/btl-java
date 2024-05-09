package dinhthanhloc.dao.imp;

import java.util.List;

import dinhthanhloc.dao.INganh;
import dinhthanhloc.mapper.NganhMapper;
import dinhthanhloc.model.NganhEntity;

public class NganhDAO extends AbstractDAO<NganhEntity> implements INganh {
	public static NganhDAO getInstance() {
		return new NganhDAO();
	}

	@Override
	public NganhEntity findOne(String TenNganh) {
		String sql = "SELECT * FROM nganh WHERE TenNganh = ?";
		List<NganhEntity> taikhoan = query(sql, new NganhMapper(), TenNganh);
		return taikhoan.isEmpty() ? null : taikhoan.get(0);
	}

}
