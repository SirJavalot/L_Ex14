import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
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
		Arc arc = new Arc(200, 400, 100, 30, 0, -180);
		Arc arc2 = new Arc(200, 400, 100, 30, 0, 180);
		arc2.getStrokeDashArray().addAll(6.0,21.0);
		arc2.setFill(Color.TRANSPARENT);
		arc2.setStroke(Color.BLACK);
		arc.setFill(Color.TRANSPARENT);
		arc.setStroke(Color.BLACK);
		e.setFill(Color.WHITE);
		e.setStroke(Color.BLACK);
		pane.getChildren().addAll(line1,line2,e,arc,arc2);
		Scene scene = new Scene(pane,400,450);
		primaryStage.setTitle("14.10");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
