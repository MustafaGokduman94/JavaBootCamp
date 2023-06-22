import java.util.Arrays;

public class OopIntro {

	public static void main(String[] args) {
		OgrenciArray[] ogrenciler=new OgrenciArray[5];
		ogrenciler[0]=new OgrenciArray("Ahmet", "Demir", 45);
		ogrenciler[1]=new OgrenciArray("Ahmet", "Demir", 45);
		ogrenciler[2]=new OgrenciArray("Ahmet", "Demir", 45);
		ogrenciler[3]=new OgrenciArray("Ahmet", "Demir", 45);
		ogrenciler[4]=new OgrenciArray("Ahmet", "Demir", 45);
		for(int i=0;i<ogrenciler.length;i++) {
			ogrenciler[i].bilgiVer();
		}
		
	}

}
