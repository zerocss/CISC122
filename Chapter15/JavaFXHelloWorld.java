package Chapter15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by Chris on 2/25/2017.
 */
public class JavaFXHelloWorld extends Application{

    public void start(Stage stage) {
        Label label = new Label("Hello World!");
        label.setAlignment(Pos.CENTER);

        Scene scene = new Scene(label, 300,80);
        stage.setScene(scene);

        stage.setTitle("Hello World!");
        stage.show();

    }
}
