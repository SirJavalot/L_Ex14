import java.util.ArrayList;
import java.util.Arrays;

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
		ImageView vmi1 = new ImageView(mi1);
		ImageView vmi2 = new ImageView(mi2);
		ImageView vmi3 = new ImageView(mi3);
		ImageView vmi4 = new ImageView(mi4);
		
		pane.add(vmi1, 0, 0);
		pane.add(vmi2, 1, 0);
		pane.add(vmi3, 0, 1);
		pane.add(vmi4, 1, 1);
		
		ArrayList<ImageView> views = new ArrayList<>(Arrays.asList(new ImageView[]{vmi1,vmi2,vmi3,vmi4}));
		
		for (ImageView imageView : views) {
			pane.widthProperty().addListener(ov -> imageView.setFitWidth(pane.getWidth()/4)); 
			pane.widthProperty().addListener(ov -> imageView.setFitHeight(pane.getHeight()/4));
		}
		
//		pane.widthProperty().addListener(ov -> vmi1.setFitWidth(pane.getWidth()/4)); 
//		pane.widthProperty().addListener(ov -> vmi1.setFitHeight(pane.getHeight()/4));
//		
//		pane.widthProperty().addListener(ov -> vmi2.setFitWidth(pane.getWidth()/4)); 
//		pane.widthProperty().addListener(ov -> vmi2.setFitHeight(pane.getHeight()/4));
//		
//		pane.widthProperty().addListener(ov -> vmi3.setFitWidth(pane.getWidth()/4)); 
//		pane.widthProperty().addListener(ov -> vmi3.setFitHeight(pane.getHeight()/4));
//		
//		pane.widthProperty().addListener(ov -> vmi4.setFitWidth(pane.getWidth()/4)); 
//		pane.widthProperty().addListener(ov -> vmi4.setFitHeight(pane.getHeight()/4));
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("display clock");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
