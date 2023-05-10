package org.java.inheritance;

public class Headphone extends Prodotto{
	
	private String color;
	private boolean wireless;

	public Headphone(int code, String nome,String brand, int price, int iva, String color,boolean wireless) {
		super(code, nome,brand, price, iva);
		
		setColor(color);
		setWireless(wireless);
	}


	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public boolean isWireless() {
		return wireless;
	}



	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}



	@Override
	public String toString() {
		return "(S)" + getProductStr()
		+ "\ncolor:" + getColor()
		+"\nwireless:" + isWireless();
	}
	
	

}
