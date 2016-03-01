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
public class Kaverinkamppa {

    final int kaverinJuoma;
    final double kaveriRahat;

    public Kaverinkamppa() {
        this.kaverinJuoma = 5;
        this.kaveriRahat = 50;
    }
    
    public Kaverinkamppa(int kaverinJuoma, double kaveriRahat) {
        this.kaverinJuoma = kaverinJuoma;
        this.kaveriRahat = kaveriRahat;
    }

    public String otaRahaa(Henkilo henkilo) {
        String kommentti = "";
        if (henkilo.getRaha() > 20) {
            henkilo.lisaaRahaa(20);
            kommentti = "Rahatilanteesi on heikko. Pyydät kaveriltasi parikymppiä lainaa, jonka hän yllätyksesesi lainaa.";
        } else {
            kommentti = "Yrität vedättää kaveriasi valehtelemalla, että sinulla ei ole rahaa ja tarvitset lainaa. Kaverisi lukee sinua kuin avointa kirjaa ja lyö sinua.";
        }
        return kommentti;

    }

    public String juoJuoma(Henkilo henkilo) {
        String kommentti = "";
        henkilo.humalatilaPlus(0.5);
        kommentti = "Otat yhden juoman kaverisi jääkaapista ja huitaiset sen ykkösellä nieluusi. Kaverisi katsoo sinua pahasti, mutta et anna sen häiritä.";

        return kommentti;
    }

    public String puhuPaskaa(Henkilo henkilo) {

        String kommentti = "";

        if (henkilo.getHumalatila() < 5) {
            kommentti = "Olet vielä sen verran selvin päin, että pystyt kertomaan kaverillesi gravitaatioaaltoteoriasta.";
        } else if (henkilo.getHumalatila() >= 5 && henkilo.getHumalatila() < 10) {
            kommentti = "Alat olemaan sen verran humalassa, ettei kaverisi saa oikein selvää mistä puhut.";
        }else{
            kommentti = "puhu kommentti 3";
        }
        return kommentti;

    }

    public String otaKaverinJuoma(Henkilo henkilo) {
        String kommentti = "";
        if (henkilo.getJuomat() < 3) {
            henkilo.lisaaJuomaa(4);
            kommentti = "Tarkistat matkajuomatilanteen, mikä ei ole hyvä. Vain " + henkilo.getJuomat() + " juomaa. Nussit kaverisi jääkaapista 4 juomaa.";
        } else {
            kommentti = "Yrität käydä varastamassa kaveriltasi lisää juomaa, vaikka sinulla on jo tarpeeksi sitä. Kaverisi huomaa välittömästi aikeesi ja antaa sinulle litsarin otsaan.";
        }
        return kommentti;

    }
}
