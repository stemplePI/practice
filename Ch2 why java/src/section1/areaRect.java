package section1;

import java.util.Scanner;

public class areaRect {

	public static void main(String[] args) {
		
		Scanner trace = new Scanner(System.in);
		double base;
		double height;
		
		//input data
		System.out.print("Enter base: ");
		base = trace.nextDouble();
		
		System.out.print("Enter height: ");
		height = trace.nextDouble();
		
		//calculate area
		double area = base * height;
		
		//output 
		
		System.out.print("Area of Rectangle = " + area);
		
		//first commit
		
		
		

	}

}
