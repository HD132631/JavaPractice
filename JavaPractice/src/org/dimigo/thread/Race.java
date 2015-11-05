/**
 * 
 */
package org.dimigo.thread;

/**
 *<pre>
 * org.dimigo.thread
 *  |_ Race
 *
 * 1. 개요
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 * @author		:	천태건
 *
 * @version		:	1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Main Thread Start");
		System.out.println();
		
		Thread r1 = new Runner("우사인 볼트");
		
		Thread r2 = new Runner("빌 게이츠");
		
		// MAX_PRIORITY(10), NORM_PRIORITY(5), MIN_PRIORITY(1)
		// 우선순위가 높은 스레드가 실행 기회를 더 많이 가진다.
		
		r1.setPriority(Thread.MIN_PRIORITY);
		r2.setPriority(Thread.MAX_PRIORITY);
		
		
		r1.start();
		r2.start();
		
		System.out.println("Main Thread End");
	}

}
