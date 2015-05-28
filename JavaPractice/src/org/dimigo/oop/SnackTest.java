/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *  |_ SnackTest
 *
 * 1. 개요
 * 2. 작성일 : 2015. 5. 28.
 * </pre>
 * @author		:	천태건
 *
 * @version		:	1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] s = new Snack[3];
		
		s[0] = new Snack("새우깡", "농심", 1100, 2);
		s[1] = new Snack("콘칲", "크라운", 1200, 1);
		s[2] = new Snack("허니버터칩", "해태", 1500, 4);
		
		for(Snack value : s){
			value.printSnack();
		}
		int totalPrice = s[0].calcPrice()+s[1].calcPrice()+s[2].calcPrice();
		System.out.println("총 구매 금액 : " + String.format("%,d", totalPrice) + "원");
	}

}
