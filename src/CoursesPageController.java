import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CoursesPageController implements Initializable
{

    public Button addCourseButton;
    public Button viewCoursesButton;
    public Button iCtStudentButton;
    public static ArrayList<Course> courseArrayList = new ArrayList<>();
    public ChoiceBox<String> majorChoiceBoxCourse;
    public TextField courseNameText;
    public TextField courseIDText;
    public TextField profNameText;

    public void addCourse(ActionEvent event)
    {
        int id = Integer.parseInt(courseIDText.getText());
        Course course = new Course(courseNameText.getText(),id ,profNameText.getText(), majorChoiceBoxCourse.getValue());
        courseArrayList.add(course);
        System.out.println(course);
    }

    public void viewCourses(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("ViewCourses.fxml")));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("Search Class");
        stage.show();
    }

    public void addCourseToStudent(ActionEvent event)
    {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        majorChoiceBoxCourse.setItems(FXCollections.observableArrayList(" ", "Business","Computer Science", "Engineering" ));
    }


}
