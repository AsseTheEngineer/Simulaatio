
package Projekti;


public class Puisto {
    
    /*
    lisätkää tomintoja:
    
    löytää rahaa
    löydät vinaa
    juttelee naisille
    koira hyökkäs
    
    
    */
    
    String loysitRahaa(){
        int random = (int)(Math.random()*20);
        return "löysit: "+random+" Rahaa";
    }  
    String löysitViinaa(){
       return "löysit vanhentunutta viinaa puistosta"; 
    }
    String jutteleNaiselle(){
        return "";
    }
    String koiraHyökkäs(){
        return "koira hyökkäs kimpuusi omistaja syyttää sua";
    }

    
}
