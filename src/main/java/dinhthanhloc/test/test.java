package dinhthanhloc.test;


import dinhthanhloc.dao.imp.NhomDAO;
import dinhthanhloc.model.NhomEntity;

public class test {
	public static void main(String[] args) {
		NhomEntity nhom = NhomDAO.getInstance().findAll(null);
		for (NhomEntity san_pham : nhom) {
			System.out.println(san_pham.toString());
		}
	}
}
