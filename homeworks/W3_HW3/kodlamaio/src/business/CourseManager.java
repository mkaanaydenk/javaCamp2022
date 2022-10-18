package business;

import dataAccess.ICategoryDao;
import dataAccess.ICourseDao;
import entities.Courses;
import loggers.ILogger;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CourseManager {

    ICourseDao courseDao;
    ILogger[] loggers;

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    ArrayList<Courses> coursesArrayList = new ArrayList<>();

    public void add(Courses courses) throws Exception {

        if (courses.getPrice() < 0) {
            throw new Exception("Kurs fiyatı 0dan küçük olamaz");
        }

        for (Courses coursess : coursesArrayList) {
            if (courses.getCourseName().equals(coursess.getCourseName())) {
                throw new Exception("Böyle bir kurs zaten var");
            }

        }

        coursesArrayList.add(courses);
        courseDao.add(courses);

        for (ILogger logger : loggers) {
            logger.log(courses.getCourseName());
        }
    }

}
