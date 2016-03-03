package Projekti;

public class Koti {

    private double saastot;
    private int juomat;

    private Henkilo henkilo;

    public Koti(Henkilo henkilo) {
        this.saastot = 0;
        this.juomat = 0;
        this.henkilo = henkilo;
    }

    public void setSaastot(double saastot) {
        this.saastot = saastot;
    }

    public void setJuomat(int juomat) {
        this.juomat = juomat;
    }

    public double getSaastot() {
        return saastot;
    }

    public String otaJuomia() {
        int random = (int) (Math.random() * juomat);
        String kommentti;

        if (henkilo.getJuomat() < 5 && juomat > 0) {
            henkilo.lisaaJuomaa(random);
            kommentti = "Käyt jääkaapilla lataamassa panokset. Otit " + random + " juomaa reppuun.";
            juomat -= random;
        } else if (juomat == 0) {
            kommentti = "Ajattelit käydä hakemassa matkajuomaa jääkaapista, mutta valitettavasti siellä ei ole kuin valo.";
        } else {
            kommentti = "Ajattelit käydä hakemassa matkajuomaa jääkaapista, mutta muistitkin, että sinulla on " + henkilo.getJuomat() + " juomaa jo repussa.";
        }
        return kommentti;

    }

    public String omaJuoma() {
        String kommentti = "";
        if (juomat > 0) {
            kommentti = "Kaivat jääkaapista kylmän huurteisen ja imaiset sen ykkösellä kitusiisi.";
            juomat--;
            henkilo.humalatilaPlus(0.5);
        } else if (juomat == 0) {
            if (henkilo.getJuomat() > 0) {
                kommentti = " Jääkaappisi ammottaa tyhjyyttään, mutta onneksi sinulla oli repussa vielä " + henkilo.getJuomat() + " juomaa, joista korkkaat yhden.";
                henkilo.humalatilaPlus(0.5);
                henkilo.juomaMiinus();
            } else if (henkilo.getJuomat() == 0) {
                kommentti = "Kaivat asuntosi joka nurkan, mutta valitettavasti et löydä yhtään juomaa.";
            }

        }
        return kommentti;

    }

    String otaRahaa(int summa) {
        String kommentti = "";
        if (henkilo.getRaha() < 20) {

            kommentti = "Käyt kaivamassa patjojen välistä lisää rahaa illan koitoksia varten.";
            henkilo.lisaaRahaa(saastot);

        } else if (saastot == 0 && henkilo.getRaha() < 20) {
            kommentti = "Menit pöyhimään tyynyliinaa rahan toivossa vain todetaksesi, että rahat on loppu.";
        } else if (henkilo.getRaha() < 20) {
            kommentti = "Meinasit mennä hakemaan lisää rahaa, mutta muistit olevasi pihi. Joten päätät pärjätä lompakossa olevalla summalla.";
        }

        return kommentti;
    }

}
