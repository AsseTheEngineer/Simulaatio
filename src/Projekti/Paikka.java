package Projekti;

import java.util.Date;

public class Paikka {
    String tapahtumat;
    Date date = new Date();
    double random;
    
    public void simulointi(Henkilo henkilo, Poliisi poliisi, Baari baari, Koti koti, Puisto puisto, Kaverinkamppa kaveri) {
        this.random = Math.random();
        
        if (random >= 0 && random <= 0.2) {
            //50% change et se tekee jotai enne ku vaihtaa paikkaa
            //50% change et se vetää omii juomii 50% et vaihtaa paikkaa jos juo omii juomii 50% change et poliisi antaa huomautukse
            //random = Math.random();
            if (random >= 0 && random < 0.1) {
                tapahtumat += "[" + date + "] " + poliisi.huomautus(henkilo) + "\n";
            }else if (random >= 0.1 && random <= 2) {
                tapahtumat += "[" + date + "] " + henkilo.juoOmaJuoma() + "\n";
            }
            
            
            /*
            Laita baarit taulukkoon ja randomoi mihin baariin ollaa menos
            */
            
        }else if (random > 0.2 && random <= 0.4) { //baari
            random = Math.random();
            if (random >= 0 && random < 0.33) {
                random = ((int)Math.random() * 5);
                tapahtumat += "[" + date + "] " + baari.ostaJuoma((int)random) + "\n";
            }else if (random >= 0.33 && random < 0.66) {
                tapahtumat += "[" + date + "] " + baari.tanssi() + "\n";
            }else if (random >= 0.66 && random < 1) {
                tapahtumat += "[" + date + "] " + baari.puhuPaskaa() + "\n";
            }
        }else if (random > 0.4 && random <= 0.6) {
            //tohon viel loput paikat 
        }
    }
    
}
