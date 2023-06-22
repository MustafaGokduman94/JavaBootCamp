import java.util.Scanner;

public class Location {
	Player player;
	String locname;
	int dmg;
	int hel;
	int mon;
	Scanner scn = new Scanner(System.in);

	public String getLocname() {
		return locname;
	}

	public void setLocname(String locname) {
		this.locname = locname;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public int getHel() {
		return hel;
	}

	public void setHel(int hel) {
		this.hel = hel;
	}

	public int getMon() {
		return mon;
	}

	public void setMon(int mon) {
		this.mon = mon;
	}

	public Scanner getScn() {
		return scn;
	}

	public void setScn(Scanner scn) {
		this.scn = scn;
	}

	Location(Player player, String Name) {

	}

	public void selLoc() {

		switch (locMenu()) {

		case 1:
			createLoc("Güvenli ev", 1, 3, 5);
			break;
		case 2:
			createLoc("Mağara", 5, 3, 5);
			break;

		case 3:
			createLoc("Orman", 5, 5, 5);
			break;
		case 4:
			createLoc("Nehir", 4, 2, 5);
			break;
		case 5:
			createLoc("Mağaza", 0, 6, 0);
			break;

		}
		System.out.println(" Seçilen Mekan " + getLocname());

	}

	public int locMenu() {

		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Eylem gerçekleştirmek için bir yer seçiniz");
		System.out.println("1.GÜvenli ev-->> Size ait güvenli bir mekan , düşman yok  ");
		System.out.println("2.Mağara -->> Karşınıza belki zombi çıkabilir  ");
		System.out.println("3.Orman -->> Karşınıza belki vampir çıkabilir  ");
		System.out.println("4.Nehir -->> Karşınıza belki ayı çıkabilir  ");
		System.out.println("5.Mağaza -->> Silah veya zırh alabilirsiniz  ");
		System.out.print("Gitmek istediğiniz yer : ");
		int selLocID = scn.nextInt();
		while (selLocID < 0 || selLocID > 5) {
			System.out.print("Lütfen geçerli bir seçim yapınız ");
			selLocID = scn.nextInt();

		}
		return selLocID;

	}

	public void createLoc(String locname, int dmg, int hel, int mon) {
		setLocname(locname);
		setDmg(dmg);
		setHel(hel);
		setMon(mon);

	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
