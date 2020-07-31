import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NOKTest {
    NOK nok= new NOK();


    @Test
    public void testNok1_1() {
        //nok.NOK(1,1);
        assertEquals(1, nok.NOK(1,1));
    }


    @Test
    public void testNok3_7_21() {

        assertEquals(21, nok.NOK(3,7));
    }

    @Test
    public void testNok8_64_64() {

        assertEquals(64, nok.NOK(8,64));
    }

    @Test
    public void testNok64_8_64() {

        assertEquals(64, nok.NOK(64,8));
    }

    @Test
    public void testNok_15_17_255() {

        assertEquals(255, nok.NOK(15,17));
    }

    @Test
    public void testNok_8_7_56() {

        assertEquals(56, nok.NOK(8,7));
    }}


