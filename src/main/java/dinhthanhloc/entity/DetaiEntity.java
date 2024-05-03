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

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Entity
@Table(name = "detai")
public class DetaiEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaDeTai")
	private int MaDeTai;
	@Column(name = "TenDeTai", nullable = false)
	private String TenDeTai;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaGiangVien", nullable = false)
	private long MaGiangVien;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaNhom", nullable = false)
	private int MaNhom;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaNganh", nullable = false)
	private int MaNganh;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaTrangThai", nullable = false)
	private int MaTrangThai;
	@Column(name = "KetQua")
	private double KetQua;

	public long getMaDeTai() {
		return MaDeTai;
	}

	public String getTenDeTai() {
		return TenDeTai;
	}

	public void setTenDeTai(String tenDeTai) {
		TenDeTai = tenDeTai;
	}

	public long getMaGiangVien() {
		return MaGiangVien;
	}

	public void setMaGiangVien(long maGiangVien) {
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

}
