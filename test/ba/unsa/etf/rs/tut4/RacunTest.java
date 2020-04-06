package ba.unsa.etf.rs.tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacunTest {

    @Test
    void setArtikalTest (){
        Racun r = new Racun();
        r = new Racun(new Artikal("HLB", "Hljeb", 1.1), 2);
        assertEquals(r.getArtikal(),new Artikal("HLB", "Hljeb", 1.1));
        r= new Racun(new Artikal("HLB", "Hljeb", 15), 2);
        assertEquals(r.getArtikal(),new Artikal("HLB", "Hljeb", 15));
    }
    @Test
    void getKolicinaTest (){
        Racun r = new Racun();
        r = new Racun(new Artikal("HLB", "Hljeb", 1.1), 2);
        assertNotEquals(r.getKolicina(), 15);

    }
    @Test
    void getArtikalTest (){
        Racun r = new Racun();
        r = new Racun(new Artikal("HLB", "Hljeb", 1.1), 2);
        assertEquals(r.getArtikal(),new Artikal("HLB", "Hljeb", 1.1));
    }