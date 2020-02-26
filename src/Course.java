public class Course
{
    private String courseName;
    private int courseID;
    private String courseLecturer;

    public Course(String courseName, int courseID, String courseLecturer)
    {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseLecturer = courseLecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseLecturer() {
        return courseLecturer;
    }

    public void setCourseLecturer(String courseLecturer) {
        this.courseLecturer = courseLecturer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseID=" + courseID +
                ", courseLecturer='" + courseLecturer + '\'' +
                '}';
    }
}
