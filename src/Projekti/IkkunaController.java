/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

import static Projekti.SimulaatioMain.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author Asse
 */
public class IkkunaController implements Initializable {
    
    private int onkoSimuloitu = 0;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField kJuomat;// = new TextField("" + kaverinKoti.getJuomat());
    @FXML
    private TextField kRahat;// = new TextField("" + kaverinKoti.getRahat());
    @FXML
    private TextField aikavali;// = new TextField("" + paikka.getAikavali());
    
    @FXML
    private TextField nimi;// = new TextField(jarno.getEtunimi());
    @FXML
    private TextField sukunimi;// = new TextField(jarno.getSukunimi());
    @FXML
    private TextField juomat;// = new TextField("" + jarno.getJuomat());
    @FXML
    private TextField humalatila = new TextField("" + jarno.getHumalatila());
    @FXML
    private TextField rahat;// = new TextField("" + jarno.getRaha());
    
    @FXML
    private TextField kalja1;// = new TextField("" + baari1.getKalja());
    @FXML
    private TextField kalja2;// = new TextField("" + baari2.getKalja());
    @FXML
    private TextField kalja3;// = new TextField("" + baari3.getKalja());
    @FXML
    private TextField kalja4;// = new TextField("" + baari4.getKalja());
    @FXML
    private TextField kalja5;// = new TextField("" + baari5.getKalja());
    
    @FXML 
    private TextField siideri1;// = new TextField("" + baari1.getSiideri());
    @FXML 
    private TextField siideri2;// = new TextField("" + baari2.getSiideri());
    @FXML 
    private TextField siideri3;// = new TextField("" + baari3.getSiideri());
    @FXML 
    private TextField siideri4;// = new TextField("" + baari4.getSiideri());
    @FXML 
    private TextField siideri5;// = new TextField("" + baari5.getSiideri());
    
    @FXML
    private TextField jallu1;// = new TextField("" + baari1.getJallu());
    @FXML
    private TextField jallu2;// = new TextField("" + baari2.getJallu());
    @FXML
    private TextField jallu3;// = new TextField("" + baari3.getJallu());
    @FXML
    private TextField jallu4;// = new TextField("" + baari4.getJallu());
    @FXML
    private TextField jallu5;// = new TextField("" + baari5.getJallu());
    
    @FXML
    private TextField jekku1;// = new TextField("" + baari1.getJekku());
    @FXML
    private TextField jekku2;// = new TextField("" + baari2.getJekku());
    @FXML
    private TextField jekku3;// = new TextField("" + baari3.getJekku());
    @FXML
    private TextField jekku4;// = new TextField("" + baari4.getJekku());
    @FXML
    private TextField jekku5;// = new TextField("" + baari5.getJekku());
    
    @FXML
    private TextField baari1Nimi;
    @FXML
    private TextField baari2Nimi;
    @FXML
    private TextField baari3Nimi;
    @FXML
    private TextField baari4Nimi;
    @FXML
    private TextField baari5Nimi;
    
    @FXML
    public void simuloiButton(ActionEvent event) {
        if (onkoSimuloitu <= 0) {
            simuloi();
            label.setText(paikka.getTarina() + "\nHuomautukset: " + jarno.getHuomautukset() + "\nHumalatila: " + jarno.getHumalatila());
            onkoSimuloitu = 1;
        }else {
            label.setText("RESETTAA");
        }
    }
    
    @FXML
    public void resetButton(ActionEvent event) {
        jarno = new Henkilo();
        jarnonKoti = new Koti(jarno);
        kaverinKoti = new Kaverinkamppa();
        paikka.reset();
        label.setText("");
        onkoSimuloitu = 0;
    }
    
    @FXML
    public void tallennaButtonHenk(ActionEvent event) {
        jarno.setHumalatila(Double.parseDouble(humalatila.getText()));
        jarno.setLompakko(Double.parseDouble(rahat.getText()));
        jarno.setJuomat(Integer.parseInt(juomat.getText()));
    }
    @FXML
    public void tallennaButtonBar(ActionEvent event) {
        baari1.setKalja(Integer.parseInt(kalja1.getText()));
        baari2.setKalja(Integer.parseInt(kalja2.getText()));
        baari3.setKalja(Integer.parseInt(kalja3.getText()));
        baari4.setKalja(Integer.parseInt(kalja4.getText()));
        baari5.setKalja(Integer.parseInt(kalja5.getText()));
        
        baari1.setSiideri(Integer.parseInt(siideri1.getText()));
        baari2.setSiideri(Integer.parseInt(siideri2.getText()));
        baari3.setSiideri(Integer.parseInt(siideri3.getText()));
        baari4.setSiideri(Integer.parseInt(siideri4.getText()));
        baari5.setSiideri(Integer.parseInt(siideri5.getText()));
        
        baari1.setJallu(Integer.parseInt(jallu1.getText()));
        baari2.setJallu(Integer.parseInt(jallu2.getText()));
        baari3.setJallu(Integer.parseInt(jallu3.getText()));
        baari4.setJallu(Integer.parseInt(jallu4.getText()));
        baari5.setJallu(Integer.parseInt(jallu5.getText()));
        
        baari1.setJekku(Integer.parseInt(jekku1.getText()));
        baari2.setJekku(Integer.parseInt(jekku2.getText()));
        baari3.setJekku(Integer.parseInt(jekku3.getText()));
        baari4.setJekku(Integer.parseInt(jekku4.getText()));
        baari5.setJekku(Integer.parseInt(jekku5.getText()));
        
        baari1.setNimi(baari1Nimi.getText());
        baari2.setNimi(baari2Nimi.getText());
        baari3.setNimi(baari3Nimi.getText());
        baari4.setNimi(baari4Nimi.getText());
        baari5.setNimi(baari5Nimi.getText());
    }
    @FXML
    public void tallennaButtonMuut(ActionEvent event) {
        kaverinKoti.setJuomat(Integer.parseInt(kJuomat.getText()));
        kaverinKoti.setRahat(Double.parseDouble(kRahat.getText()));
        System.out.println("TextField value: " + aikavali.getText());
        paikka.setAikavali(Integer.parseInt(aikavali.getText()));
        System.out.println("Aikaväli: " + paikka.getAikavali());
    }
    
    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setText(){
        //Henkilö asetukset
        nimi.setText(jarno.getEtunimi());
        sukunimi.setText(jarno.getSukunimi());
        juomat.setText("" + jarno.getJuomat());
        humalatila.setText("" + jarno.getHumalatila());
        rahat.setText("" + jarno.getRaha());
        
        //Muut asetukset
        kRahat.setText("" + kaverinKoti.getRahat());
        kJuomat.setText("" + kaverinKoti.getJuomat());
        aikavali.setText("" + paikka.getAikavali());
        
        //Baari asetukset
        kalja1.setText("" + baari1.getKalja());
        kalja2.setText("" + baari2.getKalja());
        kalja3.setText("" + baari3.getKalja());
        kalja4.setText("" + baari4.getKalja());
        kalja5.setText("" + baari5.getKalja());
        
        siideri1.setText("" + baari1.getSiideri());
        siideri2.setText("" + baari2.getSiideri());
        siideri3.setText("" + baari3.getSiideri());
        siideri4.setText("" + baari4.getSiideri());
        siideri5.setText("" + baari5.getSiideri());
        
        jallu1.setText("" + baari1.getJallu());
        jallu2.setText("" + baari2.getJallu());
        jallu3.setText("" + baari3.getJallu());
        jallu4.setText("" + baari4.getJallu());
        jallu5.setText("" + baari5.getJallu());
        
        jekku1.setText("" + baari1.getJekku());
        jekku2.setText("" + baari2.getJekku());
        jekku3.setText("" + baari3.getJekku());
        jekku4.setText("" + baari4.getJekku());
        jekku5.setText("" + baari5.getJekku());
        
        baari1Nimi.setText(baari1.getNimi());
        baari2Nimi.setText(baari2.getNimi());
        baari3Nimi.setText(baari3.getNimi());
        baari4Nimi.setText(baari4.getNimi());
        baari5Nimi.setText(baari5.getNimi());
    }
}
