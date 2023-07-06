import java.util.Scanner;

public class ToolStore extends NormalLocation {
	Scanner scan = new Scanner(System.in);

	public ToolStore(Player player) {
		super(player, " Mağaza");

	}

	public boolean getLocation() {
		System.out.println(" Para : " + player.getMoney());
		System.out.println("1.Silahlarr");
		System.out.println("2.Zırhlar");
		System.out.println("3.Çıkış");
		System.out.print("Seçiniz : ");
		int selTool = scan.nextInt();
		int selItemID;
		switch (selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);

			break;
		case 2:
			selItemID = armorMenu();
			buyArmor(selItemID);
			break;
		case 3:
			break;

		default:
			break;
		}

		return true;

	}

	public int weaponMenu() {
		System.out.println(" 1. Tabanca   Para : 25  - Hasar : 2 ");
		System.out.println(" 2. Kılıç     Para : 35  - Hasar : 3 ");
		System.out.println(" 3. Türef     Para : 45  - Hasar : 7 ");
		System.out.println(" 4. Çıkış ");
		System.out.print(" Silah seçiniz : ");
		int selWeaponID = scan.nextInt();
		return selWeaponID;

	}

	public void buyWeapon(int itemID) {
		int damage = 0;
		int price = 0;

		String wName = null;
		switch (itemID) {
		case 1:
			damage = 2;
			wName = " Tabanca ";
			price = 5;
			break;
		case 2:
			damage = 5;
			wName = " kılıç ";
			price = 35;
			break;
		case 3:
			damage = 7;
			wName = " Tüfek ";
			price = 45;
			break;
		case 4:
			System.out.println(" Çıkış yapılıyor ");
			break;
		default:
			System.out.println(" Geçersiz işlem");
		}
		if (price > 0) {
			if (player.getMoney() > price) {

				player.getInv().setDamage(damage);
				player.getInv().setWname(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println(wName + " satın aldınız , Eski hasarınız : " + player.getDamage()
						+ " Yeni Hasarınız : " + player.getTotalDamage());
				System.out.println(" Kalan Para : " + player.getMoney());
			} else {
				System.out.println(" Bakiye Yetersiz");
			}
		}
	}

	public int armorMenu() {
		System.out.println(" 1. Hafif   Para : 15  - Zırh : 1 ");
		System.out.println(" 2. Orta     Para : 25  - Zırh : 3 ");
		System.out.println(" 3. Ağır     Para : 40  - Zırh : 5 ");
		System.out.println(" 4. Çıkış ");
		System.out.print(" Silah seçiniz : ");
		int selArmorID = scan.nextInt();
		return selArmorID;
	}

	public void buyArmor(int itemID) {
		int armor = 0;
		int price = 0;

		String aName = null;
		switch (itemID) {
		case 1:
			armor = 1;
			aName = " Hafif ";
			price = 15;
			break;
		case 2:
			armor = 3;
			aName = " Orta ";
			price = 25;
			break;
		case 3:
			armor = 5;
			aName = " Zırh ";
			price = 40;
			break;
		case 4:
			System.out.println(" Çıkış yapılıyor ");
			break;
		default:
			System.out.println(" Geçersiz işlem");
		}
		if (price > 0) {
			if (player.getMoney() >= price) {

				player.getInv().setArmor(armor);
				player.getInv().setAname(aName);
				player.setMoney(player.getMoney() - price);
				System.out.println(aName + " satın aldınız , Eski zırhınız : " + player.getInv().getArmor()
						+ " Yeni Zırhınız : " + player.getTotalArmor());
				System.out.println(" Kalan Para : " + player.getMoney());
			} else {
				System.out.println(" Bakiye Yetersiz");
			}
		}
	}

}
