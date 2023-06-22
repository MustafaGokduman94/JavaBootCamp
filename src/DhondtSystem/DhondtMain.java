package DhondtSystem;

public class DhondtMain {

	public static void main(String[] args) {
		Partiler[] parti=new Partiler[3];
		parti[0]=new Partiler("A Partisi", 25000, 0);
		parti[1]=new Partiler("B Partisi", 14000, 0);
		parti[2]=new Partiler("C Partisi", 60000, 0);
		int mvSayisi=7;
		for(int i=1;i<=mvSayisi;i++) {
			int index=indexiBul(parti);
			parti[index].sandalyeArttir();
		}
		for(int i=0;i<parti.length;i++) {
			parti[i].sandalyeSayisi();
		}

	}
	private static int indexiBul(Partiler[] parti) {
		int indexNo=-1;
		double enYuksekOy=0;
		for(int i=0;i<parti.length;i++) {
			double enYuksekOran=parti[i].getOy()/(parti[i].getSandalye()+1);
			if(enYuksekOran>enYuksekOy) {
				enYuksekOy=enYuksekOran;
				indexNo=i;
			}
		}
		
		return indexNo;
	}

}
