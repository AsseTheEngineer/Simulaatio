package Projekti;

public class Koti {
   private double saastot;
   private double juomat;
    
    public Koti(double saastot, double juomat){
        this.saastot = saastot;
        this.juomat = juomat;
    }

    public void setSaastot(double saastot) {
        this.saastot = saastot;
    }

    public void setJuomat(double juomat) {
        this.juomat = juomat;
    }

    public double getSaastot() {
        return saastot;
    }

    public double getJuomat() {
        return juomat;
    }
    void juodaan(){
        System.out.println("Ei jaksa, juodaan kotona");
    }
    void juotu(){
        System.out.println("no niin juotu: "+juomat+" Rahan edestä");
    }
    void otaRahaa(double summa){
        //säästoiltä otetaan rahaa
        if(saastot > summa){
        saastot = saastot - summa;
        System.out.println("saastoja jäljellä: "+ saastot);}
        
        else System.out.println("Ei ole rahaa!!");
    }
    

    
}
