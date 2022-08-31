package application;

import java.io.FileInputStream;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    private Parent root;
    private Stage appStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			root = FXMLLoader.load(getClass().getResource("ContactCreation.fxml"));
			appStage = new Stage();
			appStage.setTitle("CRM Software");
			appStage.setScene(new Scene(root,600,350));
			appStage.show();


			Contact tst = new Contact();
			FileInputStream loginRead = new FileInputStream("CRMContacts");
            Scanner fileRead = new Scanner(loginRead);
            tst = tst.grabContact(fileRead);

            System.out.println("here!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		launch(args);
	}
}
