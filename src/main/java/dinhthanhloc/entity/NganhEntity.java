package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nganh")
public class NganhEntity {
	@Id
	@Column(name = "MaNganh")
	@OneToOne(mappedBy = "MaNganh", fetch = FetchType.LAZY)
	private int MaNganh;
	@Column(name = "TenNganh", nullable = false)
	private String TenNganh;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKhoa", nullable = false)
	private int MaKhoa;

	public int getMaNganh() {
		return MaNganh;
	}

	public void setMaNganh(int maNganh) {
		MaNganh = maNganh;
	}

	public String getTenNganh() {
		return TenNganh;
	}

	public void setTenNganh(String tenNganh) {
		TenNganh = tenNganh;
	}

	public int getMaKhoa() {
		return MaKhoa;
	}

	public void setMaKhoa(int maKhoa) {
		MaKhoa = maKhoa;
	}

}
