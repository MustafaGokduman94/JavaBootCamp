package MatchApp;

import java.util.Random;

public class Boksor {
	private String ad;
	private int siklet;
	private int guc;
	private int saglik;
	private double kacinma;
	
	public Boksor(String ad, int siklet, int guc, int saglik, double kacinma) {		
		this.ad = ad;
		this.siklet = siklet;
		this.guc = guc;
		this.saglik = saglik;
		this.kacinma = kacinma;
	}
	
	
	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getSiklet() {
		return siklet;
	}


	public void setSiklet(int siklet) {
		this.siklet = siklet;
	}


	public int getGuc() {
		return guc;
	}


	public void setGuc(int guc) {
		this.guc = guc;
	}


	public int getSaglik() {
		return saglik;
	}


	public void setSaglik(int saglik) {
		this.saglik = saglik;
	}


	public double getKacinma() {
		return kacinma;
	}


	public void setKacinma(double kacinma) {
		this.kacinma = kacinma;
	}


	public int vurus(Boksor rakip) {
		System.out.println(">>>----<<<");
		System.out.println(this.ad+"=>"
		+rakip.ad+" "+this.guc+" hasar vurdu");
		if(rakip.kacinma()) {
			System.out.println(rakip.ad+" gelen hasardan kaçındı");
			return rakip.saglik;
		}
		if(rakip.saglik-this.guc<0) {
			return 0;
		}
		
		return rakip.saglik-this.guc;
	}
	public boolean kacinma() {
		Random rnd=new Random();
		double deger=rnd.nextDouble(100)-1;
		
		return deger <=this.kacinma;
	}

}
