package org.java.inheritance;

public class Tv extends Prodotto{

	private String size;
	private boolean smart;
	
	public Tv(int code, String nome, String brand, int price, int iva,String size, boolean smart) {
		super(code, nome, brand, price, iva);
		
		
		setSize(size);
		setSmart(smart);
		
	
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return "(S)" + getProductStr()
		+ "\nsize:" + getSize()
		+"\nsmart:" + isSmart();
	}
	
}
