package dinhthanhloc.test;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFileCreator {
	public static void main(String[] args) {
		// Đường dẫn tới file CSV cần tạo
		String csvFile = "data.csv";

		try {
			// Tạo một đối tượng FileWriter để ghi dữ liệu vào file CSV
			FileWriter writer = new FileWriter(csvFile);

			// Viết dữ liệu vào file CSV
			writer.append("Mã Sinh Viên, Họ Và Tên, Lớp, Niên Khóa, Ngành \n");
			writer.append("221230909,Đinh Thành Lộc,CNTT2,K63,Công Nghệ Thông Tin\n");
			writer.append("221230996,Nguyễn Đức Thắng,CNTT2,K63,Công Nghệ Thông Tin\n");
			writer.append("221230898,abvc,CNTT2,K63,Công Nghệ Thông Tin\n");

			// Đóng FileWriter sau khi đã ghi dữ liệu
			writer.flush();
			writer.close();

			System.out.println("CSV file created successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
