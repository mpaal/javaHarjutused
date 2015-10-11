package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
public void start (Stage primaryStage) throws Exception {

       Foor foor1 = new Foor (Foor.YLEMINE, primaryStage);
       Foor foor2 = new Foor (Foor.ALUMINE, primaryStage);
       Foor foor3 = new Foor (Foor.VASAK, primaryStage);
        Foor foor4 = new Foor (Foor.PAREM, primaryStage);

    int count = 0;
    while (count < 4) {
        count = count + 1;

        vertikaalne(foor1);
        vertikaalne(foor2);
        horisontaalne(foor3);
        horisontaalne(foor4);


    }
}
 public void vertikaalne (Foor foor) {

      foor.vahetaRohelist();
      foor.paus(0.5);
      foor.vahetaRohelist();
       foor.paus(0.5);
       foor.vahetaRohelist();
       foor.paus(0.5);
       foor.vahetaRohelist();
        foor.paus(0.5);
       foor.vahetaKollast();
       foor.paus(0.5);
       foor.vahetaKollast();
       foor.paus(0.5);
       foor.vahetaPunast();
      foor.paus(0.5);
     foor.vahetaPunast();
     foor.paus(0.5);

 }

    public void horisontaalne(Foor foor) {
        foor.vahetaPunast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);



    }
}