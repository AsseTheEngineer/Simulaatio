package Projekti;

public class Poliisi {

    Henkilo henkilo;
    public int sakot;

    public Poliisi() {
        this.sakot = 50;
    }

    public Poliisi(int sakot) {
        this.sakot = sakot;
    }

    public void setSakot(int sakko) {
        this.sakot = sakko;
    }

    public Boolean maksaSakot(Henkilo henkilo) {
        boolean onnistuiko;
        onnistuiko = henkilo.uusiMaksu(sakot);

        return onnistuiko;
    }

    String huomautus(Henkilo henkilo){
       int huomautukset = henkilo.getHuomautukset();
       String kommentti = "";
       boolean maksu;
       
       if(huomautukset < 1){
            henkilo.lisaaHuomautus();
            kommentti = "Korkkaat juoman repustasi huomaamatta, että herra konstaapeli on selkäsi takana. Pääset kuitenkin pälkähästä pelkällä huomautuksella.";
       }else if(huomautukset >= 1 && huomautukset < 2){
           //henkilo.lisaaHuomautus();
           kommentti ="Virkavalta yllättää taas kesken juomisen ja herra poliisisetä ojentaa sinulle " + sakot + "€ sakkolapun.";
           maksu = maksaSakot(henkilo);
           if (maksu == true) {
               kommentti += "\nMaksat sakot sen enempää mukisematta ja toivot että et enää törmää virkavaltaan illan aikana.";
               henkilo.lisaaHuomautus();
           }else {
               kommentti += "\nSinulla ei ollut varaa maksaa sakkoja joten herra konstaapeli päättää että loppuilta vietetäänkin putkan puolella";
               henkilo.lisaaHuomautus();
               henkilo.lisaaHuomautus();
           }
       } else if(huomautukset > 2){
            kommentti = "Samainen konstaapeli, joka on sinulle jo aikaisemmin antanut huomautuksen sattuu jälleen kerran paikalle. Tällä kertaa hän ei ole yhtä suvaitsevainen. Pääset maijan kyydillä putkaan.";
        }

        return kommentti;
    }
}
