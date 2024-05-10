package dinhthanhloc.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dinhthanhloc.dao.imp.NganhDAO;
import dinhthanhloc.dao.imp.SinhVienDao;
import dinhthanhloc.dao.imp.TaiKhoanDAO;
import dinhthanhloc.hash.hashcode;
import dinhthanhloc.model.NganhEntity;
import dinhthanhloc.model.SinhVienEntity;
import dinhthanhloc.model.TaiKhoanEntity;

public class ReadFileCsv {

	public static void main(String[] args) {
		String csvFile = "D:\\java\\btl-java\\data.csv";
		File file = new File(csvFile);

		String line = "";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			line = br.readLine();
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				String fields[] = line.split(",");
				String hashPass = hashcode.getInstance().hashMD5(fields[0]);
				TaiKhoanEntity newTaiKhoan = new TaiKhoanEntity(fields[0], hashPass, "", fields[1], 1);
				TaiKhoanDAO.getInstance().save(newTaiKhoan);
				TaiKhoanEntity tk = TaiKhoanDAO.getInstance().findOneById(fields[0]);
				NganhEntity nganh = NganhDAO.getInstance().findOne(fields[4]);
				if (tk != null && nganh != null) {
					SinhVienEntity newSinhVien = new SinhVienEntity(fields[0], fields[1], fields[2], fields[3],
							(int) nganh.getMaNganh(), (int) tk.getMaTaiKhoan());
					SinhVienDao.getInstance().save(newSinhVien);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
