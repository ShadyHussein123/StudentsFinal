import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;


public class AddStudentPageController implements Initializable
{

    public TextField studentNameText;
    public TextField studentIDText;
    public Button addStudentButton;
    static ArrayList<Student> studentArrayList;
    public ChoiceBox majorChoiceBox;
    public Button backToStudentButton;


    public void addStudent(ActionEvent event)
    {
        int id = Integer.parseInt(studentIDText.getText());
        Student s = new Student(studentNameText.getText(), id, (String) majorChoiceBox.getValue());

        System.out.println(s.toString());

    }


    public void addMajorChoiceBox(ContextMenuEvent contextMenuEvent)
    {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        majorChoiceBox.setItems(FXCollections.observableArrayList(" ", "Business","Computer Science", "Engineering" ));
    }


    public void backToStudent(ActionEvent event)
    {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("StudentPage.fxml")));
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
}
