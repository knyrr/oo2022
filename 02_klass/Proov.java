public class Proov{
	public static void main(String[] arg){
		Isikukood jaagup=new Isikukood("37605030299", "Jaagup");
		Isikukood paula=new Isikukood("61009171032", "Paula");
		System.out.println("Nimi: "+paula.nimi());
		System.out.println("Isikukood: "+paula.kood());
		System.out.println("Sugu: "+paula.sugu());
		System.out.println(paula.nimi() +" on sündinud " + paula.synniaeg());
		System.out.println("Nimi: "+jaagup.nimi());
		System.out.println("Isikukood: "+jaagup.kood());
		System.out.println("Sugu: "+jaagup.sugu());
		System.out.println(jaagup.nimi() +" on sündinud " + jaagup.synniaeg());
		}
	}
/*	
[marrun@greeny 02_klass]$ java Proov
Nimi: Paula
Isikukood: 61009171032
Sugu: naine
Paula on sündinud 17.09.2010
Nimi: Jaagup
Isikukood: 37605030299
Sugu: mees
Jaagup on sündinud 03.05.1976
*/
