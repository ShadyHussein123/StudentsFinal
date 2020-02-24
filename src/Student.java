import java.util.HashMap;
import java.util.Map;

public class Student
{
    private String studentName;
    private int studentID;
    private String studentMajor;
    private Map<String, Integer> map;

    public Student(String studentName, int studentID, String studentMajor) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentMajor = studentMajor;
        this.map = new HashMap<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", studentMajor='" + studentMajor + '\'' +"}"
                ;
    }


    public void addingStudentToHashMap(String studentName, int studentID )
    {
        map.put(studentName,studentID);
    }
}
