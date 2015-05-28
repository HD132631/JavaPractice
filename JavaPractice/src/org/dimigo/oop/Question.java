/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;
/**
 *<pre>
 * org.dimigo.oop
 *  |_ Question
 *
 * 1. 개요 : 실습과제 8번째
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 * @author		:	천태건
 *
 * @version		:	1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("가장 좋아하는 가수는?");
		String ans1 = s.nextLine();
		if("김광석".equals(ans1))
			System.out.println("정답");
		else System.out.println("오답");
		System.out.println();
		
		System.out.println("가장 좋아하는 게임은?");
		String ans2 = s.nextLine();
		if("하스스톤".equals(ans2))
			System.out.println("정답");
		else System.out.println("오답");
		System.out.println("");
		
		System.out.println("가장 좋아하는 축구선수?");
		String ans3 = s.nextLine();
		if("벤테케".equals(ans3))
			System.out.println("정답");
		else System.out.println("오답");
		
		s.close();
	}

}
