import business.CategoryManager;
import business.CourseManager;
import dataAccess.*;
import entities.Category;
import entities.Courses;
import loggers.ConsoleLogger;
import loggers.FileLogger;
import loggers.ILogger;
import loggers.MailLogger;

public class Main {

    public static void main(String[] args) throws Exception {

        Courses course1 = new Courses(1, "Android geliştirme", "Mehmet", "Mobile", 800);
        Courses course2 = new Courses(2, "Java", "Engin", "Web", 999.999);

        ILogger[] loggers = new ILogger[]{new ConsoleLogger(), new FileLogger(), new MailLogger()};


        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);

        courseManager.add(course1);
        courseManager.add(course2);


        Category category = new Category(1, "Mobile");
        Category category2 = new Category(2, "Web");

        ILogger[] loggers2 = new ILogger[]{new MailLogger(), new FileLogger(), new ConsoleLogger()};

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers2);
        categoryManager.add(category);
        categoryManager.add(category2);


    }
}
