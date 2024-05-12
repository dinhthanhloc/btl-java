package dinhthanhloc.test;

import dinhthanhloc.dao.imp.DeTaiDAO;
import dinhthanhloc.dao.imp.NhomDAO;
import dinhthanhloc.model.DetaiEntity;
import dinhthanhloc.model.NhomEntity;

public class testJDBC {

 

    public static void main(String[] args) {
        NhomEntity detai = new NhomEntity("112", "123456");
        NhomDAO.getInstance().save(detai);
        
    }
}
