
package Projekti;


public class Puisto {
    
    /*
    löytää rahaa
    löydät vinaa
    juttelee naisille
    koira hyökkäs
    
    
    */
    
    int LoysitRahaa(){
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

    
}
