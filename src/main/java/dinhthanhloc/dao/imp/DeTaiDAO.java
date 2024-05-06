package dinhthanhloc.dao.imp;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import dinhthanhloc.dao.IDeTai;
import dinhthanhloc.mapper.DeTaiMapper;
import dinhthanhloc.model.DetaiEntity;
import dinhthanhloc.paging.Pageble;

public class DeTaiDAO extends AbstractDAO<DetaiEntity> implements IDeTai {

	@Override
	public DetaiEntity findOne(Long MaDeTai) {
		String sql = "SELECT * FROM detai WHERE id = ?";
		List<DetaiEntity> detai = query(sql, new DeTaiMapper(), MaDeTai);
		return detai.isEmpty() ? null : detai.get(0);
	}

	@Override
	public Long save(DetaiEntity newDeTai) {
		StringBuilder sql = new StringBuilder("INSERT INTO detai (TenDeTai,");
		sql.append(" MaGiangVien, MaNhom, MaNganh, MaTrangThai, KetQua)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), newDeTai.getTenDeTai(), newDeTai.getMaGiangVien(), newDeTai.getMaNhom(),
				newDeTai.getMaNganh(), newDeTai.getMaTrangThai(), newDeTai.getKetQua());
	}

	@Override
	public void update(DetaiEntity updateDeTai) {
		StringBuilder sql = new StringBuilder("UPDATE detai SET TenDeTai = ?, MaGiangVien = ?,");
		sql.append(" MaNhom = ?, MaNganh = ?, MaTrangThai = ?,KetQua = ?");
		sql.append(" WHERE MaDeTai = ?");
		update(sql.toString(), updateDeTai.getTenDeTai(), updateDeTai.getMaGiangVien(), updateDeTai.getMaNhom(),
				updateDeTai.getMaNganh(), updateDeTai.getMaTrangThai(), updateDeTai.getKetQua(),
				updateDeTai.getMaDeTai());

	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM detai WHERE MaDeTai = ?";
		update(sql, id);

	}

	@Override
	public List<DetaiEntity> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM detai");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
		return query(sql.toString(), new DeTaiMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM detai";
		return count(sql);
	}

}
