import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewCoursesController implements Initializable
{

    public TableColumn <Course, String>courseNameColumn;
    public TableColumn<Course, String> courseIDColumn;
    public TableColumn<Course, String> profColumn;
    public TableColumn<Course, String> majorColumn;
    public TableView coursesTableView;
    public Button backButton;

    public void initialize(URL location, ResourceBundle resources)
    {
        courseNameColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseName()));
        courseIDColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseID()+ ""));
        profColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseLecturer()));
        majorColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getCourseMajor()));

        System.out.println(CoursesPageController.courseArrayList);
        coursesTableView.setItems(FXCollections.observableArrayList(CoursesPageController.courseArrayList));
    }

    public void deleteStudent(ActionEvent event)
    {
        AddStudentPageController.studentHashSet.remove(coursesTableView.getSelectionModel().getSelectedItem());
        coursesTableView.refresh();
    }

    public void backToCourses(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CoursesPage.fxml")));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("Search Class");
        stage.show();
    }
}
