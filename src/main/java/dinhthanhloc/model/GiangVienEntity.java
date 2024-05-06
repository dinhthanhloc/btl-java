package dinhthanhloc.model;

public class GiangVienEntity {
	
	private String MaGiangVien;
	private String TenGiangVien;
	private int MaKhoa;
	private int MaTaiKhoan;
	private String TrinhDo;


	public String getMaGiangVien() {
		return MaGiangVien;
	}

	public void setMaGiangVien(String maGiangVien) {
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
