package pr1;

import org.junit.*;
import static org.junit.Assert.*;

public class TulemusteTest {

    private static final double DELTA = 1e-15;

    Tulemus t1 = new Tulemus("Kalle", 91.0);
    Tulemus t2 = new Tulemus("Malle", 89.0);

    @Test public void testKysitulemus(){
        double tulemusT1 = t1.kysiTulemus();
        double tulemusT2 = t2.kysiTulemus();
        assertEquals(91.0, tulemusT1, DELTA);
        assertEquals(89.0, tulemusT2, DELTA);
    }

	@Test public void testKMaaraHinne(){
        double parimTulemus = 100;
		String hinneT1 = t1.maaraHinne(parimTulemus);   
        assertEquals("5", hinneT1);
        String hinneT2 = t2.maaraHinne(parimTulemus);   
        assertEquals("4", hinneT2);
	}

}