package com.umcs.dzmudziak;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NieVIPTest {
    @Test
    public void jezeliNormalnyNiePrzekraczaDebetu_Z_Kasa() {
        Konto k = new Konto(false, false, 100, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }

    @Test
    public void jezeliNormalnyZrownaDebet_z_Kasa() {
        Konto k = new Konto(false, false, 100, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }

    @Test
    public void jezeliNormalnyPrzekraczaDebet_z_Kasa_przekracza_M() {
        Konto k = new Konto(false, false, 100, -100);
        assertEquals(0, k.zmniejszKonto(350), 0);
    }

    @Test
    public void jezeliNormalnyPrzekraczaDebet_z_Kasa_niePrzekracza_M() {
        Konto k = new Konto(false, false, 100, -100);
        assertEquals(250, k.zmniejszKonto(250), 0);
    }
    @Test
    public void jezeliNormalnyPrzekraczaDebet_z_Kasa_rowna_M() {
        Konto k = new Konto(false, false, 100, -100);
        assertEquals(300, k.zmniejszKonto(300), 0);
    }

    @Test
    public void jezeliNormalnyNiePrzekraczaDebet_bez_Kasy() {
        Konto k = new Konto(false, false, 0, -200);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }

    @Test
    public void jezeliNormalnyZrownaDebet_bez_Kasy() {
        Konto k = new Konto(false, false, 0, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }
    @Test
    public void jezeliNormalnyPrzekraczaDebet_bez_Kasy_Przekracza_M() {
        Konto k = new Konto(false, false, 0, -200);
        assertEquals(0, k.zmniejszKonto(350), 0);
    }

    @Test
    public void jezeliNormalnyPrzekraczaDebet_Bez_Kasy_Rowna_M() {
        Konto k = new Konto(false, false, 0, -100);
        assertEquals(200, k.zmniejszKonto(200), 0);
    }
    @Test
    public void jezeliNormalnyPrzekraczaDebet_Bez_Kasy_niePrzekracza_M() {
        Konto k = new Konto(false, false, 0, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }
    @Test
    public void jezeliNormalnyNiePrzekraczaDebet_minus_Kasy() {
        Konto k = new Konto(false, false, -50, -200);
        assertEquals(100, k.zmniejszKonto(100), 0);
    }

    @Test
    public void jezeliNormalnyZrownaDebet_minus_Kasy() {
        Konto k = new Konto(false, false, -50, -100);
        assertEquals(50, k.zmniejszKonto(50), 0);
    }
    @Test
    public void jezeliNormalnyPrzekraczaDebet_minus_Kasy_Przekracza_M() {
        Konto k = new Konto(false, false, -50, -200);
        assertEquals(0, k.zmniejszKonto(400), 0);
    }

    @Test
    public void jezeliNormalnyPrzekraczaDebet_minus_Kasy_Rowna_M() {
        Konto k = new Konto(false, false, -50, -100);
        assertEquals(150, k.zmniejszKonto(150), 0);
    }
    @Test
    public void jezeliNormalnyPrzekraczaDebet_minus_Kasy_niePrzekracza_M() {
        Konto k = new Konto(false, false, -50, -100);
        assertEquals(70, k.zmniejszKonto(70), 0);
    }


}
