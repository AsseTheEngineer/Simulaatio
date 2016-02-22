package Projekti;

import java.util.Date;

public class Paikka {

    String tapahtumat;
    Date date = new Date();
    Baari[] baarit = new Baari[2];
    Henkilo henkilo;
    Poliisi poliisi;
    Koti koti;
    double random;
    int apu = 0;

    public Paikka(Henkilo henkilo, Poliisi poliisi, Koti koti) {
        this.henkilo = henkilo;
        this.poliisi = poliisi;
        this.koti = koti;
    }

    public void addBaari(Baari baari) {
        baarit[apu] = baari;
        baari.toString();
        apu++;
    }

    public void simulointi() {
        this.random = Math.random();
        //System.out.println(tapahtumat);
        if (random >= 0 && random < 0.2) { // katu
            tapahtumat += "[kello, katu]";
            katu();

        } else if (random >= 0.2 && random < 0.4) { //baari
            //random = (int) (Math.random() * 2);
            tapahtumat += "[kello, " + baarit[1].getNimi() + "]";
            baari(baarit[1]);

        } else if (random >= 0.4 && random < 0.6) { //koti
            tapahtumat += "[kello, Koti]";
            koti();
            //tohon viel loput paikat   

        } else if (random >= 0.6 && random < 0.8) { // kaverin kämppä
            tapahtumat += "[kello, Kaverin kämppä]";

        } else if (random >= 0.8 && random <= 1) { //puisto
            tapahtumat += "[kello, puisto]";

        }
    }

    public void baari(Baari baari) {
        random = Math.random();
        if (random >= 0 && random < 0.33) {
            random = (int) (Math.random() * 5);
            tapahtumat += baari.ostaJuoma((int) random, henkilo) + "\n";
        } else if (random >= 0.33 && random < 0.66) {
            tapahtumat += baari.tanssi() + "\n";
        } else if (random >= 0.66 && random < 1) {
            tapahtumat += baari.puhuPaskaa() + "\n";
        }
    }

    public void katu() {
        //Muokkaa uusiks
        random = Math.random();

        tapahtumat += henkilo.juoOmaJuoma() + "\n";
        {
            if (random >= 0 && random <= 0.33) {
                tapahtumat += poliisi.huomautus(henkilo) + "\n"; //"[" + date + "] " +
            }
        }
    }
    

    public void kaverinKoti() {

    }

    public void koti() {
        random = Math.random();
        int sum = (int)(Math.random() * koti.getSaastot());
        if (random > 0 && random < 0.4) {
            tapahtumat += koti.otaJuomia() + "\n";
        }else if (random >= 0.4 && random < 0.7) {
            tapahtumat += koti.omaJuoma() + "\n";
        }else if (random >= 0.7 && random >= 1) {
            tapahtumat += koti.otaRahaa(sum);
        }

    }

    public void puisto() {

    }

    public String getTarina() {
        return tapahtumat;
    }
}
