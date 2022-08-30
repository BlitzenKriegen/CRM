package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class mainPgController {
    @FXML
    public Button exit;
    @FXML
    public Button conCreate;
    @FXML
    public AnchorPane screen;
    @FXML
    public TableView<Contact> conList;
    @FXML
    public TableColumn<Contact, String> name;
    @FXML
    public TableColumn<Contact, String> email;
    @FXML
    public TableColumn<Contact, String> phoneNum;

    public SceneController switcher = new SceneController();

    public Contact crmList[];


    public void conCreation(ActionEvent event) throws IOException {
        switcher.changeFile(event,"ContactCreation.fxml");
    }

    public void logout(ActionEvent event) throws IOException {
        switcher.changeFile(event,"login.fxml");
    }
}
