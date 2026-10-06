package com.service;

import com.dao.CrudOpDao;
import com.dao.DeleteData;
import com.dao.GetSingleData;
import com.dao.InsertData;
import com.dao.UpateData;
import com.pojo.Student;

public class CrudOpService {

	CrudOpDao crudOpDao = new CrudOpDao();

	public void insertData(Student std) {

//		InsertData data = new InsertData();
//		data.insertData();

		crudOpDao.insertData(std);

	}

	public void updateData(Student std) {

//		UpateData data = new UpateData();
//		data.updateData();

		crudOpDao.updateData(std);
	}

	public void deleteData(Student std) {
//		DeleteData data = new DeleteData();
//		data.deleteData();

		crudOpDao.deleteData(std);

	}

	public void getSingleData(Student std) {
//		GetSingleData data = new GetSingleData();
//		data.getSingleData();

		crudOpDao.getSingleData(std);

	}

}
