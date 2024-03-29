import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * create number 1 and 2 and andswer create window, labels, and textfields
 * 
 * 
 */

public class A15dot4 extends Application {

    double number1 = 0;
    double number2 = 0;
    double answer = 0;

    public void start(Stage primaryStage) throws Exception {

        HBox numberPane = new HBox();
        numberPane.setSpacing(10);
        numberPane.setAlignment(Pos.CENTER);

        Label lblNumber1 = new Label("Number 1:");
        TextField tfNumber1 = new TextField();

        Label lblNumber2 = new Label("Number 2:");
        TextField tfNumber2 = new TextField();

        Label lblResult = new Label("Result :");
        TextField tfResult = new TextField();
        tfResult.setEditable(false);

        numberPane.getChildren().addAll(lblNumber1, tfNumber1, lblNumber2, tfNumber2, lblResult, tfResult);

        Button btAdd = new Button("Add");
        btAdd.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) + Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });

        Button btSubtract = new Button("Subtract");
        btSubtract.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });
        Button btMultiply = new Button("Multiply");
        btMultiply.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });
        Button btDivide = new Button("Divide");
        btDivide.setOnAction(e -> {
            answer = Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText());
            tfResult.setText(answer + "");
        });

        HBox operatorsPane = new HBox();
        operatorsPane.setSpacing(10);
        operatorsPane.setAlignment(Pos.CENTER);
        operatorsPane.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);

        BorderPane borderPane = new BorderPane(numberPane);
        BorderPane.setMargin(numberPane, new Insets(10, 10, 10, 10));

        borderPane.setBottom(operatorsPane);
        BorderPane.setMargin(operatorsPane, new Insets(10, 10, 10, 10));
        primaryStage.setScene(new Scene(borderPane, borderPane.getPrefWidth(), borderPane.getPrefWidth()));
        primaryStage.setTitle("Simple Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
