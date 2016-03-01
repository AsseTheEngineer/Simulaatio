package Projekti;

import java.util.ArrayList;
import java.util.Date;

public class Taulukko {
    ArrayList logBook;
    Date time = new Date(20,00,00);
    int minutes = 20;
    final long minute = 60000;//millisec
    long curTimeInMs = time.getTime();
    
    //
    //
    
    public Taulukko(){
        this.logBook = new ArrayList();
        for (int i = 0; i > logBook.size(); i++) {
            logBook[i] = "[" + time + "] ";
            time = new Date(curTimeInMs + (minutes * minute));
        }
    }
    
    public void taytaTaulukko() {
        for (int i = 0; i > logBook.length; i++) {
            logBook[i] = "[" + time + "] ";
            time = new Date(curTimeInMs + (minutes * minute));
        }
    }
    
    @Override
    public String toString() {
        String tulostus = "";
        for (String logBook1 : logBook) {
            tulostus += logBook1 + "\n";
        }
        return tulostus;
    }
    
    
}
