package MatchApp;

public class BoxingMain {

	public static void main(String[] args) {
		Boksor b1=new Boksor("Muhammed Ali",110,25,1000,5);
		Boksor b2=new Boksor("Mike Tyson",100,20,1000,10);
		Musabaka mac=new Musabaka(b1,b2,100,120);
		mac.raundBasla();
	}

}
