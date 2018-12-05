package com.umcs.dzmudziak;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirmoweVIPTest {
    @Test
    public void jezeliFirmoweVIPNiePrzekraczaDebetu_Z_Kasa() {
        Konto k = new Konto(true, true, 100, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }

    @Test
    public void jezeliFirmoweVIPZrownaDebet_z_Kasa() {
        Konto k = new Konto(true, true, 100, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }

    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_z_Kasa_przekracza_M() {
        Konto k = new Konto(true, true, 100, -100);
        assertEquals(0, k.zmniejszKonto(3000), 0);
    }

    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_z_Kasa_niePrzekracza_M() {
        Konto k = new Konto(true, true, 100, -100);
        assertEquals(250, k.zmniejszKonto(250), 0);
    }
    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_z_Kasa_rowna_M() {
        Konto k = new Konto(true, true, 100, -100);
        assertEquals(2200, k.zmniejszKonto(2200), 0);
    }

    @Test
    public void jezeliFirmoweVIPNiePrzekraczaDebet_zero_Kasy() {
        Konto k = new Konto(true, true, 0, -200);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }

    @Test
    public void jezeliFirmoweVIPZrownaDebet_zero_Kasy() {
        Konto k = new Konto(true, true, 0, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }
    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_zero_Kasy_Przekracza_M() {
        Konto k = new Konto(true, true, 0, -200);
        assertEquals(0, k.zmniejszKonto(3500), 0);
    }

    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_zero_Kasy_Rowna_M() {
        Konto k = new Konto(true, true, 0, -100);
        assertEquals(1900, k.zmniejszKonto(1900), 0);
    }
    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_zero_Kasy_niePrzekracza_M() {
        Konto k = new Konto(true, true, 0, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }
    @Test
    public void jezeliFirmoweVIPNiePrzekraczaDebet_minus_Kasy() {
        Konto k = new Konto(true, true, -50, -200);
        assertEquals(100, k.zmniejszKonto(100), 0);
    }

    @Test
    public void jezeliFirmoweVIPZrownaDebet_minus_Kasy() {
        Konto k = new Konto(true, true, -50, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }
    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_minus_Kasy_Przekracza_M() {
        Konto k = new Konto(true, true, -50, -200);
        assertEquals(0, k.zmniejszKonto(3500), 0);
    }

    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_minus_Kasy_Rowna_M() {
        Konto k = new Konto(true, true, -50, -100);
        assertEquals(1050, k.zmniejszKonto(1050), 0);
    }
    @Test
    public void jezeliFirmoweVIPPrzekraczaDebet_minus_Kasy_niePrzekracza_M() {
        Konto k = new Konto(true, true, -50, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }

}
