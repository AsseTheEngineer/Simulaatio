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
/**
 * FXML Controller class
 *
 * @author Asse
 */
public class IkkunaController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    public void simuloiButton(ActionEvent event) {
        simuloi();
        label.setText(paikka.getTarina() + "\nHuomautukset: " + jarno.getHuomautukset() + "\nHumalatila: " + jarno.getHumalatila());
    }
    
    @FXML
    public void tallennaButtonHenk(ActionEvent event) {
        //toho kaikki ku painaa tallenna nabbulaa
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
