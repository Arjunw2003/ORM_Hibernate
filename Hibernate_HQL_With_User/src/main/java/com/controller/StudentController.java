package com.controller;

import java.util.Scanner;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService service = new StudentService();

		Scanner sc = new Scanner(System.in);

//		Insert Data

		int choice;
		do {
			System.out.println("1.Insert Data");
			System.out.println("2.Update Data");
			System.out.println("3.Delete Data");
			System.out.println("4.GetSingle Data");
			System.out.println("5.GetAll Data");
			System.out.println("6.Exit");

			System.out.println("Enter Your Choice...");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Id: ");
				int iId = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Name: ");
				String iName = sc.nextLine();

				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter City: ");
				String iCity = sc.nextLine();

				Student std = new Student(iId, iName, age, iCity);

				service.InsertData(std);
				break;

			case 2:
				System.out.print("Enter Id: ");
				int uId = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Name: ");
				String uName = sc.nextLine();

				System.out.print("Enter Age: ");
				int uAage = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter City: ");
				String uCity = sc.nextLine();

				Student Ustd = new Student(uId, uName, uAage, uCity);

				service.UpdateData(Ustd);
				break;

			case 3:
				System.out.print("Enter Id: ");
				int did = sc.nextInt();
				service.deleteData(did);

			case 4:
				System.out.print("Enter Id: ");
				int gid = sc.nextInt();
				service.getSingleData(gid);

			case 5:
				service.getAllData();

			case 6:
				System.out.println("Thank You...");
				break;

			default:
				System.out.println("Enter Valid Number");
				break;
			}

		} while (choice != 6);

//		Update Data

	}
}
