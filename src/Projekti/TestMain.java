package Projekti;

public class TestMain {

    public static void main(String[] args) {
        //System.out.println("Testi");
        
        Koti koti;
        Poliisi pol = new Poliisi(50);
        Henkilo henk = new Henkilo(12,100,"kalle","kaapo",1.3,13); //int age, double money, String etuNimi, String sukuNimi, double humalaTila, int juomat
        Puisto puisto = new Puisto();
        Taulukko logBook = new Taulukko(24);
        logBook.taytaTaulukko();
        logBook.toString();
        
        
    }
    
}
