import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scn = new Scanner(System.in);

	public void login() {

		System.out.println("Macera Oyununa Hoşgeldiniz ");
		System.out.print("Oyuna başlamadan önce isminizi giriniz ");
		String playerName = scn.nextLine();
		System.out.println("<< Hoşgeldin >>\t" + playerName);
		player = new Player(playerName);
		player.selectCha();
		location = new Location(player, null);
		location.selLoc();

	}

}
