package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a1 = 9, b = 10, a2 = 9;
		double h1 = 5.8, h2 = 5.4;
		
		double w1 = ((a1 + b) * h1)/2;
		double w2 = (a2 * h2);
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + w1);
		System.out.println("평행사변형 넓이 : " + w2);
		
		boolean flag;
		
		if(w1 > w2) flag = true;
		else flag = false;
		
		if(flag) System.out.println("사다리꼴이 평행사변형 보다 " + (w1 - w2) + " 더 큽니다");
		else System.out.println("평행사변형이 사다리꼴 보다 " + (w2 - w1) + "더 큽니다");
	}

}
