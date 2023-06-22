package OgrenciApp;

public class OgrenciMain {

	public static void main(String[] args) {
		Ogrenci ogr1=new Ogrenci();
		Ogrenci ogr2=new Ogrenci();
		ogr1.setAd("Mehmet");
		ogr1.setSoyAd("Aluç");
		ogr1.setOgrNo(4569);
		ogr2.setAd("Mehmet");
		ogr2.setSoyAd("Aluç");
		ogr2.setOgrNo(4569);
		System.out.println(ogr1.getAd()+" "+ogr1.getSoyAd()+" "+ogr1.getOgrNo());
		ogr1.setAd("Hasan");
		ogr1.setSoyAd("Kulaksız");
		System.out.println(ogr1.getAd()+" "+ogr1.getSoyAd()+" "+ogr1.getOgrNo());
		int a=5;
		System.out.println(a);
		a=10;
		System.out.println(a);
	}

}
