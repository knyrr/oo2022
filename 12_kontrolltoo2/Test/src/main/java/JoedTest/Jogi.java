package JoedTest;

public class Jogi{
	String nimetus;
	double lahtmeX;
	double lahtmeY;
	double suudmeX;
	double suudmeY;
	double vahepunktiX;
	double vahepunktiY;
	//double joePikkus;
	Jogi sihtjogi = null;
	
	public Jogi(String nimetus, double lahtmeX, double lahtmeY, double suudmeX, double suudmeY){
		this.nimetus = nimetus;
		this.lahtmeX = lahtmeX;
		this.lahtmeY = lahtmeY;
		this.suudmeX = suudmeX;
		this.suudmeY = suudmeY;
	}
	
	public double lahtmeSuudmeKaugus(){
		double dx=lahtmeX-suudmeX; 
		double dy=lahtmeY-suudmeY;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public double vahepunktiSuudmeKaugus(){
		double dx=vahepunktiX-suudmeX; 
		double dy=vahepunktiY-suudmeY;
		return Math.sqrt(dx*dx+dy*dy);
	}

	public void maaraSihtjogi(Jogi sihtjogi){
		this.sihtjogi = sihtjogi;
		this.sihtjogi.vahepunktiX = suudmeX;
		this.sihtjogi.vahepunktiY = suudmeY;
	}
	
	public double kaugusMereni(){
		double kaugusMereni = lahtmeSuudmeKaugus();
		boolean omabSihtjoge = false;
		if(sihtjogi != null){
			omabSihtjoge = true;
		}
		Jogi abi = sihtjogi;
		
		while(omabSihtjoge){
			kaugusMereni += abi.vahepunktiSuudmeKaugus();
			
			if(abi.sihtjogi == null){
				omabSihtjoge = false;
			} else {
				abi = abi.sihtjogi;
			}
		}
		return kaugusMereni;
	}
}