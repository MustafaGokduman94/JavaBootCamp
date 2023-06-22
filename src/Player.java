import java.util.Scanner;

public class Player {
	private int Damage, Healthy, Money;
	private String name, cName;
	İnventory inv;
	Scanner scn = new Scanner(System.in);

	public Player(String name) {

		this.name = name;
	}

	public void selectCha() {
		
		switch (chaMenu()) {

		case 1:
			createPlayer("Samuray", 5, 21, 15);
			break;
		case 2:
			createPlayer("Okçu", 7, 18, 20);
			break;
		case 3:
			createPlayer("Şövalye", 8, 24, 5);
			break;
		default:
			createPlayer("Şövalye", 5, 21, 15);
			break;
		}
		System.out.println(getName() + " kullanıcsının " + "Karakter oluşturuldu >>  " + getcName() + " Hasar :"
				+ getDamage() + " Sağlık : " + getHealthy() + " Para : " + getMoney());

	}

	public void createPlayer(String cname, int dmg, int healt, int mny) {
		setcName(cname);
		setDamage(dmg);
		setHealthy(healt);
		setMoney(mny);

	}

	public int chaMenu() {
		System.out.println("Lütfen Bir Karater Seçiniz ");
		System.out.println(" 1- Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");
		System.out.println(" 2- Okçu \t Hasar : 7 \t Sağlık : 18 \t Para : 20");
		System.out.println(" 3- Şövalye \t Hasar :8 \t Sağlık : 24 \t Para : 5");
		int chaID = scn.nextInt();

		while (chaID < 1 || chaID > 3) {

			System.out.print(" Lütfen geçerli bir karakter seçiniz ");

			return chaID = scn.nextInt();

		}
		return chaID;
	}

	public int getDamage() {
		return Damage;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}

	public int getHealthy() {
		return Healthy;
	}

	public void setHealthy(int healthy) {
		Healthy = healthy;
	}

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		Money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public İnventory getInv() {
		return inv;
	}

	public void setInv(İnventory inv) {
		this.inv = inv;
	}

}
