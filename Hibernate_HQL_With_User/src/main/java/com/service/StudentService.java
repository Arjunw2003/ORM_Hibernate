package com.service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	StudentDao dao = new StudentDao();

	public void InsertData(Student std) {

		dao.InsertData(std);

	}

	public void UpdateData(Student std) {

		dao.UpdateData(std);
	}

	public void deleteData(int id) {
		
		dao.deleteData(id); 
	}

	public void getSingleData(int id) {
		
		dao.getSingleData(id); 
		
	}

	public void getAllData() {

		dao.getAllData();
		
	}
}
