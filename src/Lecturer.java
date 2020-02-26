import java.util.HashSet;
import java.util.Set;

public class Lecturer
{
    private String lecturerName;
    private int lecturerID;
    private Set<Course> courseHashSet;

    public Lecturer(String lecturerName, int lecturerID)
    {
        this.lecturerName = lecturerName;
        this.lecturerID = lecturerID;
        courseHashSet = new HashSet<>();
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturerName='" + lecturerName + '\'' +
                ", lecturerID=" + lecturerID +
                '}';
    }

    public void addCourseToLecturer(Course course)
    {
        courseHashSet.add(course);
    }



}
