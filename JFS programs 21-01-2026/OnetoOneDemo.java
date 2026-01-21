// Write a program to store n persons passport details and print any given person id name passport number and nationality. 
import java.util.*;
class Passport{
	int passportNo;
	String nationality;
	Passport(int passportNo, String nationality){
		this.passportNo = passportNo;
		this.nationality = nationality;
	}
}
class Person{
	int id;
	String name;
	Passport pass; //One-to-One mapping
	Person(int id, String name, Passport p){
		this.id=id;
		this.name=name;
		this.pass=p;
	}
}
public class OnetoOneDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Passport p;
		Person m[];
		int n;
		n=3;
		m=new Person[n];
		for(int i=0;i<n;i++){
			p=new Passport(1000+i,"Indian");
			System.out.println("Enter id of person");
			int id=sc.nextInt();
			System.out.println("Enter Name of person");
			String name=sc.next();
			m[i]=new Person(id,name,p);
		}
		System.out.println("Enter id (0 to"+(n-1)+ ")" );
		int k;
		k=sc.nextInt();
		System.out.println("Name :"+m[k].name);
		System.out.println("Passport no. :"+m[k].pass.passportNo);
		System.out.println("Nationality :"+m[k].pass.nationality);
	}
}