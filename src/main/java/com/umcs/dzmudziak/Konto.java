package com.umcs.dzmudziak;

public class Konto {
    private double stan;
    private double debet;
    private double maksymalnaKwotaPrzekroczeniaDebetu;
    private boolean vipStatus;
    private boolean firmowe;

    public Konto(boolean vipStatus, double stan, double debet) {
        this.debet = debet;
        this.stan = stan;
        this.vipStatus = vipStatus;
    }


    public double zmniejszKonto(double kwota) {
        // warunek ? <co jesli true> : <co jesli false>;
        double maksymalnaKwotaPrzekroczeniaDebetu = vipStatus ? (stan < 0 ? -1000 : -2000) : -100;
        if (kwota > stan - (debet + maksymalnaKwotaPrzekroczeniaDebetu)) {
            return 0;
        }
        stan = stan - kwota;
        return kwota;
    }
}



