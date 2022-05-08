package JoogiTest;

public class Proov{
	public static void main(String[] args){
		Jook piim = new Jook("piim", 0.5,  1.028);
		Joogipudel pudel = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel1 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel2 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel3 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel4 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel5 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel6 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel7 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogipudel pudel8 = new Joogipudel(0.5, 0.05, "pudel", 0.1);
		Joogivaat vaat = new Joogivaat(1);
		Kast kast = new Kast("puit", 1.2, 0.5, 8);
		
		vaat.lisaJook(piim, 100);
		kast.lisaPudel(pudel);
		pudel.lisaJook(piim);
		kast.lisaPudel(pudel1);
		kast.lisaPudel(pudel2);
		kast.lisaPudel(pudel3);
		kast.lisaPudel(pudel4);
		kast.lisaPudel(pudel5);
		kast.lisaPudel(pudel6);
		kast.lisaPudel(pudel7);
		//kast.lisaPudel(pudel8);
		vaat.villiKastiPudelitesse(kast);
		
		//3 osa
		System.out.println("Kastis on "+ kast.list.size()+" pudelit");
		System.out.println("Kasti kogumass on "+ kast.leiaKogumass()+" g");
		System.out.println("Kasti ja sisu omahind on "+ kast.leiaOmahind()+" eurot");
		
		//1 osa
/* 		System.out.println("Pudeli tühimass on "+ 1000*pudel.leiaMass()+" g");
 		pudel.lisaJook(piim);
		
		System.out.println("Täis piimaudeli mass on "+ 1000*pudel.leiaMass()+" g");
		
		System.out.println("Täis piimaudeli omahind on "+ pudel.leiaOmahind()+" eurot");
	
		; */
		
		//2 osa
/* 		System.out.println("Vaadis on "+ vaat.joogiKogus+" l");
		System.out.println("Pudeli tühimass on "+ 1000*pudel1.leiaMass()+" g");
		
		vaat.villiPudelisse(pudel1);
		
		System.out.println("Täis piimapudeli mass on "+ 1000*pudel1.leiaMass()+" g");
		System.out.println("Vaadis on "+ vaat.joogiKogus+" l"); */
		
		
		
		
		
	}
}