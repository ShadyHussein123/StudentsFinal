import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewCoursesController implements Initializable
{

    public TableColumn <Course, String>courseNameColumn;
    public TableColumn<Course, String> courseIDColumn;
    public TableColumn<Course, String> profColumn;
    public TableColumn<Course, String> majorColumn;
    public TableView coursesTableView;

    public void initialize(URL location, ResourceBundle resources)
    {
        courseNameColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseName()));
        courseIDColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseID()+ ""));
        profColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseLecturer()));
        majorColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseMajor()));

        System.out.println(AddStudentPageController.studentArrayList);
        coursesTableView.setItems(FXCollections.observableArrayList(AddStudentPageController.studentArrayList));
    }

    public void deleteStudent(ActionEvent event)
    {
        AddStudentPageController.studentArrayList.remove(coursesTableView.getSelectionModel().getSelectedItem());
        coursesTableView.refresh();
    }
}
