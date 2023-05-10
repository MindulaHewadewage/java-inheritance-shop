package org.java.inheritance;

public class Smarthpone extends Prodotto{
	
	private String imei;
	private int memory;

	public Smarthpone(int code, String nome,String brand, int price, int iva, String imei,int memory) {
		super(code, nome,brand, price, iva);
		
		setImei(imei);
		setMemory(memory);
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return "(S)" + getProductStr()
		+ "\nimei:" + getImei()
		+"\nmemory:" + getMemory();
	}
	
	

}
