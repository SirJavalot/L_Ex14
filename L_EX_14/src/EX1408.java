import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class EX1408 extends Application {
	
public  String getCard(Integer index){
		
		StringBuffer filename = new StringBuffer("file:D:\\book\\image\\card\\.png");
		
		filename.insert(filename.length()-4, index);
		
		return filename.toString();
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setStyle("-fx-background-color: green ");
		ArrayList<Integer> cards = new ArrayList<>(52);
		
		for(int i=0;i<54;i++)
			cards.add(i+1);
		Collections.shuffle(cards);
		int k=0;
		for(int i =0; i<9;i++){
			for(int j=0; j<9 && k< cards.size() ;j++,k++){
				pane.add(new ImageView(new Image(getCard(cards.get(k)))),j,i);
			}
		}
		
		
		Scene scene = new Scene(pane, 700, 600);
		primaryStage.setTitle("display tic tac toe");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
