import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentPageController {
    public Button addStudentButton;
    public Button searchStudentButton;
    public Button deleteStudentButton;
    public Button backButton;

    public void openAddStudent(ActionEvent event)
    {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("AddStudentPage.fxml")));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Add Student");
            stage.show();


        }catch(Exception e){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(e + dateFormat.format(date));
        }
    }

    public void openSearchStudent(ActionEvent event)
    {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("src/SearchStudentPage.fxml")));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Add Student");
            stage.show();


        }catch(Exception e){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
//            System.out.println(dateFormat.format(date));
            System.out.println(e + dateFormat.format(date));
        }
    }

    public void openDeleteStudent(ActionEvent event) {
    }

    public void backToMainPage(ActionEvent event)
    {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("MainPage.fxml")));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Add Student");
            stage.show();



        }catch(Exception e){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(e + dateFormat.format(date));
        }
    }
}
