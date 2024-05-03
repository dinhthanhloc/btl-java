package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="khoa")
public class KhoaEntity {
	@Id
	/*@Column(name = "MaKhoa")
	@OneToOne(mappedBy = "MaKhoa", fetch = FetchType.LAZY)*/
	private int MaKhoa;
	@Column(name = "TenKhoa", nullable = false)
	private String TenKhoa;
	public int getMaKhoa() {
		return MaKhoa;
	}
	public void setMaKhoa(int maKhoa) {
		MaKhoa = maKhoa;
	}
	public String getTenKhoa() {
		return TenKhoa;
	}
	public void setTenKhoa(String tenKhoa) {
		TenKhoa = tenKhoa;
	}
	
	
}
