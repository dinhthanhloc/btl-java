package dinhthanhloc.model;

public class TaiKhoanEntity {
	private int MaTaiKhoan;
	private String Username;
	private String Password;
	private String Email;
	private String HoTen;
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
