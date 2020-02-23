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

    public void openStudent(ActionEvent event) throws IOException
    {

//        Parent root = FXMLLoader.load(getClass().getResource("StudentPage.fxml"));
//        scene2 = new Scene(root);
//        p.setScene(scene2);
//        p.show();

        try{
            FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("StudentPage.fxml")));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Trial");
            stage.show();

           // Stage stage2 = (Stage) openStudent(getScene().getWindow());
            // do what you have to do
          //  stage2.close();

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
}
