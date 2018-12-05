package com.umcs.dzmudziak;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VIPKontoTest {
    @Test
    public void jezeliVIPNiePrzekraczaDebetu_Z_Kasa() {
        Konto k = new Konto(true, false, 100, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }

    @Test
    public void jezeliVIPZrownaDebet_z_Kasa() {
        Konto k = new Konto(true, false, 100, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }

    @Test
    public void jezeliVIPPrzekraczaDebet_z_Kasa_przekracza_M() {
        Konto k = new Konto(true, false, 100, -100);
        assertEquals(0, k.zmniejszKonto(3000), 0);
    }

    @Test
    public void jezeliVIPPrzekraczaDebet_z_Kasa_niePrzekracza_M() {
        Konto k = new Konto(true, false, 100, -100);
        assertEquals(250, k.zmniejszKonto(250), 0);
    }
    @Test
    public void jezeliVIPPrzekraczaDebet_z_Kasa_rowna_M() {
        Konto k = new Konto(true, false, 100, -100);
        assertEquals(2200, k.zmniejszKonto(2200), 0);
    }

    @Test
    public void jezeliVIPNiePrzekraczaDebet_zero_Kasy() {
        Konto k = new Konto(true, false, 0, -200);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }

    @Test
    public void jezeliVIPZrownaDebet_zero_Kasy() {
        Konto k = new Konto(true, false, 0, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }
    @Test
    public void jezeliVIPPrzekraczaDebet_zero_Kasy_Przekracza_M() {
        Konto k = new Konto(true, false, 0, -200);
        assertEquals(0, k.zmniejszKonto(3500), 0);
    }

    @Test
    public void jezeliVIPPrzekraczaDebet_zero_Kasy_Rowna_M() {
        Konto k = new Konto(true, false, 0, -100);
        assertEquals(1100, k.zmniejszKonto(1100), 0);
    }
    @Test
    public void jezeliVIPPrzekraczaDebet_zero_Kasy_niePrzekracza_M() {
        Konto k = new Konto(true, false, 0, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }
    @Test
    public void jezeliVIPNiePrzekraczaDebet_minus_Kasy() {
        Konto k = new Konto(true, false, -50, -200);
        assertEquals(100, k.zmniejszKonto(100), 0);
    }

    @Test
    public void jezeliVIPZrownaDebet_minus_Kasy() {
        Konto k = new Konto(true, false, -50, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }
    @Test
    public void jezeliVIPPrzekraczaDebet_minus_Kasy_Przekracza_M() {
        Konto k = new Konto(true, false, -50, -200);
        assertEquals(0, k.zmniejszKonto(3500), 0);
    }

    @Test
    public void jezeliVIPPrzekraczaDebet_minus_Kasy_Rowna_M() {
        Konto k = new Konto(true, false, -50, -100);
        assertEquals(1050, k.zmniejszKonto(1050), 0);
    }
    @Test
    public void jezeliVIPPrzekraczaDebet_minus_Kasy_niePrzekracza_M() {
        Konto k = new Konto(true, false, -50, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }

}
