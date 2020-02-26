public class Course
{
    private String courseName;
    private int courseID;
    private String courseLecturer;
    private String courseMajor;

    public Course(String courseName, int courseID, String courseLecturer, String courseMajor)
    {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseLecturer = courseLecturer;
        this.courseMajor = courseMajor;

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

    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseID=" + courseID +
                ", courseLecturer='" + courseLecturer + '\'' +
                ", courseMajor='" + courseMajor + '\'' +
                '}';
    }
}
