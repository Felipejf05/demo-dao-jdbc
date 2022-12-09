package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();// Dessa forma, o programa n�o conhece a implementa��o, ele conhece somente a interface.
		
		Seller seller = sellerDao.findById(3);
		
        System.out.println(seller);
        	
	}

}
