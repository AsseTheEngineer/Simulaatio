/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

/**
 *
 * @author Sinh
 */
public class Kaverinkamppa {

    final int kaverinJuoma;
    final double kaveriRahat;

    public Kaverinkamppa(int kaverinJuoma, double kaveriRahat) {
        this.kaverinJuoma = kaverinJuoma;
        this.kaveriRahat = kaveriRahat;
    }

    public String otaRahaa(Henkilo henkilo) {
        String kommentti = "";
        if (henkilo.getRaha() > 20) {
            henkilo.lisaaRahaa(20);
            kommentti = "Lainasit kaverilta 20€.";
        } else {
            kommentti = "Mitä helvettiä, sullahan on rahaa!";
        }
        return kommentti;

    }
    public String otaJuomia(Henkilo henkilo){
        String kommentti = "";
        if (henkilo.getJuomat()<3){
            henkilo.lisaaJuomaa(1);
            kommentti="Otit yhden juoman jääkaapista.";
        }else{
            kommentti="Mitä vittua! Sullahan on omia juomia!";
        }
        return kommentti;}
    
    public String puhuPaskaa(Henkilo henkilo){
        
        String kommentti="";
        
        if (henkilo.getHumalatila()<5) {
            kommentti="Kerrot kaverillesi gravitaatioaaltoteoriasta.";}
        else if(henkilo.getHumalatila()>=5 && henkilo.getHumalatila()<10){
            kommentti="Alat olemaan sen verran humalassa, ettei kaverisi saa oikein selvää mistä puhut.";}
        return kommentti;
        
            
                    
            
        
    }   
    }



