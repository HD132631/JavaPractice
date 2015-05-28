/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 *  |_ Car
 *
 * 1. 개요
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * @author		:	천태건
 *
 * @version		:	1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getmaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public Car3(String newCompany, String newModel, String newColor, int newmaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newmaxSpeed;
		price = newPrice;
	}
	
	public Car3(String newCompany, String newModel, String newColor, int newmaxSpeed) {
		this(newCompany,newModel,newColor,newmaxSpeed,0);
	}
	
	public Car3(String newCompany, String newModel, String newColor) {
		this(newCompany, newModel, newColor,0);
	}
}
