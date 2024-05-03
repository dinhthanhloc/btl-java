package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nhom")
public class NhomEntity {
	@Id
	@Column(name = "MaNhom")
	@OneToOne(mappedBy = "MaNhom", fetch = FetchType.LAZY)
	private int MaNhom;
	@Column(name = "TenNhom")
	private String TenNganh;
	@Column(name = "ThanhVien", nullable = false)
	private String ThanhVien;
	public int getMaNhom() {
		return MaNhom;
	}
	public void setMaNhom(int maNhom) {
		MaNhom = maNhom;
	}
	public String getTenNganh() {
		return TenNganh;
	}
	public void setTenNganh(String tenNganh) {
		TenNganh = tenNganh;
	}
	public String getThanhVien() {
		return ThanhVien;
	}
	public void setThanhVien(String thanhVien) {
		ThanhVien = thanhVien;
	}
}
