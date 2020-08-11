import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VasjaSpielTest {

    VasjaSpiel vasjaSpiel= new VasjaSpiel();

@Test
 public void testVasjaSpiel_n0_m0_expct0(){
        vasjaSpiel.findRound(0,0);
    assertEquals(0, vasjaSpiel.findRound(0,0));}

    @Test
    public void testVasjaSpiel_n1_m1_expct0(){
        vasjaSpiel.findRound(1,1);
        assertEquals(0, vasjaSpiel.findRound(1,1));
    }

    @Test
    public void testVasjaSpiel_n0_m1_expct0(){
        vasjaSpiel.findRound(0,1);
        assertEquals(0, vasjaSpiel.findRound(0,1));
    }
    @Test
    public void testVasjaSpiel_n1_m0_expct0(){
        vasjaSpiel.findRound(1,0);
        assertEquals(0, vasjaSpiel.findRound(1,0));
    }
    @Test
    public void testVasjaSpiel_n5_mzero_expct5(){
        vasjaSpiel.findRound(5,0);
        assertEquals(4, vasjaSpiel.findRound(5,0));
}
    @Test
    public void testVasjaSpiel_n8_m3_expct3(){
        vasjaSpiel.findRound(8,3);
        assertEquals(3, vasjaSpiel.findRound(8,3));
    }
    @Test
    public void testVasjaSpiel_n16_m4_expct4(){
        vasjaSpiel.findRound(16,4);
        assertEquals(4, vasjaSpiel.findRound(16,4));
    }

    @Test
    public void testVasjaSpiel_n17_m4_expct5(){
        vasjaSpiel.findRound(17,4);
        assertEquals(5, vasjaSpiel.findRound(17,4));
    }

    @Test
    public void testVasjaSpiel_n9_m3_expct4(){
        vasjaSpiel.findRound(9,3);
        assertEquals(4, vasjaSpiel.findRound(9,3));
    }

    @Test
    public void testVasjaSpiel_n2_m0_expct1(){
        vasjaSpiel.findRound(2,0);
        assertEquals(1, vasjaSpiel.findRound(2,0));
    }

    @Test
    public void testVasjaSpiel_n4_m1_expct2(){
        vasjaSpiel.findRound(4,1);
        assertEquals(2, vasjaSpiel.findRound(4,1));
    }

}
