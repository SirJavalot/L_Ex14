import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class EX1403 extends Application {
	
	public  String getCard(Integer index){
		
		StringBuffer filename = new StringBuffer("file:D:\\book\\image\\card\\.png");
		//int index = (int)(Math.random()*52);
		//System.out.println(index);
		filename.insert(filename.length()-4, index);
		String image = filename.toString();
		//System.out.println(index+" "+image);
		
		return image;
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane pane = new FlowPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setStyle("-fx-background-color: green ");
		
		
		ArrayList<Integer> cards = new ArrayList<>(52);
		for(int i=0;i<52;i++)
			cards.add(i+1);
		Collections.shuffle(cards);
		
		for(int i=0;i<6;i++){
			String image = getCard(cards.get(i));
			pane.getChildren().add(new ImageView(new Image(image)));
		}
		
		Scene scene = new Scene(pane, 400, 100);
		primaryStage.setTitle("display tic tac toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
