package business;

import core.Logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    CourseDao courseDao;
    List<Course> courses;
    List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers)

    {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers=loggers;
    }

    public void add(Course course) throws Exception {

        courseControl(course.getCourseName());
        priceControl(course.getPrice());
        courses.add(course);
        courseDao.add(course);
        log(course);


    }

    private void courseControl(String courseName) throws Exception {

        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                throw new Exception("Böyle bir kurs zaten var");
            }
        }

    }

    private void priceControl(double coursePrice) throws Exception {

        if (coursePrice < 0) {
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
        }

    }

    private void log(Course course) {

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }

    }

}
