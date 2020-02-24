import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentController {
    public TextField studentNameTextField;
    public TextField StudentIDTextField;
    public Button backToMainPageBtn;
    public Button addStudent;
    public ChoiceBox majorChoiceBox;
    public Label warningLabel;




    public void addNewStudent(ActionEvent event)
    {
        addStudent.setOnAction(event1 -> isInt(StudentIDTextField, StudentIDTextField.getText()));
    }

    private boolean isInt(TextField studentIDTextField, String addStudent)
    {
        majorChoiceBox = new ChoiceBox(FXCollections.observableArrayList("Business", "Science & Innnovation", "Engineering", "Post-Graduate studies"));
        try
        {
            int id = Integer.parseInt(StudentIDTextField.getText());
            System.out.println("User ID: " + id);
            return true;
        }
        catch (NumberFormatException e)
        {
            warningLabel.setText("INVALID INPUT");
            return false;
        }

    }


    public void backToMainPage(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("MainPage.fxml")));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("Trial");
        stage.show();

    }


    public void showMajorChoiceBox(MouseEvent mouseEvent)
    {
        majorChoiceBox = new ChoiceBox(FXCollections.observableArrayList("Business", "Science & Innnovation", "Engineering", "Post-Graduate studies"));
//        majorChoiceBox.setItems(
//                FXCollections.observableArrayList("Business", "Science & Innnovation", "Engineering", "Post-Graduate studies")
//        );
    }
}
