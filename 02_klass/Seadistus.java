public class Seadistus{
	public static void main(String[] arg){
		Foor f1=new Foor();
		if(arg.length==2){
			f1.m22raV2rvus(arg[0]);
			f1.m22raKestus(arg[1]);
		} else {
			f1.m22raV2rvus("0");
			f1.m22raKestus("0");
		}
		
		if (f1.kysiV2rvus()==0 || f1.kysiKestus()==0){
			System.out.println("Foor ei põle");			
		} else {
			String v2rvus;
			if (f1.kysiV2rvus()==1){v2rvus="roheline";}
			else if (f1.kysiV2rvus()==2){v2rvus="kollane";}
			else {v2rvus="punane";}
			System.out.println("Fooris põleb "+v2rvus+" tuli kestusega "+ String.valueOf(f1.kysiKestus()) +" sekundit.");
		}
		
	}
}

/*
Käsureale sisestatava kahe täisarvuga saab määrata fooritule värvuse ja selle kestuse.
Esimene täisarv: 0 - ei põle; 1 - roheline; 2 - kollane; 3 - punane
Teine täisarv: kestus sekundites vahemikus 0-120

[marrun@greeny 02_klass]$ java Seadistus 1 100
Fooris põleb roheline tuli kestusega 100 sekundit.

*/



