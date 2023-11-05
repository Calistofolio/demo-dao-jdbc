package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n Teste 2");
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n Teste 3");
		list = sellerDao.findAll();
			
		for(Seller obj : list) {
			System.out.println(obj);
		}
			
		System.out.println("\n teste 4");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("New id = " + newSeller.getId());
			
			System.out.println("\n teste 5");
			seller = sellerDao.findById(1);
			seller.setName("Martha Wayne");
			sellerDao.update(seller);
			System.out.println("Update completed");
	}

}
