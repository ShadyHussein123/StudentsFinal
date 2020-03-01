import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchStudentController implements Initializable {
    public Button showStudentSearch;
    public Button backToStudent;
    @FXML
    public TableView tableView ;
    public TableColumn<Student,String> nameColumn;
    public TableColumn <Student,String> studentIDColumn;
    public TableColumn <Student,String>studentMajorColumn;
    public Button deleteButton;


    public void backToStudent(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("StudentPage.fxml")));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("Search Class");
        stage.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        nameColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getStudentName()));
        studentIDColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getStudentID()+ ""));
        studentMajorColumn.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getStudentMajor()));


        System.out.println(AddStudentPageController.studentHashSet);
        tableView.setItems(FXCollections.observableArrayList(AddStudentPageController.studentHashSet));



    }

    public void deleteStudent(ActionEvent event)
    {
        AddStudentPageController.studentHashSet.remove(tableView.getSelectionModel().getSelectedItem());
        tableView.refresh();
    }
}
