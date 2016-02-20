package Projekti;

public class TestMain {

    public static void main(String[] args) {
        
        
        
        //Alla esimerkki miten koko paskaa pyöritetää sit lopuks
        Henkilo jarno = new Henkilo(100, "Jarno", "Penttilä", 3, 5);
        int kello = 0;
        
        do {
            
        }while (jarno.gameOver() < 1 || kello >= 4);
        
        
    }
    
}
