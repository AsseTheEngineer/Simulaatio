/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

/**
 *
 * @author Sinh
 */
public class Baari {

    final int kalja;
    final int siideri;
    final int jallu;
    final int jekku;
    Henkilo henkilo;

    public Baari(int kalja, int siideri, int jallu, int jekku) {
        this.kalja = kalja;
        this.siideri = siideri;
        this.jallu = jallu;
        this.jekku = jekku;
    }

    public String ostaJuoma(int juoma) {
        boolean maksuLapi;
        String kommentti = "";
        double humalaTila = henkilo.getHumalatila();
        switch (juoma) {
            case 1:
                maksuLapi = henkilo.uusiMaksu((double) kalja);
                if (maksuLapi == true) {
                    kommentti = "Tässä kaljasi.";
                    henkilo.setHumalatila(humalaTila + 0.5);
                } else {
                    kommentti = "Sulla ei ole tarpeeksi rahaa.";
                }
                break;
            case 2:
                maksuLapi = henkilo.uusiMaksu((double) siideri);
                if (maksuLapi == true) {
                    kommentti = "Tässä siiderisi.";
                    henkilo.setHumalatila(humalaTila + 0.5);
                } else {
                    kommentti = "Sulla ei ole tarpeeksi rahaa.";
                }
                break;
            case 3:
                maksuLapi = henkilo.uusiMaksu((double) jallu);
                if (maksuLapi == true) {
                    kommentti = "Tässä jallusi.";
                    henkilo.setHumalatila(humalaTila + 0.7);
                } else {
                    kommentti = "Sulla ei ole tarpeeksi rahaa.";
                }
                break;
            case 4:
                maksuLapi = henkilo.uusiMaksu((double) jekku);
                if (maksuLapi == true) {
                    kommentti = "Tässä jekkusi";
                    henkilo.setHumalatila(humalaTila + 0.7);
                } else {
                    kommentti = "Sulla ei ole tarpeeksi rahaa.";
                }
                break;
        }
        return kommentti;
    }

    public String tanssi() {
        double random = Math.random();
        String kommentti = "";
        if (random >= 0 && random <= 0.33) {
            kommentti = "Tanssit kuin Michael Jackson! Ainakin omasta mielestäsi.";
        } else if (random > 0.33 && random <= 0.66) {
            kommentti = "Vedät päin helvettiä, mutta et anna sen häiritä.";
        } else {
            kommentti = "Kaaduit ja nolasit itsesi täysin.";
        }
        return kommentti;
    }

    public String puhuPaskaa() {
        double random = Math.random();
        String kommentti = "";
        if (random >= 0 && random <= 0.49) {
            kommentti = "Puhuit tuntemattomalle ja sait melkein turpaasi.";
        } else if (random >= 0.5) {
            kommentti = "Puhuit tuntemattomalle naiselle ja sait vihreää valoa.";
        }
        return kommentti;

    }
}
