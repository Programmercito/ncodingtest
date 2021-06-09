package bo.ncoding.test.model.services;

import bo.ncoding.test.model.entities.Course;
import bo.ncoding.test.model.repositorys.CoursesRepository;
import bo.ncoding.test.model.services.interfaces.CoursesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 * @version     1.0
 */

@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesRepository data;

    @Override
    public Course persist(Course course) {
        return data.save(course);
    }

    @Override
    public List<Course> getListCourses(Integer idUser) {
        return data.getListCourses(idUser);
    }
    @Override
    public Iterable<Course> getListCourses() {
        return data.findAll();
    }

}
