public class Joogipudel{
	public double maht; //m3; 1 l = 0.001 m3
	double mass; //kg
	String pudelityyp; //plastik v klaas, 
	double taaraMaksumus;
	Jook jook;
	
	public Joogipudel(double maht, double mass, String pudelityyp,double taaraMaksumus){
		this.maht = maht;
		this.mass = mass;
		this.pudelityyp = pudelityyp;
		this.taaraMaksumus = taaraMaksumus;
	} 
	
	public void lisaJook(Jook jook){
		this.jook = jook;
	}
	
	public double leiaMass(){
		double abi = 0;
		if(jook == null){
			abi = mass;
		} else {
			abi = mass + maht*jook.erikaal;
		}
		return abi;
	}
	
	public double leiaOmahind(){
		double abi = 0;
		if(jook == null){
			abi = 0;
		} else {
			abi = maht*jook.omahind;
		}
		return abi;
	}
	
}