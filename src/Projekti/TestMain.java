package Projekti;

import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {
        
        
        
        //Alla esimerkki miten koko paskaa pyöritetää sit lopuks
        
        
        Henkilo jarno = new Henkilo(100, "Jarno", "Penttilä", 3, 5);
        Baari prkl = new Baari(4,4,5,5);
        Baari boothill = new Baari(4, 5, 6, 6);
        Poliisi poliisi = new Poliisi(40);
        Koti jarnonKoti = new Koti(100, 5);
        Kaverinkamppa makenKoti = new Kaverinkamppa(5, 50);
        Puisto kaivopuisto = new Puisto();
        Paikka paikka = new Paikka(jarno, poliisi);
        
        String tarina;
        
        
        paikka.addBaari(prkl);
        paikka.addBaari(boothill);
        
        
        
        
        int kello = 0;
        
        while (jarno.gameOver() != 1 || kello != 4 || jarno.getHumalatila() < 10) {
            
            paikka.simulointi();
            
        }
        
        tarina = paikka.getTarina();
        System.out.println(tarina);
    }
    
}
