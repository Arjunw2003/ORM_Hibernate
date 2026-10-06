package com.cotroller;

import com.pojo.Student;
import com.service.CrudOpService;

public class CrudOpController {

	public static void main(String[] args) {

		CrudOpService service = new CrudOpService();
		Student std = new Student();

//		service.insertData();
//		service.updateData();
//		service.deleteData();
//		service.getSingleData();

//		std.setId(4);
//		std.setName("Kiran");
//		std.setAge(24);
//		std.setCity("Jalna");
//		std.setGender("Male");
//		service.insertData(std);

//		std.setId(4);
//		std.setName("Monika");
//		std.setAge(23);
//		std.setCity("Latur");
//		std.setGender("Female");
//		service.updateData(std);

//		std.setId(4);
//		service.deleteData(std);

		std.setId(2);
		service.getSingleData(std);

	}
}
