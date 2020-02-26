import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchStudentController implements Initializable {
    public Button showStudentSearch;
    public Button backToStudent;
    @FXML
    public TableView tableView;
    public TableColumn<Student,String> nameColumn;
    public TableColumn <Student,String> studentIDColumn;
    public TableColumn <Student,String>studentMajorColumn;
    public TableColumn <Student,String>coursesColumn;

    public void showStudent(ActionEvent event)
    {

    }




    public void backToStudent(ActionEvent event) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("getStudentName"));
        tableView.setItems(FXCollections.observableArrayList(AddStudentPageController.studentArrayList));
    }
}
