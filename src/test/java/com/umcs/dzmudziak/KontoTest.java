package com.umcs.dzmudziak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KontoTest {
    @Test
    public void jezeliNormalnyPrzekroczyDebet_z_M_False() {
        Konto k = new Konto(false, 0, -200);
        assertEquals(0, k.zmniejszKonto(350), 0);
    }

    @Test
    public void jezeliNormalnyPrzekroczyDebet_bez_M_True() {
        Konto k = new Konto(false, 0, -200);
        assertEquals(250, k.zmniejszKonto( 250), 0);
    }

    @Test
    public void jezeliNormalnyZrownaDebet_z_M_True() {
        Konto k = new Konto(false, 0, -100);
        assertEquals(200, k.zmniejszKonto( 200), 0);
    }

    @Test
    public void jezeliNormalnyNiePrzekraczaDebetu_Bez_Kasy() {
        Konto k = new Konto(false, 0, -100);
        assertEquals(50, k.zmniejszKonto( 50), 0);
    }

    @Test
    public void jezeliNormalnyNiePrzekraczaDebetu_Z_Kasa() {
        Konto k = new Konto(false, 100, -100);
        assertEquals(150, k.zmniejszKonto( 150), 0);
    }

    @Test
    public void M_Negatywny() {
        Konto k = new Konto(false, 0, -100);
        assertEquals(0, k.zmniejszKonto( 250), 0);
    }

    @Test
    public void M_POZYTYWNY() {
        Konto k = new Konto(false, 0, -100);
        assertEquals(150, k.zmniejszKonto( 150), 0);
    }

    @Test
    public void M_ROWNY() {
        Konto k = new Konto(false, 0, -100);
        assertEquals(200, k.zmniejszKonto( 200), 0);
    }

    @Test
    public void M_NEGATYWNY_Z_DEBETEM() {
        Konto k = new Konto(false, -100, -100);
        assertEquals(0, k.zmniejszKonto( 150), 0);
    }

    @Test
    public void M_POZYTYWNY_Z_DEBETEM() {
        Konto k = new Konto(false, -100, -100);
        assertEquals(50, k.zmniejszKonto( 50), 0);
    }
    @Test
    public void M_ROWNY_Z_DEBETEM() {
        Konto k = new Konto(false, -100, -100);
        assertEquals(100, k.zmniejszKonto( 100), 0);
    }
}
