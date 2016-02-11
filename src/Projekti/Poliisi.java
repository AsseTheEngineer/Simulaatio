package Projekti;

public class Poliisi {
    double rahaTililla;//Olio rahan määrällee tilillä 
    int huomautukset = 2;
    
   public Poliisi(){
       
   }
   void maksaSakot(double sakot){
       if(sakot < rahaTililla){
       rahaTililla = rahaTililla - sakot;
       System.out.println("Rahaa jäljellä: "+ rahaTililla);}
       else joudutPutkaan();
       
   }
   void joudutPutkaan(){
            System.out.println("Mitä tuli tehtyä jouduit putkaan");
   }
    void huomautus(){
        if(huomautukset > 0){
            System.out.println("Sait huomautuksen, huomautuksia jäljellä: "+ huomautukset--);
            
        }else joudutPutkaan();
        
        
    }
}
