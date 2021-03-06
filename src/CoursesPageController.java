import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
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
    public ChoiceBox <Lecturer> profMajorBox;

    public void addCourse(ActionEvent event) throws JAXBException {
        int id = Integer.parseInt(courseIDText.getText());

        Course course = new Course(courseNameText.getText(),id ,profMajorBox.getValue().toString(), majorChoiceBoxCourse.getValue());
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

    public void addCourseToStudent(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CourseToStudentPage.fxml")));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("Search Class");
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        majorChoiceBoxCourse.setItems(FXCollections.observableArrayList(" ", "Business","Computer Science", "Engineering" ));
        profMajorBox.setItems(FXCollections.observableArrayList(LecturerController.lecturerArrayList));

    }


}
