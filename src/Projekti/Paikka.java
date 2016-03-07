package Projekti;

import java.util.ArrayList;

public class Paikka {
    
    String tapahtumat = "";
    
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
    
    public void reset() {
        tapahtumat = "";
        tunnit = 20;
        minuutit = 0;
    }
    
    public int getAikavali() {
        return aikavali;
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

    public int getTunnit() {
        return tunnit;
    }
    
    public void simulointi() {
        
       double random = Math.random();
        //System.out.println(tapahtumat);
        if (random >= 0 && random <= 0.15) { // katu
            tapahtumat += "[" + kello() + ", katu]";
            katu();

        } else if (random > 0.15 && random <= 0.45) { //baari
            random = (int) (Math.random() * baarit.size());
            tapahtumat += "[" + kello() + ", " + baarit.get((int)random).getNimi() + "]";
            baari(baarit.get((int)random));

        } else if (random > 0.45 && random <= 0.6) { //koti
            tapahtumat += "[" + kello() + ", Koti]";
            koti();
            //tohon viel loput paikat   

        } else if (random > 0.6 && random <= 0.8) { // kaverin kämppä
            tapahtumat += "[" + kello() + ", Kaverin kämppä]";
            kaverinKoti();

        } else if (random > 0.8 && random <= 1){ //puisto
            tapahtumat += "[" + kello() + ", puisto]";
            puisto();
        }
        //tapahtumat += "\n" + "Rahat: " + henkilo.getRaha() + "€ Humalatila: " + henkilo.getHumalatila() + " Juomat: " + henkilo.getJuomat() + "\n";
        minuutit += aikavali;
    }
    
    public void addTapahtuma(String tapahtuma) {
        tapahtumat += tapahtuma;
    }

    public void baari(Baari baari) {
        random = Math.random();
        
        if (random <= 0.5) {
            random = Math.random();
            tapahtumat += baari.ostaJuoma(random, henkilo) + "\n";
            
        } else if (random > 0.5 && random <= 0.75) {
            tapahtumat += baari.tanssi() + "\n";
        } else {
            tapahtumat += baari.puhuPaskaa() + "\n";
        }
    }

    public void katu() {
        //Muokkaa uusiks
        random = Math.random();
        tapahtumat += henkilo.juoOmaJuoma() + "\n";
            if (random >= 0 && random <= 0.4) {
                tapahtumat += poliisi.huomautus(henkilo); //"[" + date + "] " +
            }
    }

    public void kaverinKoti() {
        double random = Math.random();
        if (random <= 0.3) {
            tapahtumat += kaveri.juoJuoma(henkilo) + "\n";
        }else if (random > 0.3 && random <= 0.6) {
            tapahtumat += kaveri.otaKaverinJuoma(henkilo) + "\n";
        }else if (random > 0.6 && random <= 0.80) {
            tapahtumat += kaveri.otaRahaa(henkilo) + "\n";
        }else {
            tapahtumat += kaveri.puhuPaskaa(henkilo) + "\n";
        }
    }

    public void koti() {
        random = Math.random();
        int sum = (int)(Math.random() * koti.getSaastot());
        if (random <= 0.3) {
            tapahtumat += koti.otaJuomia() + "\n";
        }else if (random > 0.3 && random <= 0.7) {
            tapahtumat += koti.omaJuoma() + "\n";
        }else {
            tapahtumat += koti.otaRahaa(sum) + "\n";
        }

    }

    public void puisto() {
        random = Math.random();
        if (random <= 0.5) {
            tapahtumat += puisto.juoOmajuoma(henkilo) + "\n";
        }else if (random > 0.5){
            tapahtumat += puisto.pummiJuoma(henkilo) + "\n";
        }
    }

    public String getTarina() {
        return tapahtumat;
    }
}
