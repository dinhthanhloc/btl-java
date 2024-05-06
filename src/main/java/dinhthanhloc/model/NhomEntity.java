package dinhthanhloc.model;

public class NhomEntity {
	private int MaNhom;
	private String TenNhom;
	private String ThanhVien;
	
	public int getMaNhom() {
		return MaNhom;
	}
	public void setMaNhom(int maNhom) {
		MaNhom = maNhom;
	}
	public String getTenNhom() {
		return TenNhom;
	}
	public void setTenNhom(String tenNhom) {
		TenNhom = tenNhom;
	}
	public String getThanhVien() {
		return ThanhVien;
	}
	public void setThanhVien(String thanhVien) {
		ThanhVien = thanhVien;
	}
	@Override
	public String toString() {
		return "NhomEntity [MaNhom=" + MaNhom + ", TenNhom=" + TenNhom + ", ThanhVien=" + ThanhVien + "]";
	}
}
