package bo.ncoding.test.model.services.interfaces;

import bo.ncoding.test.model.entities.Course;
import java.util.List;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
public interface CoursesService {

    public Course persist(Course course);

    public List<Course> getListCourses(Integer idUser);

    public Iterable<Course> getListCourses();
}
