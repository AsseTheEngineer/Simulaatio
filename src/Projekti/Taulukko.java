package Projekti;

import java.util.Date;

public class Taulukko {
    String[] logBook;
    Date time = new Date(20,00,00);
    
    int minutes = 20;
    final long minute = 60000;//millisecs

    long curTimeInMs = time.getTime();
    
    //
    //
    
    public Taulukko(int aikavali){
        this.logBook = new String[aikavali];
        for (int i = 0; i > logBook.length; i++) {
            logBook[i] = "[" + time + "] ";
            Date time = new Date(curTimeInMs + (minutes * minute));
        }
    }
    
    public String toString() {
        String tulostus = "";
        for (int i = 0; i <= logBook.length; i++){
            tulostus += logBook[i] + "\n";
        }
        return tulostus;
    }
    
    
}
