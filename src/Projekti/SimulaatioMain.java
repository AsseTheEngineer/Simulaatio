/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekti;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
/**
 *
 * @author Asse
 */
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimulaatioMain extends Application {

    public static Henkilo jarno = new Henkilo(30, "Jarno", "Penttilä", 0, 5);

    public static Baari baari1 = new Baari(4, 4, 5, 5, "prkl");
    public static Baari baari2 = new Baari(4, 5, 6, 6, "Boothill");
    public static Baari baari3 = new Baari(4, 5, 4, 4, "Molly Malones");
    public static Baari baari4 = new Baari(5, 4, 5, 5, "Lady Moon");
    public static Baari baari5 = new Baari(7, 8, 6, 6, "Ravintola Teatteri");

    public static Poliisi poliisi = new Poliisi(40);
    public static Koti jarnonKoti = new Koti(jarno, 20, 5);
    public static Kaverinkamppa kaverinKoti = new Kaverinkamppa(5, 50);
    public static Puisto puisto = new Puisto(poliisi);
    public static Paikka paikka = new Paikka(jarno, poliisi, jarnonKoti, kaverinKoti, puisto);

    public static void simuloi() {
        int gameOver = 0;
        while (gameOver != 1) {

            paikka.simulointi();
            //System.out.println("\n" + jarno.getHumalatila() + "\n");
            if (jarno.getHumalatila() >= 10) {
                gameOver = 1;
            } else if (paikka.getTunnit() == 4) { //#sweg
                gameOver = 1;
            } else if (jarno.getHuomautukset() >= 3) {
                gameOver = 1;

            }

            String kommentti = "";
            if (jarno.getHumalatila() >= 10) {
                kommentti = "Iltasi päättyi sammumiseen!";
            } else if (paikka.getTunnit() == 4 && jarno.getHumalatila() >= 10) {
                kommentti = "Päätät sammua samaan aikaan kun baarin ovet menee kiinni.";
            } else if (paikka.getTunnit() == 4 && jarno.getHumalatila() < 10) {
                kommentti = "Selvisit mestarin elkein illasta!";
            } else if (jarno.getHuomautukset() >= 3) {
                kommentti = "Iltasi päättyi putkaan!";
            } paikka.addTapahtuma(kommentti);

        }

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Ikkuna.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pyhä launch juttu on tossa alla 
        paikka.addBaari(baari1);
        paikka.addBaari(baari2);
        paikka.addBaari(baari3);
        paikka.addBaari(baari4);
        paikka.addBaari(baari5);
        launch(args);
    }

}
