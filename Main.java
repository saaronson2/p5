//Title: P5 Java FX
//Due Date: 4/12/19
// DuplicateKeyException, IllegalNullKeyException
//Course: CS400 Lecture 01, Spring 2019
//Author: Sam Aronson
//Email: saaronson2@wisc.edu
//Lecturer's Name: Deb Deppeler
//Sources: none
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
			root.setTop(makeLabel("CS400 MyFirstJavaFX"));
			// Build Combo box
			// https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
			root.setLeft(makeComboBox());
			// Build ImageView
			// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/ImageView.html
			root.setCenter(putImage("face.jpg"));
			root.setBottom(makeButton("Done"));
			root.setRight(makeCheckBox("Sam Aronson?"));
			Scene scene = new Scene(root, 400, 400); // width then height
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Sam's First JavaFX program");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Build Combo box https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
	 * 
	 * @return
	 */
	private ComboBox makeComboBox() {
		ObservableList<String> options = FXCollections.observableArrayList("Daniel", "Sam", "Nate", "Josh");
		final ComboBox comboBox = new ComboBox(options);
		return comboBox;
	}

	/**
	 * Makes a label
	 * 
	 * @param title
	 * @return
	 */
	private Label makeLabel(String title) {
		Label myLabel = new Label(title);
		return myLabel;
	}
	
	/**
	 * Makes a checkbox
	 * 
	 * @param title
	 * @return
	 */
	private CheckBox makeCheckBox(String title) {
		CheckBox myCheckBox = new CheckBox(title);
		return myCheckBox;
	}

	/**
	 * Makes a button
	 * 
	 * @param title
	 * @return
	 */
	private Button makeButton(String title) {
		Button myButton = new Button(title);
		return myButton;
	}

	/**
	 * Builds an image given the image title Build ImageView
	 * https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/ImageView.html
	 * 
	 * @param image
	 * @return
	 */
	private ImageView putImage(String image) {
		Image i = new Image(image);// load the image
		ImageView iv1 = new ImageView(); // simple displays ImageView the image as is
		iv1.setImage(i);
		iv1.setRotate(90);
		iv1.setFitWidth(100);
		iv1.setPreserveRatio(true);
		iv1.setSmooth(true);
		iv1.setCache(true);
		return iv1;
	}

	public static void main(String[] args) {
		// use command-line here, before calling launch

		launch(args);
	}
}
