package org.java.inheritance;

import java.util.Random;

public class Prodotto {
	private int code;
	private String nome;
	private double price;
	private int iva;

	public Prodotto(int code, String nome, double price, int iva) {
		
		Random rnd = new Random();
		code=rnd.nextInt(99999999);
		
		setCode(code);
		setNome(nome);
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

	public double getPrice() {
		return price;
	}
	
	public double getIvaPrice() {
		return price +(price*iva)/100;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	


	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	
	
	@Override
	public String toString() {
		return "[" + getCode() + "]" + getNome()
		+"\n" + getPrice() + "(" + getIva() + "%)"
		+"\n" + getIvaPrice();
	}
	
	
	
	
}
