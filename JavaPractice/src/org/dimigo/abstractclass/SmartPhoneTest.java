/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *<pre>
 * org.dimigo.inheritance
 *  |_ SmartPhoneTest
 *
 * 1. 개요
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * @author		:	천태건
 *
 * @version		:	1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] phones = {
					new IPhone("iPhone 6", "애플", 700000),
					new Galaxy("Galaxy S6", "삼성", 650000)
		};
		
		for(SmartPhone p : phones) {
			System.out.println(p);
			p.turnOn();
			p.pay();
			
			p.useSpecialFunction();
			
			p.turnOff();
			System.out.println();
		}
		
	}

}
