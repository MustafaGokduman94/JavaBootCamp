package ManavApp;

import java.util.Scanner;

public class ManavMain {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double alim=0;
		Musteri m1=new Musteri("Mevlüt");
		//elma-13.90, armut-18.65,muz- 35,çilek - 25, kiraz -45
		Fruits[] meyveler=new Fruits[5];
		meyveler[0]=new Fruits("Elma",13.90,50);
		meyveler[1]=new Fruits("Armut",18.65,25);
		meyveler[2]=new Fruits("Muz",35.0,50);
		meyveler[3]=new Fruits("Çilek",25.0,50);
		meyveler[4]=new Fruits("Kiraz",45.0,10);
		
		for(int i=0;i<meyveler.length;i++) {
			System.out.println(m1.getAd()+" - "+meyveler[i].getAd()+
					" meyvesinden kaç kilo istiyorsun?\nStok: "	+meyveler[i].getStok()				);
			alim=scn.nextDouble();
			meyveler[i].setAlimMiktari(alim);
			m1.borcTopla(meyveler[i].borcGoster());
			meyveler[i].stokGuncelle(alim);
			System.out.println("Kalan Miktar: "+meyveler[i].getStok());
		}
		System.out.println(m1.getAd()+" toplam ödeme miktarın: "+m1.getToplamBorc());
		
		
		

	}

}
