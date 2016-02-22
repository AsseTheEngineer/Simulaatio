package Projekti;

import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {
        
        
        
        //Alla esimerkki miten koko paskaa pyöritetää sit lopuks
        
        
        Henkilo jarno = new Henkilo(100, "Jarno", "Penttilä", 3, 5);
        Baari prkl = new Baari(4,4,5,5, "prkl");
        Baari boothill = new Baari(4, 5, 6, 6, "Boothill");
        Poliisi poliisi = new Poliisi(40);
        Koti jarnonKoti = new Koti(jarno);
        Kaverinkamppa makenKoti = new Kaverinkamppa(5, 50);
        Puisto kaivopuisto = new Puisto();
        Paikka paikka = new Paikka(jarno, poliisi);
        
        int gameOver = 0;
        String tarina;
        double humalatila = jarno.getHumalatila();
        
        paikka.addBaari(prkl);
        paikka.addBaari(boothill);
        
        int kello = 0;
        
        while (gameOver != 1) {
            if (jarno.getHumalatila() > 10) {
                gameOver = 1;
            }else if (kello == 4) {
                gameOver = 1;
            }else if (jarno.getHuomautukset() >= 2) {
                gameOver = 1;
            }
            paikka.simulointi();
        }
        
        System.out.println(paikka.getTarina());
    }
    
}
