package Projekti;

import java.util.Date;
import java.util.ArrayList;
import java.util.Date;

public class Paikka {
    
    String tapahtumat = "";
    Date date = new Date();
    
    ArrayList<Baari> baarit = new ArrayList<>();
    
    Henkilo henkilo;
    Poliisi poliisi;
    Koti koti;
    Kaverinkamppa kaveri;
    Puisto puisto;
    double random;
    int apu = 0;
    int tunnit, minuutit, aikavali;

    public Paikka(Henkilo henkilo, Poliisi poliisi, Koti koti, Kaverinkamppa kaveri, Puisto puisto) {
        this.tunnit = 20;
        this.minuutit = 0;
        this.henkilo = henkilo;
        this.poliisi = poliisi;
        this.koti = koti;
        this.kaveri = kaveri;
        this.puisto = puisto;
        this.aikavali = 20;
    }
    
    public void setAikavali(int vali) {
        this.aikavali = vali;
    }

    public void addBaari(Baari baari) {
        baarit.add(baari);
    }

    public String kello(){
        String aika = "";
        if (minuutit > 59) {
            if (tunnit < 23) {
                tunnit++;
            }else {
                tunnit = 0;
            }
            minuutit = 0;
        }
        
        if (tunnit < 10) {
            aika = "0" + tunnit;
        }else {
            aika = "" + tunnit;
        }
        
        if (minuutit == 0){
            aika += ":0" + minuutit;
        }else {
            aika += ":" + minuutit;
        }
        return aika;
    }
    
    public void simulointi() {
        
        this.random = Math.random();
        //System.out.println(tapahtumat);
        if (random <= 0.2) { // katu
            tapahtumat += "[" + kello() + ", katu]";
            katu();

        } else if (random > 0.2 && random <= 0.4) { //baari
            random = (int) (Math.random() * baarit.size());
            tapahtumat += "[" + kello() + ", " + baarit.get((int)random).getNimi() + "]";
            baari(baarit.get((int)random));

        } else if (random > 0.4 && random <= 0.6) { //koti
            tapahtumat += "[" + kello() + ", Koti]";
            koti();
            //tohon viel loput paikat   

        } else if (random > 0.6 && random <= 0.8) { // kaverin kämppä
            tapahtumat += "[" + kello() + ", Kaverin kämppä]";
            kaverinKoti();

        } else { //puisto
            tapahtumat += "[" + kello() + ", puisto]";
            puisto();
        }
        minuutit += aikavali;
    }

    public void baari(Baari baari) {
        random = Math.random();
        int random1;
        
        if (random <= 0.33) {
            random1 = (int) (Math.random() * 4);
            tapahtumat += baari.ostaJuoma((int) random1, henkilo) + "\n";
            
        } else if (random > 0.33 && random <= 0.66) {
            tapahtumat += baari.tanssi() + "\n";
        } else {
            tapahtumat += baari.puhuPaskaa() + "\n";
        }
    }

    public void katu() {
        //Muokkaa uusiks
        random = Math.random();
        
            if (random <= 0.33) {
                tapahtumat += poliisi.huomautus(henkilo) + "\n"; //"[" + date + "] " +
            } else {
                 tapahtumat += henkilo.juoOmaJuoma() + "\n";
            }
        
    }

    public void kaverinKoti() {
        double random = Math.random();
        if (random <= 0.25) {
            tapahtumat += kaveri.juoJuoma(henkilo) + "\n";
        }else if (random > 0.25 && random <= 0.5) {
            tapahtumat += kaveri.otaKaverinJuoma(henkilo) + "\n";
        }else if (random > 0.5 && random <= 0.75) {
            tapahtumat += kaveri.otaRahaa(henkilo) + "\n";
        }else {
            tapahtumat += kaveri.puhuPaskaa(henkilo) + "\n";
        }
    }

    public void koti() {
        random = Math.random();
        int sum = (int)(Math.random() * koti.getSaastot());
        if (random <= 0.4) {
            tapahtumat += koti.otaJuomia() + "\n";
        }else if (random > 0.4 && random <= 0.7) {
            tapahtumat += koti.omaJuoma() + "\n";
        }else {
            tapahtumat += koti.otaRahaa(sum) + "\n";
        }

    }

    public void puisto() {
        random = Math.random();
        if (random <= 0.5) {
            tapahtumat += puisto.juoOmajuoma(henkilo) + "\n";
        }else {
            tapahtumat += puisto.pummiJuoma(henkilo) + "\n";
        }
    }

    public String getTarina() {
        return tapahtumat;
    }
}
