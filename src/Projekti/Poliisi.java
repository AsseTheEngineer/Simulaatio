package Projekti;

public class Poliisi {
  Henkilo henk;
    final int sakot;
    int huomautukset = 2;
 
    public Poliisi(int sakot){
     this.sakot = sakot;   
    }
 
   String maksaSakot(Henkilo henkilo){
       boolean onnistuiko;
       onnistuiko = henkilo.uusiMaksu(sakot);
       String kommentti;
       
       if(onnistuiko == true)
           kommentti = "sakkojen maksu onnistui";
       else
           kommentti = "sakkojen maksu epäonnistui";
       return kommentti;
   }
   //
   // Laita kaikki toiminnot stringeiks koska "logi" ottaa niista tiedot
   // Kato sintun tekemäst baari classist mallii miten randomoit toimintoi
   void joudutPutkaan(){
            System.out.println("Mitä tuli tehtyä jouduit putkaan");
            //pistä toi yllä oleva stringiks ei käytetä konsoli lopullises ohjelmas
   }
    void huomautus(){
        if(huomautukset > 0){
            System.out.println("Sait huomautuksen, huomautuksia jäljellä: "+ huomautukset--);
            //sama täs ei käytetä konsolii
            
        }else joudutPutkaan();
        
        
    }
}
