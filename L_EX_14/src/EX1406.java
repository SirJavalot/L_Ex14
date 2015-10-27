import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class EX1406 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		boolean isBlack =true;
		Color squareColor = Color.BLACK;
		double size=40;

		
		
		for(int i=0;i<8;i++){
			isBlack = !isBlack;
			for(int j=0;j<8;j++){
				Rectangle a = new Rectangle(j*size, i*size,size,size);
				squareColor = (isBlack)? Color.BLACK: Color.WHITE;
				a.setFill(squareColor);
				isBlack = !isBlack;
				pane.getChildren().add(a);
			}
		}
		
		
		
		
		Scene scene = new Scene(pane);
		primaryStage.sizeToScene();
		primaryStage.setTitle("tic tac toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}















