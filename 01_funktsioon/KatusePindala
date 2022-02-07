public class KatusePindala{
	public static double[] reaalarvudeks(String[] sd){
		double[] v=new double[sd.length];
		for(int i=0; i<sd.length; i++){
			v[i]=Double.parseDouble(sd[i]);
		}
		return v;
	}
	public static double akeskm(double[] arvud){
		if (arvud.length==0){
			throw new RuntimeException("pole arve");
			}
		double summa=0;
		for(int i=0;i<arvud.length; i++){
			summa+=arvud[i];
		}
		return summa/arvud.length;
	}
	public static void main(String[] args){
		double[] arvud=reaalarvudeks(args);
		if(arvud.length!=3){
			System.out.println("Arve peab olema kolm: viilu- ja räästakülje pikkus ning pööningu kõrgus");	
		} else {
			double viilukylg=arvud[0];
			double r22stakylg=arvud[1];
			double p66ninguk6rgus=arvud[2];
			double viiluserv=Math.sqrt(Math.pow(viilukylg/2, 2)+Math.pow(p66ninguk6rgus, 2));
			System.out.println(viiluserv*r22stakylg*2);
		}
	}
}

/* Viilkatusega maja katuse pindala. Sisestada tuleb kolm arvu a, b, c
a - maja lühema (viiluga) külje pikkus
b - maja pikema (räästaga) külje pikkus
c - pööningu kõrgus */

/* 
[marrun@greeny 01]$ java Funktsioonid4 8 10 3
100.0 
*/
