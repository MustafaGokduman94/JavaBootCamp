package Yaris;

public class YarısMain {

	public static void main(String[] args) {
		
		Arabalar araba1= new Arabalar("Volvo","XC90",100,20);
		Arabalar araba2= new Arabalar("Ferrari","F90",100,0.2);
		Pistt pistt=new Pistt(1000);
		System.out.println("Yarış Başlıyor!!!");
		System.out.println(araba1.getMarka()+" "+araba1.getModel()+" Piste geldi");
		System.out.println(araba2.getMarka()+" "+araba2.getModel()+" Piste geldi");
		System.out.println("<--------------------------------->");
		pistt.yarısıbaslat(araba1, araba2);
				
		
		

	}

}
