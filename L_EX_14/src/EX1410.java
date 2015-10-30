import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class EX1410 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Line line1 = new Line(100,50,100,400);
		
		Line line2 = new Line(300,50,300,400);
		pane.getChildren().addAll(line1,line2);
		Scene scene = new Scene(pane,400,450);
		primaryStage.setTitle("14.10");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
