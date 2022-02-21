public class Foor{
	private int kestus;
	private int v2rvus;
	public int kysiV2rvus(){return v2rvus;}
	public int kysiKestus(){return kestus;}
	public void m22raV2rvus(String arg){
		int sisend=Integer.parseInt(arg);
		if (sisend==0){v2rvus=0;}
		else if (sisend==1){v2rvus=1;}
		else if (sisend==2){v2rvus=2;}
		else {v2rvus=3;}			
	}
	public void m22raKestus(String arg){
		int sisend=Integer.parseInt(arg);
		if (sisend<0){kestus=0;}
		else if (sisend>120){kestus=120;}
		else {kestus=sisend;}		
	}
}
 