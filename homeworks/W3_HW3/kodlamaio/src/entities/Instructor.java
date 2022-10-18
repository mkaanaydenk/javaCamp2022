package entities;

public class Instructor {
    private int instructorId;
    private String instructorName;
    private String[] instructorCourses;

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String[] getInstructorCourses() {
        return instructorCourses;
    }

    public void setInstructorCourses(String[] instructorCourses) {
        this.instructorCourses = instructorCourses;
    }

    public Instructor(int instructorId, String instructorName, String[] instructorCourses) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorCourses = instructorCourses;
    }
}
