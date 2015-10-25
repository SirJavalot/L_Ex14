import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class E141 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setVgap(10);
		pane.setHgap(10);
		Image mi1 = new Image("file:C:\\Users\\dennis\\Desktop\\java\\LiangBookCode\\book\\image\\denmark.gif");
		Image mi2 = new Image("file:C:\\Users\\dennis\\Desktop\\java\\LiangBookCode\\book\\image\\china.gif");
		Image mi3 = new Image("file:C:\\Users\\dennis\\Desktop\\java\\LiangBookCode\\book\\image\\india.gif");
		Image mi4 = new Image("file:C:\\Users\\dennis\\Desktop\\java\\LiangBookCode\\book\\image\\us.gif");
		
		pane.add(new ImageView(mi1), 0, 0);
		pane.add(new ImageView(mi2), 1, 0);
		pane.add(new ImageView(mi3), 0, 1);
		pane.add(new ImageView(mi4), 1, 1);
		
		
		
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("display clock");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
