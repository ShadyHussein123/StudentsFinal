import java.util.HashSet;

public class Student
{
    private String studentName;
    private int studentID;
    private String studentMajor;
    private HashSet<String> courses;

    public Student(String studentName, int studentID, String studentMajor)
    {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentMajor = studentMajor;
        this.courses = courses; }

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

    public HashSet<String> getCourses() {
        return courses;
    }

    public void setCourses(HashSet<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", studentMajor='" + studentMajor + '\'' +
                '}';
    }
}
