package dinhthanhloc.dao.imp;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import dinhthanhloc.dao.INhom;
import dinhthanhloc.mapper.NhomMapper;
import dinhthanhloc.model.NhomEntity;
import dinhthanhloc.paging.Pageble;

public class NhomDAO extends AbstractDAO<NhomEntity> implements INhom{
	public static NhomDAO getInstance() {
		return new NhomDAO();
	}
	@Override
	public NhomEntity findOne(Long MaNhom) {
		String sql = "SELECT * FROM nhom WHERE MaNhom = ?";
		List<NhomEntity> nhom = query(sql, new NhomMapper(), MaNhom);
		return nhom.isEmpty() ? null : nhom.get(0);
	}

	@Override
	public Long save(NhomEntity newNhom) {
		StringBuilder sql = new StringBuilder("INSERT INTO nhom (TenNhom,ThanhVien)");
		sql.append(" VALUES(?, ?)");
		return insert(sql.toString(), newNhom.getTenNhom(), newNhom.getThanhVien());
	}

	@Override
	public void update(NhomEntity updateNhom) {
		StringBuilder sql = new StringBuilder("UPDATE nhom SET TenNhom = ?, ThanhVien = ?,");
		sql.append(" WHERE MaNhom = ?");
		update(sql.toString(), updateNhom.getTenNhom(), updateNhom.getThanhVien(), updateNhom.getMaNhom());

	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM nhom WHERE MaNhom = ?";
		update(sql, id);
	}

	@Override
	public List<NhomEntity> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM nhom");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
				&& StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
		}
		return query(sql.toString(), new NhomMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM nhom";
		return count(sql);
	}
}
