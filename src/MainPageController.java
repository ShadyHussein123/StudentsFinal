import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainPageController {
    public Button studentButton;
    public Button lecturerButton;
    public Button courses;


    public void openStudent(ActionEvent event) throws IOException
    {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("StudentPage.fxml")));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Student");
            stage.show();


        }catch(Exception e){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(e + dateFormat.format(date));
        }

    }


    public void openClassSearcher(ActionEvent event)
    {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("SearchClass.fxml")));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("View Class");
            stage.show();


        }catch(Exception e){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
//            System.out.println(dateFormat.format(date));
            System.out.println(e + dateFormat.format(date));
        }

    }


    public void openCourses(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("CoursesPage.fxml")));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("Courses");
        stage.show();
    }

    public void addLecturer(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("LecturerPage.fxml")));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("Lecturer");
        stage.show();

        

    }
}
