package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loaitaikhoan")
public class LoaiTaiKhoanEntity {
	@Id
	@Column(name = "MaLoaiTaiKhoan")
	@OneToOne(mappedBy = "MaLoaiTaiKhoan", fetch = FetchType.LAZY)
	private int MaLoaiTaiKhoan;
	@Column(name = "TenLoaiTaiKhoan", nullable = false)
	private String TenLoaiTaiKhoan;

	public int getMaLoaiTaiKhoan() {
		return MaLoaiTaiKhoan;
	}

	public void setMaLoaiTaiKhoan(int maLoaiTaiKhoan) {
		MaLoaiTaiKhoan = maLoaiTaiKhoan;
	}

	public String getTenLoaiTaiKhoan() {
		return TenLoaiTaiKhoan;
	}

	public void setTenLoaiTaiKhoan(String tenLoaiTaiKhoan) {
		TenLoaiTaiKhoan = tenLoaiTaiKhoan;
	}
}
