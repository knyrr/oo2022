public class Akvaarium {
    double pikkus, laius, k6rgus, veesisaldus;

    public Akvaarium(double uusPikkus, double uusLaius, double uusK6rgus){
        pikkus=uusPikkus;
        laius=uusLaius;
        k6rgus=uusK6rgus;
    }

    public String toString(){
		return "Akvaariumi pikkus on "+pikkus+", laius"+laius+", kõrgus "+k6rgus+".";
	}

    public double ruumala(){
        return pikkus*laius*k6rgus;
    }

    public void m22raVeesisaldus(double uusVeesisaldus){
        if ((k6rgus-(uusVeesisaldus/(laius*pikkus)))<2.0){
            throw new RuntimeException("Teises akvaariumis pole piisavalt ruumi");
        } else {
            veesisaldus=uusVeesisaldus;
        }
    }
    
    public double veesisaldus(){
        return veesisaldus;
    }

    public void veeYmberValamine(Akvaarium kust, Akvaarium kuhu, double kogus){
        kust.m22raVeesisaldus(kust.veesisaldus()-kogus);
        kuhu.m22raVeesisaldus(kuhu.veesisaldus()+kogus);
    }
}

  