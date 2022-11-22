package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcDao implements CourseDao, CategoryDao, InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile kategori eklendi: " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("JDBC ile kurs eklendi: " + course.getCourseName());
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eğitmen eklendi: " + instructor.getInstructorName());
    }
}
