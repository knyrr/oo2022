package pr1;

public class Tulemus implements TulemusPohi{
    private String nimi;
    private double tulemus;
    private String hinne="hindamata";

    public Tulemus(String uusNimi, double uusTulemus){
        nimi = uusNimi;
        tulemus = uusTulemus;
    }
    
    public double kysiTulemus(){
        return tulemus;
    }

    public String maaraHinne(double parimTulemus){
        double abi = this.tulemus/parimTulemus*100;
        int protsent = (int) Math.round(abi);
        if(protsent>90){hinne = "5";}
        if(protsent>80 && protsent<=90){hinne = "4";}
        if(protsent>70 && protsent<=80){hinne = "3";}
        if(protsent>60 && protsent<=70){hinne = "2";}
        if(protsent>50 && protsent<=60){hinne = "1";}
        if(protsent<=50){hinne ="läbikukkunud";}
        return hinne;
    }
}
