import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentController {
    public TextField studentNameTextField;
    public TextField StudentIDTextField;
    public Button backToMainPageBtn;
    public Button addStudent;
    public ChoiceBox<String> majorChoiceBox;
    public Label warningLabel;
    private int id = -1;




    public void addNewStudent(ActionEvent event)
    {
        Student shady = new Student(studentNameTextField.getText(), id, majorChoiceBox.getValue());

        System.out.println(shady.toString());
        shady.addingStudentToHashMap(studentNameTextField.getText(),id);


        addStudent.setOnAction(event1 -> isInt(StudentIDTextField, StudentIDTextField.getText()));
    }

    private boolean isInt(TextField studentIDTextField, String addStudent)
    {
        majorChoiceBox = new ChoiceBox<>(FXCollections.observableArrayList("Business", "Science & Innnovation", "Engineering", "Post-Graduate studies"));
        try
        {
            id = Integer.parseInt(StudentIDTextField.getText());
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
//        majorChoiceBox = new ChoiceBox<>(FXCollections.observableArrayList("English", "Español", "Русский", "简体中文", "日本語"));
    }

    public void initialize() {
        majorChoiceBox.getItems().removeAll(majorChoiceBox.getItems());
        majorChoiceBox.getItems().addAll(" ", "Business", "Engineering", "Science & Innovation" , "Post-graduate");
        majorChoiceBox.getSelectionModel().select(" ");
    }
}
