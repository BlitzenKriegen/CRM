package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class mainPgController implements Initializable{

    @FXML
    private Button conCreate;
    @FXML
    private Button exit;
    @FXML
    private Button sel1;
    @FXML
    private Button sel2;
    @FXML
    private Button sel3;
    @FXML
    private Button sel4;
    @FXML
    private Button sel5;


    @FXML
    private TableView<Contact> conList;
    @FXML
    private TableColumn<Contact, String> email;
    @FXML
    private TableColumn<Contact, String> name;
    @FXML
    private TableColumn<Contact, String> phoneNum;

    SceneController switcher = new SceneController();

    public void conSelect(ActionEvent event) throws IOException {
        switcher.changeFile(event,"ContactsPage.fxml");
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setCellValueFactory(new PropertyValueFactory<Contact,String>("contactName"));
        email.setCellValueFactory(new PropertyValueFactory<Contact,String>("contactEmail"));
        phoneNum.setCellValueFactory(new PropertyValueFactory<Contact,String>("contactPhoneNum"));

        conList.setItems(getCon());
        conList.autosize();
    }

    private ObservableList<Contact> getCon() {
        ObservableList<Contact> lst = FXCollections.observableArrayList(tableData());

        return lst;
    }

    public List<Contact> tableData() {
        List<Contact> tst = new ArrayList<Contact>();
        FileInputStream loginRead;
        try {
            loginRead = new FileInputStream("CRMContacts");
            Scanner fileRead = new Scanner(loginRead);
            while(fileRead.hasNext()) {
                Contact data = new Contact();
                data = data.grabContact(fileRead);
                tst.add(data);
            }
            fileRead.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return tst;
    }

    @FXML
    public void conCreation(ActionEvent event) throws IOException {
        switcher.changeFile(event,"ContactCreation.fxml");
    }

    @FXML
    public void logout(ActionEvent event) throws IOException {
        switcher.changeFile(event,"login.fxml");
    }
}