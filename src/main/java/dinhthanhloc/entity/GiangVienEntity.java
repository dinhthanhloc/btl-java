package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giangvien")
public class GiangVienEntity {

	@Id
	@Column(name = "MaGiangVien")
	@OneToOne(mappedBy = "MaTrangThai", fetch = FetchType.LAZY)
	private long MaGiangVien; 
	@Column(name = "TenGiangVien")
	private String TenGiangVien;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKhoa", nullable = false)
	private int MaKhoa;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaTaiKhoan", nullable = false)
	private int MaTaiKhoan;
	@Column(name = "TrinhDo")
	private String TrinhDo;

	public long getMaGiangVien() {
		return MaGiangVien;
	}

	public void setMaGiangVien(long maGiangVien) {
		MaGiangVien = maGiangVien;
	}

	public String getTenGiangVien() {
		return TenGiangVien;
	}

	public void setTenGiangVien(String tenGiangVien) {
		TenGiangVien = tenGiangVien;
	}

	public int getMaKhoa() {
		return MaKhoa;
	}

	public void setMaKhoa(int maKhoa) {
		MaKhoa = maKhoa;
	}

	public int getMaTaiKhoan() {
		return MaTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		MaTaiKhoan = maTaiKhoan;
	}

	public String getTrinhDo() {
		return TrinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		TrinhDo = trinhDo;
	}

}
