package Projekti;

public class Puisto {

    private Poliisi poliisi;

    public Puisto(Poliisi poliisi) {
        this.poliisi = poliisi;

    }

    /*
    lisätkää tomintoja:
    
    löytää rahaa
    löydät vinaa
    juttelee naisille
    koira hyökkäs
    
    
     */
 /* int LoysitRahaa(){
        int random = (int)(Math.random()*20);
        return random;
    }  
    String LöysitViinaa(){
       return "löysit vanhentunutta viinaa puistosta"; 
    }
    String JutteleNaiselle(){
        return "";
    }
    String KoiraHyökkäs(){
        return "koira hyökkäs kimpuusi omistaja syyttää sua";
    }
     */
    public String juoOmajuoma(Henkilo henkilo) {
        String kommentti = "";
        String huomautus;
        double random = Math.random();
        if (random >= 0 && random <= 0.8) {
            kommentti = "Mitäpä puistossa olo olisi ilman pussikaljaa? Ei mitään, joten avaat yhden taskulämpimän.";
            henkilo.juomaMiinus();
            henkilo.humalatilaPlus(0.5);
        } else {
            kommentti = poliisi.huomautus(henkilo);

        }
        return kommentti;
    }

    public String pummiJuoma(Henkilo henkilo) {
        String kommentti = "";
        double random = Math.random();
        if (random >= 0 && random <= 0.5 && henkilo.getJuomat() == 0) {
            kommentti = "Menet pummimaan naapuriseurueelta juoman. Yksi heistä suostuu luopumaan kallisarvoisesta maljastaan. Kumoat juoman siltä seisomalta.";
            henkilo.humalatilaPlus(0.5);
        } else if (random > 0.5 && random <= 0.6) {
            kommentti = "Menet pummimaan naapuriseurueelta juomaa. Saat käteesi epäilyttävän näköisen pullon ja otat ison kulauksen... Lasoliahan se on.";
            henkilo.humalatilaPlus(11);
        } else {
            kommentti = "Menet pummimaan naapuriseurueelta juomaa. Saat palkkioksi haistattelua ja lähdet häntä koipien välissä karkuun.";
        }
        return kommentti;

    }

}
