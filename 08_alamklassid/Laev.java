import java.util.*;

public class Laev{
	int x, y;

	ArrayList<Ruut> ruudud = new ArrayList<Ruut>(); 	
	
	public void paigutaLaev(Laud laud){};
	
	public String toString(){
		StringBuffer sb=new StringBuffer();
		for(Ruut ruut : ruudud){
			sb.append(ruut+"\n");
		}
		return sb.toString();
	}
}