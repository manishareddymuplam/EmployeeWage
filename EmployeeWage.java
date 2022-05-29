package com.employeewage;
import java.util.Random;
public class EmployeeWage {
	public static void main(String[]  args) {
		System.out.println("Welcom to Employee Wage Camputation Program");	
		Random random  = new Random();
		int attendance = random.nextInt(2);
		if(attendance == 1)
			System.out.println("Employee Present");
		else
			System.out.println("Employee Absent");
	}
}

