package JoogiTest;

import java.util.*;

public class Kast{
	String kastityyp; //nimetus
	double kastihind; //eurot
	double kastimass; //kg
	int pesasid; //
	List<Joogipudel> list = new ArrayList<Joogipudel>();
	
	public Kast(String kastityyp, double kastihind, double kastimass,int pesasid){
		this.kastityyp = kastityyp;
		this.kastihind = kastihind;
		this.kastimass = kastimass;
		this.pesasid = pesasid;
	}
	
	public void lisaPudel(Joogipudel pudel){
		if(list.size()<pesasid){
			list.add(pudel);
		} else {
			throw new RuntimeException("kast täis");
		}
	}
	
	public double leiaKogumass(){
		double kogumass = kastimass;
		for (Joogipudel pudel : list){ 
			kogumass = kogumass + pudel.leiaMass();
		}
		return Math.round( kogumass * 1000.0 ) / 1000.0;
		
	}
	
	public double leiaOmahind(){
		double omahind = kastihind;
		for (Joogipudel pudel : list){ 
			omahind = omahind + pudel.taaraMaksumus + pudel.leiaOmahind();
		}
		return Math.round( omahind * 1000.0 ) / 1000.0;
	}
	
}

/* konkreetne valemiarvutus, phyton-java tekst ette, arvustus
süsteem arvutisse püsti (lihtne leht, arvutab silbid välja) */


