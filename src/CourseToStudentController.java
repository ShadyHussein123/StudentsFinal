import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CourseToStudentController implements Initializable {
    public ChoiceBox <Student> studentMajorBox;
    public Button addButton;
    public ChoiceBox <Course> courseMajorBox;

    public void addCourseToStudent(ActionEvent event)
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        studentMajorBox.setItems(FXCollections.observableArrayList(AddStudentPageController.studentArrayList));
        courseMajorBox.setItems(FXCollections.observableArrayList(CoursesPageController.courseArrayList));
    }
}
