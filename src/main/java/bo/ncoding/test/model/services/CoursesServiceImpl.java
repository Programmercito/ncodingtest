package bo.ncoding.test.model.services;

import bo.ncoding.test.model.entities.Courses;
import bo.ncoding.test.model.repositorys.CoursesRepository;
import bo.ncoding.test.model.services.interfaces.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesRepository data;

    @Override
    public Courses persist(Courses course) {
        return data.save(course);
    }

}
