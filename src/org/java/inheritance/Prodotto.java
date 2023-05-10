package org.java.inheritance;

import java.util.Random;

public class Prodotto {
	private int code;
	private String nome;
	private String brand;
	private int price;
	private int iva;

	public Prodotto(int code, String nome,String brand, int price, int iva) {
		
		Random rnd = new Random();
		code=rnd.nextInt(99999999);
		
		setCode(code);
		setNome(nome);
		setBrand(brand);
		setPrice(price);
		setIva(iva);
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}
	
	public int getIvaPrice() {
		return price +(price*iva)/100;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	


	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	
	protected String getProductStr() {
		return "[" + getCode() + "]" + getNome()
		+"\n" + getPrice() + "(" + getIva() + "%)"
		+"\n" + getIvaPrice();
	}
	
	@Override
	public String toString() {
		return "(P)" + getProductStr();
	}
	
	
	
	
}
