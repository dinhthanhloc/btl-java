package dinhthanhloc.test;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class testJDBC {

    public static String hashMD5(String input) {
        try {
            // Tạo một đối tượng MessageDigest với thuật toán MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Cập nhật bộ đệm với dữ liệu nhập vào
            md.update(input.getBytes());
            
            // Lấy giá trị băm (hash) từ bộ đệm
            byte[] hashBytes = md.digest();
            
            // Chuyển đổi byte thành dạng hex string
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xff & hashByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Xử lý nếu thuật toán không tồn tại
            return null;
        }
    }

    public static void main(String[] args) {
        String input = "123456"; // Chuỗi cần mã hóa
        String hashed = hashMD5(input); // Mã hóa chuỗi
        System.out.println("MD5 Hash: " + hashed);
    }
}
