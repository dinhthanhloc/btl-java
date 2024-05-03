package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class TrangThaiEntity {
	@Id
	@Column(name = "MaTaiKhoan")
	@OneToOne(mappedBy = "MaTrangThai", fetch = FetchType.LAZY)
	private int MaTrangThai;
	@Column(name = "TenTrangThai", nullable = false)
	private String TenTrangThai;

	public int getMaTrangThai() {
		return MaTrangThai;
	}

	public void setMaTrangThai(int maTrangThai) {
		MaTrangThai = maTrangThai;
	}

	public String getTenTrangThai() {
		return TenTrangThai;
	}

	public void setTenTrangThai(String tenTrangThai) {
		TenTrangThai = tenTrangThai;
	}
}
