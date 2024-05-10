package dinhthanhloc.test;

import dinhthanhloc.dao.imp.GiangVienDAO;

public class testJDBC {

 

    public static void main(String[] args) {
        System.out.println(GiangVienDAO.getInstance().findOne((long)123456).getMaKhoa());
    }
}
