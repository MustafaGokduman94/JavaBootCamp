import java.util.Arrays;

public class DhondtSystem {

	public static void main(String[] args) {
		// oyların tutulduğu dizi
		int[] partiOylari= {60000,25000,14000};
		//partilerin aldığı sandalye sayısı dizi
		int[] sandalyeDagilimi=new int[partiOylari.length];
		int mvsayisi=7;
		for(int i=1;i<=mvsayisi;i++) {
			int enYuksekOy=mvIndex(partiOylari,sandalyeDagilimi);
			sandalyeDagilimi[enYuksekOy]++;
		}
		for(int i=0;i<sandalyeDagilimi.length;i++) {
			System.out.println((char)('A'+i)+" Partisi : -"+sandalyeDagilimi[i]);
		}

	}
	public static int mvIndex(int[] partiOylari,int[] sandalye) {
		int returnIndex=-1;
		double enyuksekOyOrani=0;
		for(int i=0;i<partiOylari.length;i++) {
			double enyuksekOy=partiOylari[i]/(sandalye[i]+1);
			if(enyuksekOy>enyuksekOyOrani) {
				enyuksekOyOrani=enyuksekOy;
				returnIndex=i;
			}
		}
		
		return returnIndex;
	}

}
