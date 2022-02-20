public class Isikukood{
	private String kood;
	private String nimi;
	public Isikukood(String uusKood, String uusNimi){
		kood=uusKood;
		nimi=uusNimi;
	}
	public String sugu(){
		return (Integer.parseInt(kood.substring(0, 1)) % 2 == 0 ? "naine" : "mees");
	}
	public String aastakakstahte(){
		return String.valueOf(18+(Integer.parseInt(kood.substring(0, 1))-1)/2);
	}
	public String synniaasta(){
		return aastakakstahte() + kood.substring(1, 3);
	}
	public String synnikuu(){
		return kood.substring(3,5);
	}
	public String synnip2ev(){
		return kood.substring(5,7);
	}
	public String synniaeg(){
		return synnip2ev() + "." + synnikuu() + "." + synniaasta();
	}
	public String nimi(){
		return nimi;
	}
	public String kood(){
		return kood;
	}
}