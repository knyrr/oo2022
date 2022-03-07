import java.util.*;
public class Akvaariumid {
    ArrayList <Akvaarium> akvaariumid=new ArrayList<Akvaarium>();

    public void lisaAkvaarium(Akvaarium a){
        akvaariumid.add(a);
    }

    public void veeYmberValamine(Akvaarium kust, Akvaarium kuhu, double kogus){
        if (kust.veesisaldus()<kogus){
            throw new RuntimeException("Esimeses akvaariumis pole piisavalt vett");
        } else {
            kust.m22raVeesisaldus(kust.veesisaldus()-kogus);
            kuhu.m22raVeesisaldus(kuhu.veesisaldus()+kogus);  
        }
    }
}
