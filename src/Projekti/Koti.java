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
    void juodaan(){
        System.out.println("Ei jaksa, juodaan kotona");
    }
    void juotu(){
        System.out.println("no niin juotu: "+juomat+" Rahan edestä");
    }
    void otaRahaa(int summa){
        //säästoiltä otetaan rahaa
        if(saastot > summa){
        saastot = saastot - summa;
        System.out.println("saastoja jäljellä: "+ saastot);}
        
        else System.out.println("Ei ole rahaa!!");
    }
    

    
}
