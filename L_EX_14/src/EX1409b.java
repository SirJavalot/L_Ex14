import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class EX1409b extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.add(new FanPane(), 0, 0);
		pane.add(new FanPane(), 1, 0);
		pane.add(new FanPane(), 0, 1);
		pane.add(new FanPane(), 1, 1);
		
		
		
		
		
		Scene scene = new Scene(pane,400,400);
		primaryStage.setTitle("fans");
		primaryStage.setScene(scene);
		//primaryStage.sizeToScene();
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
class FanPane extends Pane {
	private static double XSIZE=100;
	private static double YSIZE=100;
	private static double INITIAL_ANGLE =30;
	private static double RADIUS = XSIZE-10;
	private static double LENGTH =30;
	
	public FanPane() {
		
		
		this.setWidth(XSIZE);
		this.setHeight(YSIZE);
		Circle circle = new Circle(XSIZE/2,YSIZE/2, RADIUS);
		circle.setStroke(Color.RED);
		circle.setFill(Color.TRANSPARENT);
		for(int i=0 ;i<4;i++){
			Arc arc = new Arc(XSIZE/2,YSIZE/2,RADIUS,RADIUS,INITIAL_ANGLE+i*90,LENGTH );
			arc.setFill(Color.RED);
			arc.setType(ArcType.ROUND);
			this.getChildren().add(arc);
		}
		this.getChildren().add(circle);
	
	}
}
















