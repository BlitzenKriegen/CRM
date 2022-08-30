package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Note: I got a majority of the code on this class from this youtube video:
 * https://www.youtube.com/watch?v=XCgcQTQCfJQ. I dont think they're is a chance
 * that I would have figured out this double cast otherwise.
 * @author Kiril
 *
 */
public class SceneController {
    /**
     * Function changes the loaded FXML file within a running instance of javaFX
     * to a given FXML file name.
     * @param event: This is just to make logScreen work.
     * @param fxml: Name of the FXML file
     * @throws IOException: Usage of the function is going only going to pass in
     * pre-determined files, but this is here to avoid try-catch code.
     */
    public void changeFile(ActionEvent event, String fxml) throws IOException {
        Parent logScreen = FXMLLoader.load(getClass().getResource(fxml));
        Scene chgScreen = new Scene(logScreen);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(chgScreen);
        window.show();
        return;
    }

}
