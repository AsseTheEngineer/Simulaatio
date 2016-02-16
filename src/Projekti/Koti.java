package Projekti;

public class Koti {
   private double saastot;
   private int juomat;
   
  private Henkilo henk;
    
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
    String juodaan(){
       return "Ei jaksa, juodaan kotona";
    }
    String juotu(){
        return "no niin juotu: "+juomat+" juomaa";
    }
    String otaSaastoja(int summa){
        String kommentti;
        if(saastot > summa){
            saastot = saastot - summa;
            kommentti = "saastoja jäljellä: "+ saastot;} 
        else kommentti = "Ei ole rahaa!!";
        return kommentti;
    }
    

    
}
