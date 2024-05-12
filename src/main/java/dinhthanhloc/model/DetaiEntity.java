 package dinhthanhloc.model;


public class DetaiEntity extends AbstractEntity<DetaiEntity>{

	private int MaDeTai;
	private String TenDeTai;
	private String MaGiangVien;
	private int MaNhom;
	private int MaNganh;
	private int MaTrangThai;
	private double KetQua;

	public long getMaDeTai() {
		return MaDeTai;
	}
	
	public void setMaDeTai(int maDeTai) {
		MaDeTai = maDeTai;
	}

	public String getTenDeTai() {
		return TenDeTai;
	}

	public void setTenDeTai(String tenDeTai) {
		TenDeTai = tenDeTai;
	}


	public String getMaGiangVien() {
		return MaGiangVien;
	}

	public void setMaGiangVien(String maGiangVien) {
		MaGiangVien = maGiangVien;
	}

	public long getMaNhom() {
		return MaNhom;
	}

	public void setMaNhom(int maNhom) {
		MaNhom = maNhom;
	}

	public long getMaNganh() {
		return MaNganh;
	}

	public void setMaNganh(int maNganh) {
		MaNganh = maNganh;
	}

	public long getMaTrangThai() {
		return MaTrangThai;
	}

	public void setMaTrangThai(int maTrangThai) {
		MaTrangThai = maTrangThai;
	}

	public double getKetQua() {
		return KetQua;
	}

	public void setKetQua(double ketQua) {
		KetQua = ketQua;
	}

	public DetaiEntity(String tenDeTai, String maGiangVien, int maNhom, int maNganh, int maTrangThai) {
		super();
		TenDeTai = tenDeTai;
		MaGiangVien = maGiangVien;
		MaNhom = maNhom;
		MaNganh = maNganh;
		MaTrangThai = maTrangThai;
	}

	public DetaiEntity() {
		super();
	}
	

}
