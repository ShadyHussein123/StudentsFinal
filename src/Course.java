import javax.naming.Name;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
@XmlRootElement(name = "Course")
public class Course
{
    private String courseName;
    private int courseID;
    private String courseLecturer;
    private String courseMajor;
    private ArrayList<Student> studentArrayList;

    public Course(String courseName, int courseID, String courseLecturer, String courseMajor)
    {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseLecturer = courseLecturer;
        this.courseMajor = courseMajor;
        studentArrayList = new ArrayList<>();

    }

    @XmlElement
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @XmlElement
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @XmlElement
    public String getCourseLecturer() {
        return courseLecturer;
    }

    public void setCourseLecturer(String courseLecturer) {
        this.courseLecturer = courseLecturer;
    }

    @XmlElement
    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor;
    }

    @Override
    public String toString() {
        return courseName + "" + courseID;
    }

    public ArrayList<Student> viewStudents(){
        return studentArrayList;
    }

    public void addToCourse(Student s){

        studentArrayList.add(s);
    }

    public void removeStudent(Student s)
    {
        studentArrayList.remove(s);
    }

}

