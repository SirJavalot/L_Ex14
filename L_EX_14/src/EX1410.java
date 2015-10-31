import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class EX1410 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Line line1 = new Line(100,50,100,400);
		
		Line line2 = new Line(300,50,300,400);
		
		Ellipse e = new Ellipse(200, 50, 100, 30);
		e.setFill(Color.WHITE);
		e.setStroke(Color.BLACK);
		pane.getChildren().addAll(line1,line2,e);
		Scene scene = new Scene(pane,400,450);
		primaryStage.setTitle("14.10");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
