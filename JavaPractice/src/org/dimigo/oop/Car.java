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
public class Car {
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
	
	public void setCompany(String carCompany) {
		company = carCompany;
	}
	
	public void setModel(String carModel) {
		model = carModel;
	}
	
	public void setColor(String carColor) {
		color = carColor;
	}
	
	public void setMaxspeed(int carmaxSpeed) {
		maxSpeed = carmaxSpeed;
	}
	
	public void setPrice(int carPrice) {
		price = carPrice;
	}

}
