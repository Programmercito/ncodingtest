package bo.ncoding.test.model.services.interfaces;

import bo.ncoding.test.model.entities.Courses;
import java.util.List;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
public interface CoursesService {

    public Courses persist(Courses course);

    public List<Courses> getListCourses(Integer idUser);

    public Iterable<Courses> getListCourses();
}
