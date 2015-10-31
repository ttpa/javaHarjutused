package teema2;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane =new Pane();
        Scene stseen = new Scene(pane);
        primaryStage.setScene(stseen);
        primaryStage.show();
        Rectangle kast = new Rectangle(100, 50);
        Rectangle kast_a = new Rectangle(200, 250);
        pane.getChildren().add(kast);
        pane.getChildren().add(kast_a);
    }
}
