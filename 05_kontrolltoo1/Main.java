public class Main{
    public static void main(String[] arg){
        Akvaariumid ad1=new Akvaariumid();
        Akvaarium a1=new Akvaarium(100.0, 20.0, 50.0);
        Akvaarium a2=new Akvaarium(100.0, 20.0, 50.0);
        ad1.lisaAkvaarium(a1);
        ad1.lisaAkvaarium(a2);

             
        System.out.println("1. akvaariumi ruumala: "+a1.ruumala()+"cm3");
        System.out.println("2. akvaariumi ruumala: "+a1.ruumala()+"cm3");

        a1.m22raVeesisaldus(90000.0);
        a2.m22raVeesisaldus(50000.0);
        System.out.println("1. akvaariumi veesisaldus: "+a1.veesisaldus()+"cm3");
        System.out.println("2. akvaariumi veesisaldus: "+a2.veesisaldus()+"cm3");

        // kust - kuhu - kui palju
        ad1.veeYmberValamine(a1, a2, 46000.0);
        System.out.println("1. akvaariumi veesisaldus: "+a1.veesisaldus()+"cm3");
        System.out.println("2. akvaariumi veesisaldus: "+a2.veesisaldus()+"cm3");

    }
}


/* Akvaarium

* Loo klass akvaariumi tarbeks. Konstruktori sisendiks pikkus, laius ja kõrgus (cm). Koosta käsklus ruumala väljastamiseks.
* Akvaariumi eksemplar hoiab meeles sees hoitava vee kogust. Käsuga saab vett lisada. Käsuga saab küsida, et kui palju on selles akvaariumis vett.
* Akvaariume on mitu. Koosta käsklus määratud koguse vee valamiseks ühest akvaariumist teise. Kui akvaariumi servani jääb vähem kui kaks vaba sentimeetrit, väljastatakse hoiatus. 

*/