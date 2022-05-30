public class Hammasratas implements Lykatav{
	int valishambaid, mitmesvaline;
	int sisehambaid, mitmessisemine;
	String nimetus;
	Lykatav lt;
	public Hammasratas(int valishambaid, int sisehambaid, String nimetus){
		this.valishambaid = valishambaid;
		this.sisehambaid = sisehambaid;
		this.nimetus = nimetus;
	}
	
	public void maaraLykatav(Lykatav uus){
		lt=uus;
	}
	
	public void lykka(){
		mitmesvaline++;
		if(mitmesvaline*1.0/valishambaid>mitmessisemine*1.0/sisehambaid){
			mitmessisemine++;
			if (lt!=null){
			lt.lykka();
			}	
		}
		if (mitmesvaline==valishambaid){
			System.out.println("ring "+nimetus);
			mitmesvaline=0;
			mitmessisemine=0;
		}
	}
}