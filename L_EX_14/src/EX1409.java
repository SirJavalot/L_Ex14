import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;


public class EX1409 extends Application {
	private Pane pane = new Pane();
	
	
	private void drawFan(Point2D center){
		
		
		double initialAngle =30;
		double radius = 50;
		double length =30;
		Circle circle = new Circle(center.getX(), center.getY(), radius+10);
		circle.setStroke(Color.RED);
		circle.setFill(Color.TRANSPARENT);
		pane.getChildren().add(circle);
		
		for(int i=0 ;i<4;i++){
			Arc arc = new Arc(center.getX(),center.getY(),radius,radius,initialAngle+i*90,length );
			arc.setFill(Color.RED);
			arc.setType(ArcType.ROUND);
			pane.getChildren().add(arc);
		}
	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		drawFan(new Point2D(100,100));
		drawFan(new Point2D(300,100));
		drawFan(new Point2D(100,300));
		drawFan(new Point2D(300,300));
		
		Scene scene = new Scene(pane,400,400);
		primaryStage.setTitle("fans");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
