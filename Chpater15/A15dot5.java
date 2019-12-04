import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import jdk.nashorn.internal.codegen.Label;

public class A15dot5 extends Application {

    private TextField tfInvestmentAmount = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfFutureValue = new TextField();

    public static void main(String[] args) {
        Application.launch(args);

    }

    public void start(Stage primaryStage) {
        GridPane gp = new Gridpane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(5);
        gp.setVgap(5);

        Scene scene = new scene(gp, 350, 200);
        primaryStage.setTitle("Invstment Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        gp.add(new Label("InvestmentAmount"), 0, 0);
        gp.add(new Label(tfInvestmentAmount , 1 , 0 );

        gp.add(new Label("NumberOfYears"), 0, 1);
        gp.add(new Label(tfNumberOfYears , 1 , 1 );

        gp.add(new Label("AnnualInterestRate"), 0, 2);
        gp.add(new Label(tfAnnualInterestRate , 1 , 2 );

        gp.add(new Label("FutureValue"), 0, 3);
        gp.add(new Label(tfFutureValue , 1 , 3 );
        tfFutureValue.setEditable(false);

        Button bCalc = new Button ("Compute");
        gp. add(bCalc, 0 ,4); 
        bCalc.setMinWidth(165);
        bCalc.setOnAction(e -> calculateValue());

        Button bReset = new Button ("Reset");
        gp. add(bReset, 1 ,4);
        bReset.setMinWidth(165);
        bReset.setOnAction(e -> resetForm());

    }

    private void calculateValue() {
        try {
            double amount = Double.parseDouble(tfInvestmentAmount.getText());
            double years = Double.parseDouble(tfNumberOfYears.getText());
            double rate = Double.parseDouble(tfAnnualInterestRate.getText());
            rate /= 1200.0;
            double futureValue = amount * Math.pow(1.0 + rate, years * 12.0);
            tfFutureValue.setText(String.format("$%.2f", futureValue));
        } catch (NumberFormatException e) {
            tfFutureValue.setText("Enter Numbers"));
        }
    }

    private void resetForm() {
        tfAnnualInterestRate.clear();
        tfFutureValue.clear();
        tfInvestmentAmount.clear();
        tfNumberOfYears.clear();
    }
}