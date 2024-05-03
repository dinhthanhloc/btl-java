package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class TaiKhoanEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaTaiKhoan")
	@OneToOne(mappedBy = "MaTaiKhoan", fetch = FetchType.LAZY)
	private int MaTaiKhoan;
	@Column(name = "Username", nullable = false)
	private String Username;
	@Column(name = "Password", nullable = false)
	private String Password;
	@Column(name = "Email")
	private String Email;
	@Column(name = "HoTen")
	private String HoTen;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLoaiTaiKhoan", nullable = false)
	private int MaLoaiTaiKhoan;

	public int getMaTaiKhoan() {
		return MaTaiKhoan;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public int getMaLoaiTaiKhoan() {
		return MaLoaiTaiKhoan;
	}

	public void setMaLoaiTaiKhoan(int maLoaiTaiKhoan) {
		MaLoaiTaiKhoan = maLoaiTaiKhoan;
	}
}
