package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements CourseDao, CategoryDao, InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori eklendi: " + category.getCategoryName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklendi: " + course.getCourseName());
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi: " + instructor.getInstructorName());
    }
}
