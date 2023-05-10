 package org.java.main;

import org.java.inheritance.Prodotto;
import org.java.inheritance.Headphone;
import org.java.inheritance.Smarthpone;
import org.java.inheritance.Tv;

public class main {

	public static void main(String[] args) {
		Prodotto p1 = new Prodotto(382838238,"Ciao","bella",39,22);
		System.out.println(p1);
		
		
		
		Smarthpone s1 = new Smarthpone(7767457,"tel1","samsung",150,22,"gbguijing",256);
		System.out.println(s1);
		
		Headphone h1 = new Headphone(77674,"tel1","samsung",150,22,"red",true);
		System.out.println(h1);

		Tv t1 = new Tv(77674,"tv1","samsung",150,22,"big",true);
		System.out.println(t1);
	}

}
