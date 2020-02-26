import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class CourseToStudentController implements Initializable {
    public ChoiceBox <Student> studentMajorBox;
    public Button addButton;
    public ChoiceBox <Course> courseMajorBox;
    public TableColumn<Student,String> studentNameColumn;
    public TableColumn<Student,String> studentIDColumn;
    public TableColumn<Student,String> studentMajorColumn;
    public TableView<Student> tableview;
    public Button deleteButton;

    public void addCourseToStudent(ActionEvent event)
    {
        courseMajorBox.getSelectionModel().getSelectedItem().addToCourse(studentMajorBox.getValue());
        tableview.refresh();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        studentMajorBox.setItems(FXCollections.observableArrayList(AddStudentPageController.studentArrayList));
        courseMajorBox.setItems(FXCollections.observableArrayList(CoursesPageController.courseArrayList));


        courseMajorBox.getSelectionModel().selectedItemProperty().addListener( c -> {

                    studentNameColumn.setCellValueFactory((p) -> new SimpleStringProperty(p.getValue().getStudentName()));
                    studentIDColumn.setCellValueFactory((p) -> new SimpleStringProperty(p.getValue().getStudentID() + ""));
                    studentMajorColumn.setCellValueFactory((p) -> new SimpleStringProperty(p.getValue().getStudentMajor()));
                    tableview.setItems(FXCollections.observableList(courseMajorBox.getSelectionModel().getSelectedItem().viewStudents()));
                }
        );
    }

    public void deleteCourse(ActionEvent event)
    {
        courseMajorBox.getSelectionModel().getSelectedItem().addToCourse(studentMajorBox.getValue());
        tableview.refresh();
    }
}
