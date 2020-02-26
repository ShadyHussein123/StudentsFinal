import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LecturerController
{
    public TextField professorText;
    public TextField professorID;
    static ArrayList<Lecturer> lecturerArrayList = new ArrayList<>();


    public Button addProfButton;

    public void addProf(ActionEvent event) throws IOException
    {
        int id = Integer.parseInt(professorID.getText());
        Lecturer l = new Lecturer(professorText.getText(), id);
        lecturerArrayList.add(l);

        System.out.println(l);

    }
}
