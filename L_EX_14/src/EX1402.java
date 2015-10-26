import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class EX1402 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setVgap(5);
		pane.setHgap(5);
		
		int[] pos = {0,1,0,1,2,1,1,2,2};
		
		for(int i=0, k=0;i<3;i++){
			for(int j=0;j<3;j++,k++){
				if(pos[k]==0){
					pane.add(new ImageView(new Image("file:D:\\book\\image\\o.gif")), j, i);
				}
				else if (pos[k]==1){
					pane.add(new ImageView(new Image("file:D:\\book\\image\\x.gif")), j	, i);
				}
				System.out.println("pos ="+(k));
			}
		}

		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("display tic tac toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
