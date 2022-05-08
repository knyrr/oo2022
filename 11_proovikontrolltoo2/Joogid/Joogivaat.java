public class Joogivaat{
	double ruumala; //m3
	double joogiKogus; //l ; 1 l = 0.001 m3
	Jook jook;
	
	public Joogivaat(double ruumala){
		this.ruumala = ruumala;
	}
	
	public void lisaJook(Jook jook, double joogiKogus){
		this.jook = jook;
		if(joogiKogus/1000>ruumala){
			this.joogiKogus = ruumala*1000;
		} else {
			this.joogiKogus = joogiKogus;
		}	
	}
	
	public void villiPudelisse(Joogipudel pudel){
		if(jook != null){
			if(joogiKogus>pudel.maht){
			pudel.lisaJook(jook);
			joogiKogus=joogiKogus-pudel.maht;
			}		
		}
	}
	
	public void villiKastiPudelitesse(Kast kast){
		for (Joogipudel pudel : kast.list){
			villiPudelisse(pudel);
		}
	}
}

