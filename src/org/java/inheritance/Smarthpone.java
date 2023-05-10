package org.java.inheritance;

public class Smarthpone extends Prodotto{
	
	private int imei;
	private int memory;

	public Smarthpone(int code, String nome, double price, int iva, int imei,int memory) {
		super(code, nome, price, iva);
		
		setImei(imei);
		setMemory(memory);
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
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
		return "[" + getImei() + "]"
		+"\n" + getMemory();
	}
	
	

}
