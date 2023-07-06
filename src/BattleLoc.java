import java.util.Scanner;

public abstract class BattleLoc extends Location {
	protected Obstackle obstackle;
	protected String award;
	Scanner scan = new Scanner(System.in);

	public BattleLoc(Player player, String name, Obstackle obstackle, String award) {

		super(player);
		this.name = name;
		this.obstackle = obstackle;

	}

	public boolean getLocation() {
		int obscount = obstackle.obstackleCount();
		System.out.println(" Şuan buradasınız : " + this.getName() + " ");
		System.out.println(" Dikkatli ol " + obscount + " tane " + obstackle.getName() + " yaşıyor ");
		System.out.println(" Savaşmak için (S) ve ya Kaçmak için (K) basınız");
		String selCase = scan.next();
		selCase = selCase.toUpperCase();
		if (selCase.equals("S")) {
			if (combat(obscount)) {
				System.out.println(this.getName() + " Bölgesindeki Tüm düşmanları temizlediniz");
				if (this.award.equals("Food") && player.getInv().isFood() == false) {
					System.out.println(this.award + " Kazandınız");
					player.getInv().setFood(true);
				} else if (this.award.equals("Water") && player.getInv().isWater() == false) {
					System.out.println(this.award + " Kazandınız");
					player.getInv().setWater(true);
				} else if (this.award.equals("FireWood") && player.getInv().isFirewood() == false) {
					System.out.println(this.award + " Kazandınız");
					player.getInv().setFirewood(true);

				}
				return true;

			} if (player.getHealthy() <=0) {
				
				System.out.println(" Öldünüz !");
				return false;
			}
			return true;

		}
		return true;

		
	}

	public boolean combat(int obsCount) {

		for (int i = 0; i < obsCount; i++) {
			int defObsHealth = obstackle.getHealth();

			playerStats();
			enemyStats();

			while (player.getHealthy() > 0 && obstackle.getHealth() > 0) {
				System.out.println("(V) Vur veya (K) Kaç ");
				String selCase = scan.next();
				selCase = selCase.toUpperCase();
				if (selCase.equals("V")) {
					System.out.println("Hasar verildi ");
					obstackle.setHealth(obstackle.getHealth() - player.getTotalDamage());
					System.out.println(" Oyuncu Canı : " + player.getHealthy());
					System.out.println(" Canavar Canı : " + obstackle.getName() + " " + obstackle.getHealth());
					if (obstackle.getHealth() > 0) {
						System.out.println(" Canavar size vurdu ");
						player.setHealthy(player.getHealthy() - (obstackle.getDamage() - player.getTotalArmor()));

					}
					System.out.println();
				} else {
					return false;
				}
			}
			if (obstackle.getHealth() < player.getHealthy() ) {
				System.out.println(" Düşmanı  yendiniz ");
				player.setMoney(player.getMoney() + obstackle.getAward());
				System.out.println(" Toplam paranız : " + player.getMoney());
				obstackle.setHealth(defObsHealth);

			} else {
				return false;
			}
			System.out.println(" ----------------------------------");
		}

		return true;

	}

	public void playerStats() {
		System.out.println(" Oyuncu bilgileri -------------------------");
		System.out.println(" Can :  " + player.getHealthy());
		System.out.println(" Toplam Hasars :  " + player.getTotalDamage());
		System.out.println(" Toplam Zırh :  " + player.getTotalArmor());
		System.out.println(" Para :  " + player.getMoney());
		if (player.getInv().getDamage() > 0) {
			System.out.println(" Silah : " + player.getInv().getWname());

		}
		if (player.getInv().getArmor() > 0) {
			System.out.println(" Zırh : " + player.getInv().getAname());

		}
	}

	public void enemyStats() {
		System.out.println(obstackle.getName() + " Değerleri------------------");
		System.out.println("Can " + obstackle.getHealth());
		System.out.println("Hasar " + obstackle.getDamage());
		System.out.println("Ödül " + obstackle.getAward());

	}
}
