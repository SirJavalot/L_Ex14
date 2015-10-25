import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class FlagPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Image mi1 = new Image("file:D:\\book\\image\\denmark.gif");
		ImageView imgDen = new ImageView(mi1);
		
		pane.getChildren().add(imgDen);
		pane.setStyle("-fx-background-color: yellow;");
		pane.setPrefSize(200, 200);
		pane.setAlignment(Pos.CENTER);
		
		imgDen.fitHeightProperty().bind(pane.heightProperty().divide(2));
		imgDen.fitWidthProperty().bind(pane.widthProperty().divide(2));
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("display flag");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
