public class Sisestamine{
    public static void main(String[] arg){
		Tulemused td1=new Tulemused();
		Tulemus t1=new Tulemus("Kalle", 18.5);
		Tulemus t2=new Tulemus("Malle", 21.7);
        Tulemus t3=new Tulemus("Kadri", 19.5);
		Tulemus t4=new Tulemus("Juhan", 23.3);
		td1.lisaTulemus(t1);
		td1.lisaTulemus(t2);
        td1.lisaTulemus(t3);
        td1.lisaTulemus(t4);
        double parimTulemus=td1.parimTulemus();
        td1.maaraTulemus();
        System.out.println(td1);
	}
}


/* Uudne hindamissüsteem punktide, cm, ja sekundite teisendamisel hinneteks on järgmine: 
Hinde panemise aluseks ei ole hindaja "absoluutne tõde", vaid hinnatavate õpilaste hulgast
parim tulemus, mis on 100%. Ülejäänute hinne leitakse protsendi järgi järgmiselt: 
hinne "5" 91-100%, hinnne "4" 81-90% jne ning läbikukkunud alla 51%.
Koosta õpetaja tööd lihtsustav programm, mis pakub tulemuste järgi hinde.  */	

/* [marrun@greeny 06_liides]$ java Sisestamine
Kalle, tulemus 18.5 s, hinne 3
Malle, tulemus 21.7 s, hinne 5
Kadri, tulemus 19.5 s, hinne 4
Juhan, tulemus 23.3 s, hinne 5
 */

