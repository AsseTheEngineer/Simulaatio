package Projekti;

public class Koti {

    private double saastot;
    private int juomat;

    private Henkilo henkilo;

    public Koti(Henkilo henkilo) {
        this.saastot = 0;
        this.juomat = 0;
        henkilo = henkilo;
    }

    public void setSaastot(double saastot) {
        this.saastot = saastot;
    }

    public void setJuomat(int juomat) {
        this.juomat = juomat;
    }

    public String otaJuomia() {
        int random = (int) (Math.random() * juomat);
        String kommentti = "";

        if (henkilo.getJuomat() < 5 && juomat > 0) {
            henkilo.lisaaJuomaa(random);
            kommentti = "Otit " + random + " juomaa reppuun.";
            juomat -= random;
        } else if (juomat == 0) {
            kommentti = "Jääkaapissa ei ole kuin valo.";
        } else {
            kommentti = "Et tarvitse enempää juomaa, koska sinulla on " + henkilo.getJuomat() + "juomaa jo repussa.";
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
                kommentti = " Jääkaappisi ammottaa tyhjyyttään, mutta onneksi sinulla oli repussa vielä " + henkilo.getJuomat() + "juomaa, joista korkkaat yhen.";
                henkilo.humalatilaPlus(0.5);
                henkilo.juomaMiinus();
            } else if (henkilo.getJuomat() == 0) {
                kommentti = "Kaivat asuntosi joka nurkan, mutta valitettavasti et löydä yhtään juomaa.";
            }

        }
        return kommentti;

    }

    String otaRahaa(int summa, Henkilo henkilo) {
        String kommentti;
        if (henkilo.getRaha() < 50) {
            henkilo.lisaaRahaa(saastot);
            kommentti = "Lompakko reloaded.";

        } else if(saastot==0){
            kommentti = "Olit menossa.";
        }

        return kommentti;
    }

}
