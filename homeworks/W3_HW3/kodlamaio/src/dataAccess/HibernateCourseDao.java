package dataAccess;

import entities.Courses;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Courses courses) {
        System.out.println("Hibernate ile kurs eklendi");
    }
}
