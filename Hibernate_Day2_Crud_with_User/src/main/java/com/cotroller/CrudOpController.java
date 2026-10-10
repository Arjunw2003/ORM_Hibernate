package com.cotroller;

import java.util.Scanner;

import com.pojo.Student;
import com.service.CrudOpService;

public class CrudOpController {

	public static void main(String[] args) {

		CrudOpService service = new CrudOpService();
//		Student std = new Student();

//		service.insertData();
//		service.updateData();
//		service.deleteData();
//		service.getSingleData();

		Scanner sc = new Scanner(System.in);

//		Insertion Data

//		System.out.print("Enter Id: ");
//		int id = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("Enter Name: ");
//		String name = sc.nextLine();
//
//		System.out.print("Enter Age: ");
//		int age = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("Enter city: ");
//		String city = sc.nextLine();
//
//		System.out.print("Enter Gender: ");
//		String gender = sc.nextLine();
//
//		Student s = new Student(id, name, age, city, gender);
//		service.insertData(s);

//		Upadate Data

//		System.out.print("Enter Id: ");
//		int id = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("Enter Name: ");
//		String name = sc.nextLine();
//
//		System.out.print("Enter Age: ");
//		int age = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("Enter city: ");
//		String city = sc.nextLine();
//
//		System.out.print("Enter Gender: ");
//		String gender = sc.nextLine();
//
//		Student s = new Student(id, name, age, city, gender);
//		service.updateData(s);

//		Delete Data

//		System.out.print("Enter Id: ");
//		int id = sc.nextInt();
//		Student std = new Student();		
//		std.setId(id);
//		service.deleteData(std);

//		getSingleData Data

//		System.out.print("Enter Id: ");
//		int id = sc.nextInt();
//		Student std = new Student();		
//		std.setId(id);
//		service.getSingleData(std);

//		getAllData

//		service.getAllData();

		int choice;
		do {
			System.out.println("1.Insert Data ");
			System.out.println("2.Update Data ");
			System.out.println("3.Delete Data ");
			System.out.println("4.GetSingle Data ");
			System.out.println("5.Get All Data ");
			System.out.println("6.Exist ");
			System.out.println("Enter your choice..");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Id: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter city: ");
				String city = sc.nextLine();

				System.out.print("Enter Gender: ");
				String gender = sc.nextLine();

				Student s = new Student(id, name, age, city, gender);
				service.insertData(s);
				break;

			case 2:
				System.out.print("Enter Id: ");
				int uid = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Name: ");
				String uname = sc.nextLine();

				System.out.print("Enter Age: ");
				int uage = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter city: ");
				String ucity = sc.nextLine();

				System.out.print("Enter Gender: ");
				String ugender = sc.nextLine();

				Student us = new Student(uid, uname, uage, ucity, ugender);
				service.updateData(us);

			case 3:
				System.out.print("Enter Id: ");
				int did = sc.nextInt();

				service.deleteData(did);

			case 4:
				System.out.print("Enter Id: ");
				int sid = sc.nextInt();

				service.getSingleData(sid);

			case 5:

				service.getAllData();

			case 6:

				System.err.println("Thank You");

			default:
				System.out.println("Enter Valid No....");
				break;
			}

		} while (choice != 6);

	}

}
