package entities;

public class Courses {
    private int courseId;
    private String courseName;
    private String instructorName;
    private String category;
    private double price;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Courses(int courseId, String courseName, String instructorName, String category, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.category = category;
        this.price = price;
    }
}
