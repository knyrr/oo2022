public class Valgusti{
	String jrkNr;
	int tugevus;
	int v2rvus;

	public Valgusti(String uusJrkNr, int uusV2rvus, int uusTugevus){
		jrkNr=uusJrkNr;
		v2rvus=uusV2rvus;
		tugevus=uusTugevus;
	}
	public String v2rviNimi(int v2rvus){
		String v2rviNimi;
		if(v2rvus==0){v2rviNimi="roheline";}
		else if(v2rvus==1){v2rviNimi="kollane";}
		else {v2rviNimi="punane";}
		return v2rviNimi;
	}
	public void tugevamaks(int protsenti){
		tugevus += protsenti;
		if(tugevus>=100){tugevus=100;}
	}
	public void n6rgemaks(int protsenti){
		tugevus -= protsenti;
		if(tugevus<=0){tugevus=0;}
	}
	public String toString(){
		if(tugevus==0){
			return "Lamp "+jrkNr+" ei põle.";
		} else {
			return "Lambis "+jrkNr+" põleb "+v2rviNimi(v2rvus)+" tuli tugevusega "+tugevus+"%.";
		}
	}
}
 