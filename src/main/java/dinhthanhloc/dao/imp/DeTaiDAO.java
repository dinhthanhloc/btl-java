package dinhthanhloc.dao.imp;

import java.util.List;

import dinhthanhloc.dao.IDeTai;
import dinhthanhloc.mapper.DeTaiMapper;
import dinhthanhloc.model.DetaiEntity;

public class DeTaiDAO extends AbstractDAO<DetaiEntity> implements IDeTai {
	public static DeTaiDAO getInstance() {
		return new DeTaiDAO();
	}
	@Override
	public DetaiEntity findOne(Long MaDeTai) {
		String sql = "SELECT * FROM detai WHERE MaDeTai = ?";
		List<DetaiEntity> detai = query(sql, new DeTaiMapper(), MaDeTai);
		return detai.isEmpty() ? null : detai.get(0);
	}

	@Override
	public Long save(DetaiEntity newDeTai) {
		StringBuilder sql = new StringBuilder("INSERT INTO detai (TenDeTai,");
		sql.append(" MaGiangVien, MaNhom, MaNganh, MaTrangThai)");
		sql.append(" VALUES(?, ?, ?, ?, ?)");
		return insert(sql.toString(), newDeTai.getTenDeTai(), newDeTai.getMaGiangVien(), newDeTai.getMaNhom(),
				newDeTai.getMaNganh(), newDeTai.getMaTrangThai());
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
	public List<DetaiEntity> findAll() {
		String sql = "SELECT * FROM detai";
		return query(sql, new DeTaiMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM detai";
		return count(sql);
	}
	@Override
	public List<DetaiEntity> findByTrangThai(int MaTrangThai) {
		String sql = "SELECT * FROM detai WHERE MaTrangThai = ?";
		return query(sql, new DeTaiMapper(), MaTrangThai);
		
	}

}
