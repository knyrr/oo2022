import java.util.*;

public class Joestik{
	List<Jogi> joestik=new ArrayList<Jogi>();
	
	public void lisaJoestikku(Jogi jogi){
		joestik.add(jogi);
	}
	
	public Jogi teeLahimaVahepunktini(double x, double y){
		Jogi lahimJogi=null;
		double kaugus=0;		
		for (Jogi jogi: joestik){
			double dx;
			double dy;
			if(jogi.vahepunktiX==0 && jogi.vahepunktiY==0){
				dx=jogi.suudmeX-x; 
				dy=jogi.suudmeY-y;;
			} else {
				dx=jogi.vahepunktiX-x; 
				dy=jogi.vahepunktiY-y;;
			}
			double abiKaugus = Math.sqrt(dx*dx+dy*dy);
			
			if(kaugus==0){
				lahimJogi = jogi;
				kaugus = abiKaugus;
			} else if(abiKaugus<kaugus){
				lahimJogi = jogi;
				kaugus = abiKaugus;
			}
		}
		
		Jogi uusJogi = new Jogi("Uus jõgi", x, y, lahimJogi.vahepunktiX, lahimJogi.vahepunktiY);
		uusJogi.maaraSihtjogi(lahimJogi);
		lisaJoestikku(uusJogi);		
		return uusJogi;
	}
	
	public String kasReostunud(double x, double y, Jogi reostunudJogi){
		Jogi uusJogi = teeLahimaVahepunktini(x,y);
		String vastus = "Ei ole reostud";
		
		if(uusJogi.suudmeX == reostunudJogi.suudmeX && uusJogi.suudmeY==reostunudJogi.suudmeY){
			vastus = "On reostud1";
		} else {
			boolean omabSihtjoge = false;
			if(reostunudJogi.sihtjogi != null){
				omabSihtjoge = true;
			}
			Jogi abi = reostunudJogi.sihtjogi;
			
			while(omabSihtjoge){
				if(uusJogi.suudmeX == abi.vahepunktiX && uusJogi.suudmeY==abi.vahepunktiY){
					vastus = "On reostud2";
					break;
				} 
				if(abi.sihtjogi == null){
					omabSihtjoge = false;
				} else {
					abi = abi.sihtjogi;
				}
			}
		}
		return vastus;
	}
}

/*  Loo rakendus, kus antakse ette koordinaat alal. Sealt leitakse lühim tee lähima vahepunktini ning sealt sihtjõgesid kaudu merre. Kuva etteantud punktist teekond mereni ning selle pikkus. Sisestatakse teine punkt kaardil. 

Väljastatakse, kas teisele punktile lähim vahepunkt on reostatud, kui esimesest punktist hakkas esimest teekonda pidi voolama reostus.*/