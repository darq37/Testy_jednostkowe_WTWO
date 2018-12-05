package com.umcs.dzmudziak;

public class Konto {
    private double stan;
    private double debet;
    private double maksymalnaKwotaPrzekroczeniaDebetu;
    private boolean vipStatus;
    private boolean firmowe;

    public Konto(boolean vipStatus, boolean firmowe, double stan, double debet) {
        this.debet = debet;
        this.stan = stan;
        this.vipStatus = vipStatus;
        this.firmowe = firmowe;
    }


    public double zmniejszKonto(double kwota) {
        // warunek ? <co jesli true> : <co jesli false>;
        double max = vipStatus ? (stan < 0 ? -1000 : -2000) : -100;
        double maxFirmowe = firmowe ? -2000 : max;
        if (kwota > stan - (debet + maxFirmowe)) {
            return 0;
        }
        stan = stan - kwota;
        return kwota;
    }
}



