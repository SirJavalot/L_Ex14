import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class EX1407 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		java.util.Random r = new Random();
		
		for(int i =0 ; i<10;i++){
			for(int j=0;j<10;j++){
				TextField a = new TextField(r.nextBoolean() ? "1":"0");
				a.setPrefColumnCount(1);
				a.setPrefHeight(2);
				pane.add(a, j, i);
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
