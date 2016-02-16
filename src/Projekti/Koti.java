package Projekti;

public class Koti {
   private double saastot;
   private int juomat;
   
    
    public Koti(int saastot, int juomat){
        this.saastot = saastot;
        this.juomat = juomat;
    }
    public void setSaastot(double saastot) {
        this.saastot = saastot;
    }
    public void setJuomat(int juomat) {
        this.juomat = juomat;
    }
    public double getSaastot() {
        return saastot;
    }
    public int getJuomat() {
        return juomat;
    }
    String juodaan(Henkilo henkilo){     
        String kommentti;
        
        if(juomat > 0 ){
            kommentti = "Ai ai maistuu hyvältä";
           henkilo.humalatilaPlus(0.3);
            juomat--;
        }else kommentti = " juomat lopppu";
            
       return kommentti;
    }
  
    String otaSaastoja(int summa){
        String kommentti;
        if(saastot > summa){
            saastot = saastot - summa;
            kommentti = "saastoja jäljellä: "+ saastot;} 
        else kommentti = "Ei ole rahaa!!";
        
        return kommentti;
    }
    String lahdetaanKotoa(Henkilo henkilo){
        String kommentti;
        double random = Math.random();
        if(random > 0 && random <= 0.4){
            henkilo.lisaaJuomaa(juomat);
            kommentti = "Lähden muualle juomaan ja otan loput juomat mukaan";
        }
        else
            kommentti = "juomia on jäjljellä, lähetään joka jonnekin joka tapauksessa";
        
        return kommentti;
    }

    
}
