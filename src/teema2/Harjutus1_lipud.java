package teema2;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        jaapanilipp(primaryStage);



    }


    private void jaapanilipp(Stage primaryStage) {
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 700, 400);
//        Scene stseen = new Scene(pane);
        primaryStage.setScene(stseen);
        primaryStage.show();

        Rectangle kast_a = new Rectangle(0, 0, 700, 400);
        kast_a.setFill(Color.BLACK);
//        pane.getChildren().add(kast_a);

        Rectangle kast = new Rectangle(50, 50, 600, 300);
        kast.setFill(Color.WHITE);

        Circle kast_b = new Circle(350, 200, 100);
        kast_b.setFill(Color.RED);

//        pane.getChildren().add(kast);

//        Rectangle kast_a = new Rectangle(10, 10, 300, 200);
//        Rectangle kast = new Rectangle(10, 10, 300, 200);


        pane.getChildren().addAll(kast_a, kast, kast_b);
    }
}
