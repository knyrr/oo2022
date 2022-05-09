public class Proov{
	public static void main(String[] args){
		Jogi jogi1 = new Jogi("Pirita jõgi", 8, 0, 0, 0);
		Jogi jogi2 = new Jogi("Leivajõgi", 4, 6, 4, 0);
		Jogi jogi3 = new Jogi("Limujärve kraav", 10, 3, 4, 3);
		Jogi jogi4 = new Jogi("Nimetu kraav", 6, 2, 6, 3);

		System.out.println(jogi3.kaugusMereni());
		jogi4.maaraSihtjogi(jogi3);
		jogi3.maaraSihtjogi(jogi2);
		jogi2.maaraSihtjogi(jogi1);
		System.out.println(jogi3.kaugusMereni());

		Joestik joestik1 = new Joestik();
		joestik1.lisaJoestikku(jogi1);
		joestik1.lisaJoestikku(jogi2);
		joestik1.lisaJoestikku(jogi3);
		
		Jogi uusJogi = joestik1.teeLahimaVahepunktini(3, 4);
		System.out.println(uusJogi.kaugusMereni());

		System.out.println(joestik1.kasReostunud(6, 4, uusJogi)); //5,5 ; 6,4
	}
}

/* Jõed

* Loo klass jõe andmete hoidmiseks (nimetus, lähtme, vahepunktide ja suudme koordinaadid(x, y) meetrites). Koosta funktsioon lähtme ja suudme vahelise kauguse leidmiseks ning automaattest selle töö kontrolliks.
* Lisa jõele jõe tüüpi muutuja sihtjõgi. Merre suubumisel on sihtjõe väärtuseks null. Jõe suudmepunkti koordinaadid peavad ühtima sihtjõe ühe vahepunkti koordinaatidega. Lisa käsklus leidmaks teekonna pikkus etteantud (vahe)punktist mereni, kasutades vajadusel sihtjõgede abi. Lisa automaattest teekonna pikkuse kontrolliks.
* Loo rakendus, kus antakse ette koordinaat alal. Sealt leitakse lühim tee lähima vahepunktini ning sealt sihtjõgesid kaudu merre. Kuva etteantud punktist teekond mereni ning selle pikkus. Sisestatakse teine punkt kaardil. Väljastatakse, kas teisele punktile lähim vahepunkt on reostatud, kui esimesest punktist hakkas esimest teekonda pidi voolama reostus.

*/