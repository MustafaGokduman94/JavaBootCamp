
import java.util.Scanner;

public class ATM {
	static Scanner scn = new Scanner(System.in);
	static double güncelbakiye = 5000;
	static double kreditutarı = 0;
	static double krediborcu = kreditutarı * 1.5;

	public static void main(String[] args) {
		System.out.println("kullanıcı adı giriniz");
		String kullanıcı = scn.next();
		System.out.println("parola giriniz");
		String kullanıcıparola = scn.next();
		UserControll(kullanıcı, kullanıcıparola);

	}

	public static void UserControll(String kullanıcılar, String parola) {
		String[] users = { "mustafa" };
		String[] password = { "1234" };
		String controlUser = kullanıcılar;
		String controlPassw = parola;
		boolean giriş = false;
		for (int i = 0; i < users.length; i++) {

			if (users[i].equals(controlUser) && password[i].equals(controlPassw)) {
				giriş = true;
				;

			} else {

				giriş = false;

			}

		}
		if (giriş) {
			System.out.println("giriş başarılı");
			Bankamatik();

		} else {
			System.out.println("giriş başarısız");
		}

	}

	public static double Bankamatik() {
		System.out.println("Yapmak isteğiniz işlemi seçiniz");
		System.out.println("[1]- Para çek");
		System.out.println("[2]- Para yatır");
		System.out.println("[3]- Kredi Sorgula");
		System.out.println("[4]- Kredi borcu öde");
		System.out.println("[5]- Kredi Çek");

		int islem = scn.nextInt();
		switch (islem) {

		case 1: {
			System.out.println("Kalan Güncel Bakiye " + güncelbakiye);
			paraÇek();

			break;

		}
		case 2: {
			System.out.println("Güncel bakiye tutarı " + güncelbakiye);
			paraYatır();
			break;
		}
		case 3: {
			System.out.println("Kredi Sorgula");
			krediSorgula();
			break;
		}
		case 4: {
			System.out.println("kredi borcu öde " + krediborcu);

			krediborcuöde();

			break;
		}
		case 5: {
			System.out.println("Kredi Çek");
			
			krediÇek();
			System.out.println("güncel bakiyeniz "+ güncelbakiye+"güncel kredi borcunuz "+ krediborcu);

			break;
		}
		case 6: {
			System.out.println("Çıkış işlemi yapmak için tıklayınız");
			break;
		}

		default:
			System.out.println("Geçersiz işlem");
		}
		return Bankamatik();

	}

	static double paraÇek() {
		System.out.println("Çekmek istediğiniz miktarı yazınız");
		double paraçekmetutarı = scn.nextDouble();
		if (paraçekmetutarı < 5000) {
			System.out.println("işlem başarılı" + "Çekilen tutar =>>> " + paraçekmetutarı);
			

		} else {
			System.out.println("Bakiye Yeterisz");

		}

		return güncelbakiye = güncelbakiye - paraçekmetutarı;

	}

	static double paraYatır() {
		System.out.println("Yatırmak istediğiniz miktarı yazınız ");
		double parayatırmatutarı = scn.nextDouble();
		if (parayatırmatutarı > 0) {
			System.out.println("işlem başarılı" + "Yatırılan tutar =>>> " + parayatırmatutarı);

		} else {
			System.out.println("Geçerli bir tutar giriniz");

		}

		return güncelbakiye = güncelbakiye + parayatırmatutarı;
	}

	static double krediSorgula() {
		System.out.println("Sorgulamak İstediğiniz kredi tutarını yazınız ");
		double sorgulanmakistenilenkreditutarı = scn.nextDouble();
		if (güncelbakiye * 10 > sorgulanmakistenilenkreditutarı) {
			System.out
					.println("Kredi için çekilmek istenilen tutar " + sorgulanmakistenilenkreditutarı + " çekilebilir");
			return Bankamatik();

		} else {
			System.out.println("En fazla güncel bakiyenizin 10 katı kredi isteyebilirsiniz!!");
		}
		return Bankamatik();

	}

	static double krediÇek() {

		System.out.println("Çekmek İstediğiniz kredi tutarını yazınız ");
		double çekmekistenilenkreditutarı = scn.nextDouble();

		if (güncelbakiye * 10 > çekmekistenilenkreditutarı) {

			System.out.println("Kredi çekme tutarı " + çekmekistenilenkreditutarı);
			System.out.println("İşleme devam etmek İstiyor musunuz ? ");
			boolean krediçekmeonay = scn.nextBoolean();

			if (krediçekmeonay) {
				System.out.println("Çekllen kredi tutarı " + çekmekistenilenkreditutarı);
				güncelbakiye += çekmekistenilenkreditutarı;
				kreditutarı += çekmekistenilenkreditutarı;
				krediborcu = kreditutarı * 1.5;

				return Bankamatik();

			} else {
				System.out.println("kredi çekme işleminden vazgeçildi");
				return Bankamatik();

			}

		} else {

			System.out.println("İşlemden vazgeçildi ");

		}
		return Bankamatik();

	}

	static double krediborcuöde() {

		System.out.println("ödemek istediğiniz kredi borcunuzu yazınız ");
		double ödenecektutar = scn.nextDouble();
		
		krediborcu-=ödenecektutar;
		güncelbakiye-=ödenecektutar;
		System.out.println("güncel bakiyeniz "+ güncelbakiye);
		return kreditutarı -= ödenecektutar;
		
	
	}

}
