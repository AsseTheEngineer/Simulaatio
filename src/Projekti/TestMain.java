package Projekti;

public class TestMain {

    public static Henkilo jarno = new Henkilo(100, "Jarno", "Penttilä", 3, 5);
        
    public static Baari prkl = new Baari(4,4,5,5, "prkl");
    public static Baari boothill = new Baari(4, 5, 6, 6, "Boothill");
        
    public static Poliisi poliisi = new Poliisi(40);
    public static Koti jarnonKoti = new Koti(jarno);
    public static Kaverinkamppa makenKoti = new Kaverinkamppa(5, 50);
    public static Puisto kaivopuisto = new Puisto(poliisi);
    public static Paikka paikka = new Paikka(jarno, poliisi, jarnonKoti, makenKoti, kaivopuisto);
    
    public static String simuloi() {
        int gameOver = 0;
        
        while (gameOver != 1) {
            paikka.simulointi();
            //System.out.println("\n" + jarno.getHumalatila() + "\n");
            if (jarno.getHumalatila() >= 10) {
                gameOver = 1;
            }else if (paikka.kello().equals("04:20")) {
                gameOver = 1;
            }else if (jarno.getHuomautukset() >= 3) {
                gameOver = 1;
            }  
        }
        return paikka.getTarina();
    }
    
    
    public static void main(String[] args) {
        
        
        
        //Alla esimerkki miten koko paskaa pyöritetää sit lopuks
        
        
        Henkilo jarno = new Henkilo(100, "Jarno", "Penttilä", 3, 5);
        Baari prkl = new Baari(4,4,5,5, "prkl");
        Baari boothill = new Baari(4, 5, 6, 6, "Boothill");
        Poliisi poliisi = new Poliisi(40);
        Koti jarnonKoti = new Koti(jarno);
        Kaverinkamppa makenKoti = new Kaverinkamppa(5, 50);
        Puisto kaivopuisto = new Puisto(poliisi);
        Paikka paikka = new Paikka(jarno, poliisi, jarnonKoti, makenKoti, kaivopuisto);
        
        int gameOver = 0;
        
        paikka.addBaari(prkl);
        paikka.addBaari(boothill);

        while (gameOver != 1) {
            paikka.simulointi();
            System.out.println(jarno.toString());
            //System.out.println("\n" + jarno.getHumalatila() + "\n");
            if (jarno.getHumalatila() >= 10) {
                gameOver = 1;
            }else if (paikka.kello().equals("04:20")) {
                gameOver = 1;
            }else if (jarno.getHuomautukset() >= 2) {
                gameOver = 1;
            }
            
        }
        
        System.out.println(paikka.getTarina());
        System.out.println("Huomautukset: " + jarno.getHuomautukset());
        System.out.println("Humalatila: " + jarno.getHumalatila());
        System.out.println("Kakke");
    }
    
}
