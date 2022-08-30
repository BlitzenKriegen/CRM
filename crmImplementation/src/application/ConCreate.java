package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ConCreate {
    @FXML
    public Button exit;
    @FXML
    public Button createTask;

    public SceneController switcher = new SceneController();

    public void exitCreation(ActionEvent event) throws IOException {
        switcher.changeFile(event,"MainPage.fxml");
    }

    public void createContact(ActionEvent event) throws IOException {
        //do Later
    }
}
