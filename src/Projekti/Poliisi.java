package Projekti;

public class Poliisi {

    Henkilo henkilo;
    public int sakot;

    /*Otin huomautukset pois ja siirsin ne "henkilölle" 
    koska henkilö on olio ja jos huomautukset olisi ollut poliisi oliolla ei usesalle henkilölle pystyisi antaa huomautuksia
    koska huomautukset on poliisilla
     */
    public Poliisi() {
        this.sakot = 50;
    }

    public Poliisi(int sakot) {
        this.sakot = sakot;
        //this.henkilo = henkilo; <-- mitäköhä toiki tekee
    }

    public void setSakot(int sakko) {
        this.sakot = sakko;
    }

    public String maksaSakot(Henkilo henkilo) {
        boolean onnistuiko;
        onnistuiko = henkilo.uusiMaksu(sakot);
        String kommentti;

        if (onnistuiko == true) {
            kommentti = "sakkojen maksu onnistui";
        } else {
            kommentti = "sakkojen maksu epäonnistui";
        }
        return kommentti;
    }

    /* Toi metodi on periaattees turha koska ton kommentoi voi laittaa huomautus metodiin
    String joudutPutkaan(){
            return "Mitä tuli tehtyä jouduit putkaan";
   }*/
    //Tohon lisäsin henkilön mikä annetaa kun kutsutaan tota metodia
    //(Auttaa siinä että voidaan antaa se huomautus sille henkilölle ei poliisille)
    String huomautus(Henkilo henkilo) {
        int huomautukset = henkilo.getHuomautukset();
        String kommentti = "";

        if (huomautukset <= 1 && henkilo.getJuomat() > 0) {
            henkilo.lisaaHuomautus();
            henkilo.juoOmaJuoma();
            kommentti = "Korkkaat juoman repustasi huomaamatta, että herra konstaapeli on selkäsi takana. Pääset kuitenkin pälkähästä pelkällä huomautuksella.";
        } else if (huomautukset == 2) {
            henkilo.lisaaHuomautus();
            kommentti = "sakot kommentti 2";
            maksaSakot(henkilo);
        } else if (huomautukset > 2 && henkilo.getJuomat() > 0) {
            kommentti = "Samainen konstaapeli, joka on sinulle jo aikaisemmin antanut huomautuksen sattuu jälleen kerran paikalle. Tällä kertaa hän ei ole yhtä suvaitsevainen. Pääset maijan kyydillä putkaan.";
        }

        return kommentti;
    }
}
