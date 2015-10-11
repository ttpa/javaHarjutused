package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {

    public static int tsykkellopp = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);
        vertikaalne(foor1);
        vertikaalne(foor2);
        horisontaalne(foor3);
        horisontaalne(foor4);

        //Public int tsykkellopp = 0;
        while (tsykkellopp < 1) {


            tsykkel(foor1, 0);
            tsykkel(foor2, 0);
            System.out.println(tsykkellopp);
            tsykkellopp = 1;
            System.out.println(tsykkellopp);
                tsykkel2(foor3, 1);
                tsykkel2(foor4, 1);

    }

    public void paus(Foor foor, int suund) {
        foor.paus(0.5);
    }

    public void vertikaalne(Foor foor) {
        foor.vahetaRohelist();
        foor.paus(0.5);
    }

    public void horisontaalne(Foor foor) {
        foor.vahetaPunast();
        foor.paus(0.5);
    }


    public void tsykkel(Foor foor, int suund) {
        if (suund == 0) {
            RohelineMaha(foor);
            vahetaKollaseks(foor);
            vahetaPunaseks(foor);
        }


        tsykkellopp = 1;
    }

    public void tsykkel2(Foor foor, int suund) {
        if (suund == 1) {
            vahetaPunaseks(foor);
//            RohelineMaha(foor);
//            RohelineMaha(foor);
            vahetaKollaseks(foor);
//            vahetaKollaseks(foor);
//            vahetaPunaseks(foor);
        }
    }


    public void RohelineMaha(Foor foor) {

        int count2 = 1;
        while (count2 < 3) {
            foor.vahetaRohelist();  // pane kollane  tuli põlema, või kui juba põleb kustuta ära.
            foor.paus(0.5);
            foor.vahetaRohelist();  // pane kollane  tuli põlema, või kui juba põleb kustuta ära.
            foor.paus(0.1);
            count2++;
        }
        foor.vahetaRohelist();  // pane kollane  tuli põlema, või kui juba põleb kustuta ära.
    }

    public void vahetaKollaseks(Foor foor) {
        int count3 = 1;
        while (count3 < 3) {
            foor.vahetaKollast();  // pane kollane  tuli põlema, või kui juba põleb kustuta ära.
            foor.paus(0.5);
            foor.vahetaKollast();  // pane kollane  tuli põlema, või kui juba põleb kustuta ära.
            foor.paus(0.1);
            count3++;
        }
    }

    public void vahetaPunaseks(Foor foor) {
        int count4 = 1;
        while (count4 < 2) {
            foor.vahetaPunast();
            foor.paus(0.5);
            foor.vahetaPunast();
            foor.paus(0.1);
            count4++;
        }
        foor.vahetaPunast();


//        foor.vahetaPunast();
//        foor.paus(0.5);
    }


/**
 int count = 1;
 do {
 int count2 = 1;


 while (count2 < 3){

 count2++;
 }



 count++;
 } while (count < 5);
 **/

}