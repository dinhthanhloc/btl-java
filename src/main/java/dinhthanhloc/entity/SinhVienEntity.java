package dinhthanhloc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVienEntity {
	@Id
	@Column(name = "MaSinhVien")
	private String MaSinhVien;
	@Column(name = "HoTen")
	private String HoTen;
	@Column(name = "Lop")
	private String Lop;
	@Column(name = "NienKhoa")
	private String NienKhoa;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaNganh", nullable = false)
	private int MaNganh;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaTaiKhoan", nullable = false)
	private int MaTaiKhoan;

	public String getMaSinhVien() {
		return MaSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		MaSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public String getNienKhoa() {
		return NienKhoa;
	}

	public void setNienKhoa(String nienKhoa) {
		NienKhoa = nienKhoa;
	}

	public int getMaNganh() {
		return MaNganh;
	}

	public void setMaNganh(int maNganh) {
		MaNganh = maNganh;
	}

	public int getMaTaiKhoan() {
		return MaTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		MaTaiKhoan = maTaiKhoan;
	}

}
