import java.util.*;
public class Tulemused{
    double parimTulemus=0;
    ArrayList<Tulemus> tulemused = new ArrayList<Tulemus>();
    public void lisaTulemus(Tulemus t){tulemused.add(t);}

    public double parimTulemus(){
		for(Tulemus t: tulemused){
			if (t.kysiTulemus() > parimTulemus){
                parimTulemus = t.kysiTulemus();
            } 
		}
        return parimTulemus;
    }

    public void maaraTulemus(){
		for(Tulemus t: tulemused){
			t.kysiHinne(parimTulemus);
		}
    }


    public String toString(){
		StringBuffer sb=new StringBuffer();
		for(Tulemus t:tulemused){
			sb.append(t+"\n");
		}
		return sb.toString();
	}
}

