package Chapter15;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by Chris on 2/25/2017.
 */
public class VBoxLayout extends Application{

    public void start(Stage stage) {

        Label label = new Label("This is a label");
        Button button = new Button("Plumbus");

        //set margins for a VBox
        Insets inset = new Insets(10);
        VBox.setMargin(label, inset);
        VBox.setMargin(button, inset);

        VBox pane = new VBox();
        HBox hpane = new HBox();

        hpane.getChildren().add(button);

        pane.getChildren().add(label);
        pane.getChildren().add(hpane);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 220, 80);

        stage.setTitle("VBox Layout");
        stage.setScene(scene);
        stage.show();
    }
}
