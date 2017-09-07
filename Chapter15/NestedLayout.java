package Chapter15;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class NestedLayout extends Application {

    private Label label = new Label("This is a label");
    private Button button = new Button("Button");
    private Button button2 = new Button("Another Button");

    public void start(Stage stage) {

        //set action handlers
        button.setOnAction(new ButtonHandler());
        button2.setOnAction(new ButtonHandler());

        //set margins for label/buttons
        Insets inset = new Insets(10);
        VBox.setMargin(label, inset);
        VBox.setMargin(button, inset);

        HBox.setMargin(button2, inset);

        VBox pane = new VBox();

        //HBox for 2nd child in VBox
        HBox hpane = new HBox();

        hpane.getChildren().addAll(button, button2);
        hpane.setAlignment(Pos.CENTER);

        pane.getChildren().add(label);
        pane.getChildren().add(hpane);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 220, 80);

        stage.setTitle("Nested Layouts 1");
        stage.setScene(scene);
        stage.show();
    }

    /* I added this so the program
    at least does a little something other
    than show a basic nested layout
     */

    class ButtonHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {

            if(event.getSource() == button) {
                JOptionPane.showMessageDialog(null,"You pressed the first button.");
            }
            else {
                JOptionPane.showMessageDialog(null,"You pressed the second button.");
            }
        }
    }
}
