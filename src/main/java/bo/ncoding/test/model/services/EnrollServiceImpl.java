package bo.ncoding.test.model.services;

import bo.ncoding.test.model.repositorys.CoursesRepository;
import bo.ncoding.test.model.repositorys.EnrollRepository;
import bo.ncoding.test.model.services.interfaces.CoursesService;
import bo.ncoding.test.model.services.interfaces.EnrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Service
public class EnrollServiceImpl implements EnrollService {

    @Autowired
    private EnrollRepository data;

}
