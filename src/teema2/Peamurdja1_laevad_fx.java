package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application {
    GridPane laud;
    StackPane maailm;
    Stage lava;
    int laualTulpasid = 4;
    int laualRidasid = 4;
    int ruuduKylg = 50;
    double laevaToenaosus = 1.6; // suurem on tõenäosem
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);


    @Override
    public void start(Stage primaryStage) throws Exception {
        reageeriKlikile();

        // kas on laevu();
        // gameover();
        lava = primaryStage;


//        genereeriGrid();
        seadistaLava();
//        genereeriLaevad();
//        gameOver();
        //reageeriKlikile();

        primaryStage.show(); // Näita "lava"
    }



    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
                    Rectangle ruut = (Rectangle) event.getTarget();
                    String ruuduID = ruut.getId();
                    if (ruuduID.equals("laev")) {
                        System.out.println("Möödas");
                    } else if (ruuduID("laev")) {

                    }
                    if (!laevasidAlles()) {
                        System.out.println("Gameover");
                    }
                }
            );
        }
    }








    private void seadistaLava() {
        int piksleidLai = laualTulpasid * ruuduKylg;
        int piksleidKorge = laualRidasid * ruuduKylg;

        maailm = new StackPane();
        Rectangle taust = new Rectangle(piksleidLai, piksleidKorge);
        taust.setFill(Color.BLUE);
        maailm.getChildren().add(taust);

        laud = new GridPane();
        maailm.getChildren().add(laud);

        Scene scene = new Scene(maailm, piksleidKorge, piksleidLai);
        lava.setScene(scene);
        lava.setOnCloseRequest(event -> System.exit(0));
    }



    private void gameOver() {
        Label tekst = new Label("Võitsid!");
        StackPane stack = new StackPane();
        stack.getChildren().add(tekst);
        Scene stseen = new Scene(stack, 200,200);
        lava.setScene(stseen);
    }

    private void genereeriLaevad() {
        int laevasid = 0;
        for (int i = 0; i < laualRidasid; i++) {
            for (int j = 0; j < laualTulpasid; j++) {
                Rectangle ruut = new Rectangle(ruuduKylg, ruuduKylg);
                int rand = (int) (Math.random() * laevaToenaosus);
                if (rand == 1) {
                    ruut.setId("laev");
                    laevasid++;
                } else {
                    ruut.setId("tühi");
                }
                ruut.setFill(Color.rgb(0,0,0,0));
                laud.add(ruut, j, i);
            }
        }
        System.out.println("Laevasid on " + laevasid);
    }

    private boolean laevasidAlles() {
        for (Node node : laud.getChildren()) {
            if (node.getId() == "laev") {
                return false;
            }
        }
        return true;
    }
}