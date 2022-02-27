public class Seadistus{
	public static void main(String[] arg){
		Valgustid vd1=new Valgustid();
		Valgusti v1=new Valgusti("001", 0, 50);
		Valgusti v2=new Valgusti("002", 2, 50);
		vd1.lisaValgusti(v1);
		vd1.lisaValgusti(v2);
		System.out.println(vd1);
		vd1.tugevamaks(5);
		System.out.println(vd1);
		v1.n6rgemaks(60);
		System.out.println(vd1);		
	}
}

/*
Valgusti kohustuslikud omadused on: 
1) vabalt määratav järjekorranumber stringina (nt "001")
2) värvus täisarvuna (0 - roheline, 1 - kollane, 2 - punane) 
3) valgustugevus täisarvuna (vahemikus 0-100)

[marrun@greeny kodutöö]$ java Seadistus
Lambis 001 põleb roheline tuli tugevusega 50%.
Lambis 002 põleb punane tuli tugevusega 50%.

Lambis 001 põleb roheline tuli tugevusega 55%.
Lambis 002 põleb punane tuli tugevusega 55%.

Lamp 001 ei põle.
Lambis 002 põleb punane tuli tugevusega 55%.
*/



