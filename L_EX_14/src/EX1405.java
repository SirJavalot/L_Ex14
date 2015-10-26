import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EX1405 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Circle circle = new Circle(100, 100, 70);
		circle.setStroke(Color.RED);
		circle.setFill(Color.TRANSPARENT);
		
		
		String text = "Welcome to java";
		text = text.toUpperCase();
		double degreeDiff =360/text.length();
		
		System.out.println("angle is " +degreeDiff);
		
		double centerX = 100, centerY=100;
		double radius =70;		
		for(int i=0;i<text.length();i++){
			
			
			Double xCoordinate = centerX+radius*Math.sin(90+(i*2*Math.PI/degreeDiff));
			Double yCoordinate = centerY-radius*Math.cos(90+(i*2*Math.PI/degreeDiff));
			String s = String.valueOf(text.charAt(i));
			System.out.println(i+" x="+xCoordinate+" y= "+yCoordinate);
			Text t = new Text(xCoordinate, yCoordinate, s);
			t.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.REGULAR, 22));
			t.setFill(Color.RED);
			//t.setRotate(java.lang.Math.atan2(-(yCoordinate-360),xCoordinate-360));
			//t.setRotate(90+i*degreeDiff);
			pane.getChildren().add(t);
			
		}
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("java is fun");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
