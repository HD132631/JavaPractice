/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *  |_ Snack
 *
 * 1. 개요
 * 2. 작성일 : 2015. 5. 28.
 * </pre>
 * @author		:	천태건
 *
 * @version		:	1.0
 */
public class Snack {
	private String Name;
	private String Company;
	private int Price;
	private int Number;
	
	public Snack(){}
	
	public Snack(String name, String company, int price, int number){
		this.Name = name;
		this.Company = company;
		this.Price = price;
		this.Number = number;
	}
		
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return Company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		Company = company;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return Price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		Price = price;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return Number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		Number = number;
	}

	public void printSnack() {
		System.out.println("이름 : " + Name);
		System.out.println("제조사 : " + Company);
		System.out.println("가격 : " + String.format("%,d", Price) + "원");
		System.out.println("개수 : " + Number + "개");
		System.out.println();
	}	
	
	public int calcPrice() {
		return Price*Number;
	}
}
