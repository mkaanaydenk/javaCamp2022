package business;

import core.Logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager {
    InstructorDao instructorDao;
    List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {

        instructorDao.add(instructor);

        log(instructor);

    }

    private void log(Instructor instructor) {

        for (Logger logger : loggers) {
            logger.log(instructor.getInstructorName());
        }

    }
}
