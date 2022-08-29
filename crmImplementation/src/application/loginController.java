package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class loginController {
    @FXML
    public TextField user;
    @FXML
    public TextField pass;
    @FXML
    public Button logButton;
    @FXML
    public AnchorPane screen;

    String username;
    String password;
    String logFile = "UserPass";

    /**
     * When the user hits the "login" button, this event is handled.
     * More specifically, the function gives username and password
     * corresponding values and checks them against a text document containing
     * both. This is  a horrendous security practice, but
     * for a prototype it simply serves to confirm the
     * login process is working.
     * @param event: The "login" button being pressed
     */
    public void submit(ActionEvent event) {
        try {
            username = user.getText();
            password = pass.getText();


            FileInputStream loginRead = new FileInputStream(logFile);
            Scanner fileRead = new Scanner(loginRead);


            if(userFound(fileRead,username)) {
                if(verifyPass(fileRead,password)) {
                    AnchorPane root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
                    screen.getChildren().setAll(root);
                }
                else {
                    //fail
                }
            }
            else {
            System.out.println("no user found.");
            }
            fileRead.close();
            loginRead.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void loadNext() throws IOException {
    }

    /**
     * The function checks if the password given by the user
     * matches its assigned user. Because this relies on the scanner
     * having been processed in userFound, it is easily the sketchiest
     * part of this file.
     * @param fileRead: input stream
     * @param pass: password associated with the user
     * @return truePass: if the given password is matching
     */
    private boolean verifyPass(Scanner fileRead, String pass) {
        boolean truePass = false;
        String input = fileRead.nextLine();
        if(input.equals(pass)) {
            truePass = true;
        }
        return truePass;
    }

    /**
     * Looks to find if a given username exists within the
     * "Database". If it does, the function returns true
     * @param fileRead: filestream of usernames and passwords
     * @param usr: given username
     * @return userFound: is the user within the "database"
     */
    private boolean userFound(Scanner fileRead, String usr) {
        boolean userFound = false;
        String input;

        if(fileRead.hasNext()) {
            while(fileRead.hasNext() && !userFound) {
                input = fileRead.nextLine();
                if (input.equals(usr)) {
                    userFound = true;
                }
                if(!userFound) {
                    input = fileRead.nextLine();    //burns through passwords
                }
            }
        }
        return userFound;
    }
}
