package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
		
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n 2");
		
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n 3");
		
		dep = departmentDao.findById(4);
		dep.setName("Lua");
	}

}
