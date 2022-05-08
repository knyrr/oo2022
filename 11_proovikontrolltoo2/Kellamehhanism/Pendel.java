public class Pendel implements Runnable{
	int ooteaeg;
	Lykatav lt = null;
	public Pendel(double cm){
		ooteaeg=(int)(1000*2*Math.PI*Math.sqrt((cm/100.0)/9.8));
		System.out.println(ooteaeg);
	}
	
	public void maaraLykatav(Lykatav uus){
		lt=uus;
	}
	public void run(){
		while(true){
			try{Thread.sleep(ooteaeg);}catch(Exception ex){}
			if(lt!=null){lt.lykka();}
			System.out.println("tiks");
		}
	}
}