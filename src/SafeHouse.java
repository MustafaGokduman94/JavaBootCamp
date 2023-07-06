
public class SafeHouse extends NormalLocation {

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");

	}

	public boolean getLocation() {

		player.setHealthy(player.getrHealthy());
		System.out.println("Canınız fullendi");
		System.out.println(" Şuan Güvenli Ev adlı yerdesiniz");
		return true;

	}

}
