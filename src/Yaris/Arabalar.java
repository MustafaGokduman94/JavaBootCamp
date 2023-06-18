package Yaris;

import java.util.Random;

public class Arabalar {
	private String model;
	private String marka;
	private int hız;
	private double kazayapmaolasiligi;
	private double mesafe;

	public Arabalar(String marka, String model, int hız, double kazayapmaolasiligi) {

		this.model = model;
		this.marka = marka;
		this.hız = hız;
		this.kazayapmaolasiligi = kazayapmaolasiligi;
		this.mesafe = 0;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getHız() {
		return hız;
	}

	public void setHız(int hız) {
		this.hız = hız;
	}

	public double getKazayapmaolasiligi() {
		return kazayapmaolasiligi;
	}

	public void setKazayapmaolasiligi(double kazayapmaolasiligi) {
		this.kazayapmaolasiligi = kazayapmaolasiligi;
	}

	public double getMesafe() {
		return mesafe;
	}

	public void setMesafe(double mesafe) {
		this.mesafe = mesafe;
	}

	public boolean kazayapmarmı() {
		Random rnd = new Random();
		double deger = rnd.nextDouble(100) - 1;
		return deger <= this.kazayapmaolasiligi;

	}

	public void dusme() {

		this.mesafe -= 50;

		if (this.mesafe < 0) {
			this.mesafe = 0;

		}

		System.out.println(marka + " " + model + " kaza yaptı! Mesafe düşüldü. Yeni mesafe: " + this.mesafe);

	}

	public void ilerle(int mesafe) {
		this.mesafe += mesafe;

		System.out.println(marka + " " + model + " aldığı mesafe: " + mesafe + " - Toplam mesafe: " + this.mesafe);

	}

}
