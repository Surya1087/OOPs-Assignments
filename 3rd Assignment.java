import java.util.Scanner;

class Employee{

	String emp_name;

	int emp_id;

	String emp_address;

	String emp_mail;

	long emp_phno;

	void accept_emp_info() {

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter employee name:");

	emp_name=sc.nextLine();

	System.out.println("Enter employee ID:");

	emp_id=sc.nextInt();

	System.out.println("Enter employee address:");

	emp_address=sc.next();

	System.out.println("Enter employee ph.no:");

	emp_phno=sc.nextLong();

	System.out.println("Enter employee mail:");

	emp_mail=sc.next();

	}

	void display_emp_info() {

	System.out.println("Employee name:"+""+emp_name);

	System.out.println("Employee ID:"+""+emp_id);

	System.out.println("Employee ph.no:"+""+emp_phno);

	System.out.println("Employee address:"+""+emp_address);

	System.out.println("Employee mail:"+""+emp_mail);

	}

	void pay_slip() {

		float basic_pay;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter basic pay:");

		basic_pay=sc.nextFloat();

		float da=0.97f*basic_pay;

		float hra=0.1f*basic_pay;

		float pf=0.12f*basic_pay;

		float scfund=0.001f*basic_pay;

		float gross_pay=basic_pay+da+hra;

		float net_pay=gross_pay-pf-scfund;

		System.out.println("The gross salary is:"+gross_pay);

		System.out.println("The net salary is"+net_pay);

	}



	

	



}



class programer extends Employee{}

class teamlead extends Employee{}

class ass_project_manager extends Employee{}

class project_manager extends Employee{}



public class Emp {

	public static void main(String[] args) {

		int g;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Employee of choice:");

		System.out.println("1.Programmer");

		System.out.println("2.Team Lead");

		System.out.println("3.Assitant Project Manager");

		System.out.println("4.Project Manager");

		g=sc.nextInt();

		switch (g)

		{

		case 1:

		programer p=new programer();

		p.accept_emp_info();

		System.out.println("---Displaying Details of Programmer---");

		p.display_emp_info();

		p.pay_slip();

		break;

		case 2:

		teamlead t=new teamlead();

		t.accept_emp_info();

		System.out.println("---Displaying Details of Team Lead---");

		t.display_emp_info();

		t.pay_slip();

		break;

		case 3:

		ass_project_manager a=new ass_project_manager();

		a.accept_emp_info();

		System.out.println("---Displaying Details of Assistant Project Manager---");

		a.display_emp_info();

		a.pay_slip();

		break;

		case 4:

		project_manager m=new  project_manager();

		m.accept_emp_info();

		System.out.println("---Displaying Details of Project Manager---");

		m.display_emp_info();

		m.pay_slip();

		break;

		default:

		System.out.println("Invalid");

		break;

		}

		}

	}