public class Proov{
	public static void main(String[] arg){
		Pendel p1=new Pendel(25);//25 on sekund
		Hammasratas h1 = new Hammasratas(60, 10, "esimene"); //sekund
		Hammasratas h2 = new Hammasratas(100, 10, "teine");
		Hammasratas h3 = new Hammasratas(60, 10, "kolmas"); //minut
		Hammasratas h4 = new Hammasratas(120, 10, "neljas"); //tund
		p1.maaraLykatav(h1);
		h1.maaraLykatav(h2);
		h2.maaraLykatav(h3);
		h3.maaraLykatav(h4);
		new Thread(p1).start();
	}
}