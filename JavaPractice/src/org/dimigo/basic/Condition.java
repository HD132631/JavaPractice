package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String car = "고속버스";
		int distance = 25;
		int money = 0;
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		
		
		switch(car) {
		case "고속버스":
			if(distance <= 10) money = 850;
			else money = 850 + (((distance)/10) * 300);
			break;
		case "경차":
			if(distance <= 10) money = 300;
			else money = 300 + (((distance)/10) * 200);
			break;
		default:
			if(distance <= 10) money = 600;
			else money = 600 + (((distance)/10) * 200);
			break;
		}
		
		System.out.println("통행료 : " + money + "원");

	}

}
