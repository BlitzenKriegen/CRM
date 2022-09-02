package application;

import java.io.IOException;

import javafx.event.ActionEvent;

public class ConPgController {

    SceneController switcher = new SceneController();
    /**
     * goes back to main menu without changing the contacts folder
     * @param event: user clicking the button.
     * @throws IOException: Needed because of the file changing within the method called.
     */
    public void exitPage(ActionEvent event) throws IOException {
        switcher.changeFile(event,"MainPage.fxml");
    }

    public void createTask(ActionEvent event) throws IOException {
        switcher.changeFile(event,"TaskCreation.fxml");
    }

    public void deleteTask(ActionEvent event) throws IOException {
        switcher.changeFile(event,"ContactsPage.fxml");
    }
}
