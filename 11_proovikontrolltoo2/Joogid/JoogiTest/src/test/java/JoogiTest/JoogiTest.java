package JoogiTest;

import org.junit.Test;
import static org.junit.Assert.*;

public class JoogiTest {
	
	private static final double DELTA = 1e-15;
	
	Jook piim = new Jook("piim", 0.5,  1.028);
	Joogipudel pudel = new Joogipudel(0.5, 0.05, "pudel", 0.1);
	
	@Test public void testLeiaMass(){
		pudel.lisaJook(piim);
        double tulemus = pudel.leiaMass();
        assertEquals(0.564, tulemus, DELTA);
    }
	
	@Test public void testLeiaOmahind(){
		pudel.lisaJook(piim);
        double tulemus = pudel.leiaOmahind();
        assertEquals(0.35, tulemus, DELTA);
    }
}