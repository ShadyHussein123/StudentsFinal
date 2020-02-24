import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainPageController {
    public Button studentButton;
    public Button lecturerButton;
    public Scene scene2;
    public Stage p;
    public Button classSearchButton;

    public void openStudent(ActionEvent event) throws IOException
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

    public void openLecturer(ActionEvent event)
    {
        System.out.println("BB clicked");
    }


    public void openClassSearcher(ActionEvent event)
    {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("SearchClass.fxml")));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Search Class");
            stage.show();


        }catch(Exception e){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
//            System.out.println(dateFormat.format(date));
            System.out.println(e + dateFormat.format(date));
        }

    }
}
