import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.Logging.DatabaseLogger;
import core.Logging.FileLogger;
import core.Logging.Logger;
import dataAccess.CourseDao;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws Exception {

        List<Course> courses= new ArrayList<>();
        List<Category> categories= new ArrayList<>();
        List<Logger> loggers= new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new DatabaseLogger());


        Course course1= new Course(1,"Java kursu",550);
        Course course2= new Course(2,"Kotlin kursu",500);

        CourseManager courseManager= new CourseManager(new JdbcDao(),courses,loggers);
        courseManager.add(course1);
        courseManager.add(course2);

        Category category1= new Category(1,"Backend");
        Category category2= new Category(2,"Mobil");

        CategoryManager categoryManager= new CategoryManager(new HibernateDao(),categories,loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);

        Instructor instructor1= new Instructor(1,"Engin","Demiroğ");
        Instructor instructor2= new Instructor(2,"Mehmet Kaan","Aydenk");

        InstructorManager instructorManager= new InstructorManager(new JdbcDao(),loggers);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);



    }
}
