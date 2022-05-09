package JoedTest;

import org.junit.Test;
import static org.junit.Assert.*;

public class JoedTest {
	private static final double DELTA = 1e-15;
	
    @Test public void testLahtmeSuudmeKaugus() {
		Jogi j = new Jogi("Keila jõgi", 3, 4, 0, 0);
		double tulemus = j.lahtmeSuudmeKaugus();
        assertEquals(5.0, tulemus, DELTA);
    }
	
	@Test public void testKaugusMerest() {
		Jogi jogi1 = new Jogi("Pirita jõgi", 5, 0, 0, 0);
		Jogi jogi2 = new Jogi("Leivajõgi", 4, 3, 4, 0);
		Jogi jogi3 = new Jogi("Limujärve kraav", 6, 3, 4, 3);
		jogi3.maaraSihtjogi(jogi2);
		jogi2.maaraSihtjogi(jogi1);
		double tulemus = jogi3.kaugusMereni();
        assertEquals(9.0, tulemus, DELTA);
    }
	
}
