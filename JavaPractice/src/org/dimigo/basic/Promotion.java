package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int salary = 1700000;
		int eachEmployee = 3;
		int numOfStore = 1500;
		
		long totalEvgSalary = salary;
		totalEvgSalary *= 12;
		totalEvgSalary *= eachEmployee;
		totalEvgSalary *= numOfStore;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d",salary) + "원");
		System.out.println("점포 내 직원 수 : " + eachEmployee + "명");
		System.out.println("점포 수 : " + numOfStore + "개");
		System.out.println("");
		System.out.print("연간 인건비 : " + String.format("%,d", totalEvgSalary) + "원");
	}

}
