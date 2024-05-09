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

	public void setMaTaiKhoan(int maTaiKhoan) {
		MaTaiKhoan = maTaiKhoan;
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

	@Override
	public String toString() {
		return "TaiKhoanEntity [MaTaiKhoan=" + MaTaiKhoan + ", Username=" + Username + ", Password=" + Password
				+ ", Email=" + Email + ", HoTen=" + HoTen + ", MaLoaiTaiKhoan=" + MaLoaiTaiKhoan + "]";
	}

	public TaiKhoanEntity(String username, String password, String email, String hoTen, int maLoaiTaiKhoan) {
		super();
		Username = username;
		Password = password;
		Email = email;
		HoTen = hoTen;
		MaLoaiTaiKhoan = maLoaiTaiKhoan;
	}

	public TaiKhoanEntity() {
		super();
	}
	
	
}
