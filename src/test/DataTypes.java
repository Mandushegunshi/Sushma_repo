package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		// ----------Data types in java--------
		
		int num1;
		int num2;
		
		num1=10;
		num2=2;
		float div = num1/num2;
		
		int mul=num1*num2;
		
		System.out.println("multipication: " +mul);
		System.out.println("Division: " +div);
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Enter the name of Scanner");
		
		String name = scanner.next();
		
		System.out.println("Hello: " +name);
		
		System.out.println("Length: "+name.length());
		
		System.out.println("Uppercase: "+name.toUpperCase());*/
		
		// -------Arrays-------
		
		/*int myarray[] = {23,45,6,7};
		
		System.out.println("First array: " + myarray[0]);*/
		
		
		//------String Array-----
		
           String myarray[] = {"Sush","Sushma","Alwa","Jaya"};
		
		System.out.println("First array: " + myarray[2]);
		
		

	}

}
