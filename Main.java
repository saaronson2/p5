package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();

			Label myLabel = new Label("CS400 MyFirstJavaFX");
			root.setTop(myLabel);

			// Build Combo box
			// https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
			ObservableList<String> options = FXCollections.observableArrayList("Daniel", "Sam", "Nate", "Josh");
			final ComboBox comboBox = new ComboBox(options);
			root.setLeft(comboBox);

			// Build ImageView
			// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/ImageView.html
			Image image = new Image("face.jpg");// load the image
			ImageView iv1 = new ImageView(); // simple displays ImageView the image as is
			iv1.setImage(image);
			iv1.setRotate(90);
			iv1.setFitWidth(100);
			iv1.setPreserveRatio(true);
			iv1.setSmooth(true);
			iv1.setCache(true);
			root.setCenter(iv1);

			
			Button myButton = new Button("Done");
			root.setBottom(myButton);
			
			TextField myTextField = new TextField("Enter Name Here: ");
			root.setRight(myTextField);
			
			CheckBox myCheckBox = new CheckBox("Sam Aronson?");
			root.setRight(myCheckBox);
			
			Scene scene = new Scene(root, 400, 400); // width then height
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Sam's First JavaFX program");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// use command-line here, before calling launch

		launch(args);
	}
}
