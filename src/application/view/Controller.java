package application.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	@FXML
	AnchorPane rootPane;
	@FXML
	ImageView img1;
	
	public void showHome() {
		try{
			 
			FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("ExamenJavaFX_Menu.fxml"));
			Parent root1= (Parent)fxmlLoader.load();
			 
			Stage stage= new Stage();
			 
			stage.setScene(new Scene(root1));
			 
			stage.show();
			 
			} catch (IOException e) {
			e.printStackTrace();
			System.out.println("second stage ko");
		}
		
		img1.setEffect(new GaussianBlur(40));
	}

}
