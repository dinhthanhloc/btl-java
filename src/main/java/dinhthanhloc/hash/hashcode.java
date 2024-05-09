package dinhthanhloc.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hashcode {
	public static hashcode getInstance() {
		return new hashcode();
	}

	public String hashMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");

			md.update(input.getBytes());

			byte[] hashBytes = md.digest();

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
			return null;
		}
	}
}
