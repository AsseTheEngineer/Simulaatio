/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

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
    private TextField etunimi;
    @FXML
    private TextField sukunimi;
    @FXML
    private TextField rahat;
    @FXML
    private TextField humalatila;
    @FXML
    private TextField juomat;

    @FXML
    private Label tarina;
    
    @FXML
    private void simuloi(ActionEvent event) {
        System.out.println("Simuloitu!!");
        tarina.setText("No voi vittu");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
