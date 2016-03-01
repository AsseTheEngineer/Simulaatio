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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author Asse
 */
public class IkkunaController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField nimi;
    @FXML
    private TextField sukunimi;
    @FXML
    private TextField juomat;
    @FXML
    private TextField humalatila;
    @FXML
    private TextField aikavali;
    @FXML
    private TextField rahat;
    
    
    
    @FXML
    public void simuloiButton(ActionEvent event) {
        simuloi();
        label.setText(paikka.getTarina() + "\nHuomautukset: " + jarno.getHuomautukset() + "\nHumalatila: " + jarno.getHumalatila());
    }
    
    @FXML
    public void resetButton(ActionEvent event) {
        jarno = new Henkilo();
        jarnonKoti = new Koti(jarno);
        kaverinKoti = new Kaverinkamppa();
        paikka.reset();
        label.setText("");
    }
    
    @FXML
    public void populateThings() {
        nimi.setText(jarno.getEtunimi());
        sukunimi.setText(jarno.getSukunimi());
        juomat.setText("" + jarno.getJuomat());
        humalatila.setText("" + jarno.getHumalatila());
        aikavali.setText("" + paikka.getAikavali());
        rahat.setText("" + jarno.getRaha());
    }
    
    @FXML
    public void tallennaButtonHenk(ActionEvent event) {
        jarno.setHumalatila(Double.parseDouble(humalatila.getText()));
        jarno.setLompakko(Double.parseDouble(rahat.getText()));
        jarno.setJuomat(Integer.parseInt(juomat.getText()));
    }
    @FXML
    public void tallennaButtonBar(ActionEvent event) {
        //toho kaikki ku painaa tallenna nabbulaa
    }
    @FXML
    public void tallennaButtonMuut(ActionEvent event) {
        //toho kaikki ku painaa tallenna nabbulaa
    }
    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
