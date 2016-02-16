package Projekti;

public class Henkilo {
    private final int ika;
    private double lompakko;
    private final String etunimi;
    private final String sukunimi;
    private double humalatila;
    private int juomat;
    
    public Henkilo(int age, double money, String etuNimi, String sukuNimi, double humalaTila, int juomat) {
        this.ika = age;
        this.lompakko = money;
        this.etunimi = etuNimi;
        this.sukunimi = sukuNimi;
        this.humalatila = humalaTila;
        this.juomat = juomat;
    }   
    int getIka() {
        return ika;
    }
    
    double getRaha() {
        return lompakko;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public double getHumalatila() {
        return humalatila;
    }

    public int getJuomat() {
        return juomat;
    }

    public void setLompakko(double lompakko) {
        this.lompakko = lompakko;
    }

    public void setHumalatila(double humalatila) {
        this.humalatila = humalatila;
    }
    
    public void humalatilaPlus(double maara) {
        this.humalatila += maara;
    }
    
    public void humalatilaMiinus(double maara) {
        this.humalatila -= maara;
    }

    public void setJuomat(int juomat) {
        this.juomat = juomat;
    }
    
    public void lisaaRahaa(double summa) {
        this.lompakko += summa;
    }
    public void lisaaJuomaa(int juomat){
        this.juomat += juomat;
    }
    
    public boolean uusiMaksu(double maksu) {
        boolean success = false;
        if (lompakko >= maksu) {
            lompakko -= maksu;
            success = true;
        }else if (lompakko < maksu) {
            success = false;
        }   
        return success;
    }
    
    public String juoOmaJuoma() {
        String kommentti;
        if (this.juomat > 0) {
            this.juomat--;
            kommentti = "Kyllähän se kalja on hyvää";
        }else {
            kommentti = "Juomat on loppu";
        }
        return kommentti;
    }

    @Override
    public String toString() {
        return "Henkilo{" + "ika=" + ika + ", lompakko=" + lompakko + ", etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", humalatila=" + humalatila + ", juomat=" + juomat + '}';
    }
    
    
}
