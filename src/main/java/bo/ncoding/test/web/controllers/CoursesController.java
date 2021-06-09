package bo.ncoding.test.web.controllers;

import bo.ncoding.test.model.entities.Course;
import bo.ncoding.test.model.services.interfaces.CoursesService;
import bo.ncoding.test.utils.SystemController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 * @version 1.0
 */
@RestController
@RequestMapping(path = "/ncoding")
public class CoursesController extends SystemController {

    @Autowired
    CoursesService modelo;

    /**
     * List of users with courses
     *
     * @param course , course of enroll the users
     * @return Course created
     */
    @PostMapping(path = "/courses", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public Course persist(@RequestBody Course course) {
        return modelo.persist(course);
    }

    /**
     * List of users with courses
     *
     * @param idUser id of user register
     * @return List<Course> list of courses of the user
     */
    @GetMapping(path = "/courses", produces = "application/json")
    public List<Course> getListCourses(Integer idUser) {
        List<Course> lista = modelo.getListCourses(idUser);
        return lista;
    }

    /**
     * List of users with courses
     *
     * @return list of courses in the database
     */
    @GetMapping(path = "/allcourses", produces = "application/json")
    public Iterable<Course> getListCourses() {
        Iterable<Course> lista = modelo.getListCourses();
        return lista;
    }

}
