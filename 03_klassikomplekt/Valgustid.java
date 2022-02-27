import java.util.*;
public class Valgustid{
	List<Valgusti> valgustid=new ArrayList<Valgusti>();
	public void lisaValgusti(Valgusti v){valgustid.add(v);}
	public String toString(){
		StringBuffer sb=new StringBuffer();
		for(Valgusti v:valgustid){
			sb.append(v+"\n");
		}
		return sb.toString();
	}
	public void tugevamaks(int protsenti){
		for(Valgusti v: valgustid){
			v.tugevamaks(protsenti);
		}
	}
	public void n6rgemaks(int protsenti){
		for(Valgusti v: valgustid){
			v.n6rgemaks(protsenti);
		}
	}
}
