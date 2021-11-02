import no.hiof.vetleel.year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class leep_Year {

    @Test
    public void Check_If_This_Is_True() {
        assertTrue(year.isLeapYear(2000), "A leap year.");
        assertTrue(year.isLeapYear(2028), "A leap year.");
        assertTrue(year.isLeapYear(2028), "Another leap year. This is another year.");

    }

    @Test
    public void Check_If_Modulo_Four() {
        assertEquals(year.modulo(1700, 4), 0);
        assertEquals(year.modulo(1800, 4), 0);
        assertEquals(year.modulo(1900, 4), 0);
        assertEquals(year.modulo(2000, 4), 0);
        assertEquals(year.modulo(2100, 4), 0);
    }

    @Test
    public void Check_If_Modulo_Hundred() {
        assertEquals(year.modulo(1700, 100), 0);
        assertEquals(year.modulo(1800, 100), 0);
        assertEquals(year.modulo(1900, 100), 0);
        assertEquals(year.modulo(2000, 100), 0);
        assertEquals(year.modulo(2100, 100), 0);
    }

    @Test
    public void Check_if_Modulo_Four_Hundred() {
        assertEquals(year.modulo(1700, 400), 100);
        assertEquals(year.modulo(1800, 400), 200);
        assertEquals(year.modulo(1900, 400), 300);
        assertEquals(year.modulo(2000, 400), 0);
        assertEquals(year.modulo(2100, 400), 100);
    }

}
