
/********************************************************************************
 * create pane
 * create text
 * create arcs
 * show
*********************************************************************************/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class A16dot3 extends Application {
    Circle cRed = new Circle (150, 50, 20);
    Circle cYellow = new Circle (150, 50 ,20);
    Circle cGreen = new Circle (150, 50, 20);

    RadioButton rbRed = new RadioButton("Red");
    RadioButton rbYellow = new RadioButton("Yellow");
    RadioButton rbGreen = new RadioButton("Green");

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Rectangle r = new Rectangle(120, 20, 60, 160);
        r.setFill(Color.LIGHTGRAY);

        pane.getChildren().addAll(r, cRed, cYellow, cGreen);

        HBox hb = new HBox();
        hb.setPrefHeight(50);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().addAll(rbRed, rbYellow, rbGreen);

        ToggleGroup tg = new ToggleGroup();
        rbRed.setToggleGroup(tg);
        rbYellow.setToggleGroup(tg);
        rbGreen.setToggleGroup(tg);

        rbRed.setOnAction(e -> setRed());
        rbYellow.setOnAction(e -> setYellow());
        rbGreen.setOnAction(e -> setGreen());

        BorderPane bp = new BorderPane();
        bp.setCenter(pane);
        bp.setBottom(hb);

        Scene scene = new Scene(bp, 300, 250);
        primaryStage.setTitle("Trafic Light");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setRed() {
        resetLights();
        cRed.setFill(Color.RED);
        // rbRed.setSelected(True);

    }

    private void setYellow() {
        resetLights();
        cRed.setFill(Color.YELLOW);
        // rbYellow.setSelected(True);
    }

    private void setGreen() {
        resetLights();
        cRed.setFill(Color.LIMEGREEN);
        // rbGreen.setSelected(True);

    }

    private void resetLights() {
        cRed.setFill(Color.GREY);
        cYellow.setFill(Color.GREY);
        cGreen.setFill(Color.GREY);

    }

}