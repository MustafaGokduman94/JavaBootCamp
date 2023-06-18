package Yaris;

public class Pistt {
	private int pistuzunluğu;

	public Pistt(int pistuzunluğu) {

		this.pistuzunluğu = pistuzunluğu;
	}

	public int getPistuzunluğu() {
		return pistuzunluğu;
	}

	public void setPistuzunluğu(int pistuzunluğu) {
		this.pistuzunluğu = pistuzunluğu;
	}

	public void yarısıbaslat(Arabalar araba1, Arabalar araba2) {
		Pistt pistt = new Pistt(1000);

		while (araba1.getMesafe() < pistt.getPistuzunluğu() && araba2.getMesafe() < pistt.getPistuzunluğu()) {
			int araba1Hız = araba1.getHız();
			araba1.ilerle(araba1Hız);
			int araba2Hız = araba2.getHız();
			araba2.ilerle(araba2Hız);

			if (araba1.kazayapmarmı()) {

				System.out.println(araba1.getMarka() + " " + araba1.getModel() + " Kaza yaptı!! ");
				araba1.dusme();
				System.out.println("<------------------------------------------->");

				if (araba2.kazayapmarmı()) {
					System.out.println(araba2.getMarka() + " " + araba2.getModel() + " Kaza yaptı!! ");
					araba2.dusme();
					System.out.println("<------------------------------------------->");

				}

			}

		}
		System.out.println("Yarış bitti");
		if (araba1.getMesafe() >= pistt.getPistuzunluğu() && araba2.getMesafe() >= pistuzunluğu) {
			System.out.println("Yarış berabere gitti");

		} else if (araba1.getMesafe() >= pistt.getPistuzunluğu() && araba2.getMesafe() <= pistt.getPistuzunluğu()) {
			System.out.println("Yarışı kazanan " + araba1.getMarka() + " " + araba1.getModel());

		} else {

			System.out.println("Yarışı kazanan " + araba2.getMarka() + " " + araba2.getModel());
		}

	}

}
