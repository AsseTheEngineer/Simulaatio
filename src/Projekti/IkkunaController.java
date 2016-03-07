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
    private TextField kJuomat;
    @FXML
    private TextField kRahat;
    @FXML
    private TextField aikavali;
    
    @FXML
    private TextField nimi;
    @FXML
    private TextField sukunimi;
    @FXML
    private TextField juomat;
    @FXML
    private TextField humalatila;
    @FXML
    private TextField rahat;
    
    @FXML
    private TextField kalja1;
    @FXML
    private TextField kalja2;
    @FXML
    private TextField kalja3;
    @FXML
    private TextField kalja4;
    @FXML
    private TextField kalja5;
    
    @FXML 
    private TextField siideri1;
    @FXML 
    private TextField siideri2;
    @FXML 
    private TextField siideri3;
    @FXML 
    private TextField siideri4;
    @FXML 
    private TextField siideri5;
    
    @FXML
    private TextField jallu1;
    @FXML
    private TextField jallu2;
    @FXML
    private TextField jallu3;
    @FXML
    private TextField jallu4;
    @FXML
    private TextField jallu5;
    
    @FXML
    private TextField jekku1;
    @FXML
    private TextField jekku2;
    @FXML
    private TextField jekku3;
    @FXML
    private TextField jekku4;
    @FXML
    private TextField jekku5;
    
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
    }
    @FXML
    public void tallennaButtonMuut(ActionEvent event) {
        kaverinKoti.setJuomat(Integer.parseInt(kJuomat.getText()));
        kaverinKoti.setRahat(Double.parseDouble(kRahat.getText()));
        paikka.setAikavali(Integer.parseInt(aikavali.getText()));
    }
    
    public IkkunaController(){
        nimi = new TextField();
        sukunimi.setText(jarno.getSukunimi());
        juomat.setText("" + jarno.getJuomat());
        humalatila.setText("" + jarno.getHumalatila());
        aikavali.setText("" + paikka.getAikavali());
        rahat.setText("" + jarno.getRaha());
        
        kalja1 = new TextField();
        kalja2 = new TextField();
        kalja3 = new TextField();
        kalja4 = new TextField();
        kalja5 = new TextField();
        
        siideri1 = new TextField();
        siideri2 = new TextField();
        siideri3 = new TextField();
        siideri4 = new TextField();
        siideri5 = new TextField();
    }
    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
