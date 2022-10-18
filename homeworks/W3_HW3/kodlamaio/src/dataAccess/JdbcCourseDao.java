package dataAccess;

import entities.Courses;

public class JdbcCourseDao implements ICourseDao{
    @Override
    public void add(Courses courses) {
        System.out.println("JDBC ile kurs eklendi");
    }
}
