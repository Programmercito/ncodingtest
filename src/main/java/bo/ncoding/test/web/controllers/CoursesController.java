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
 */
@RestController
@RequestMapping(path = "/ncoding")
public class CoursesController extends SystemController {

    @Autowired
    CoursesService modelo;

    @PostMapping(path = "/courses", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public Course persist(@RequestBody Course course) {
        return modelo.persist(course);
    }

    @GetMapping(path = "/courses", produces = "application/json")
    public List<Course> getListCourses(Integer idUser) {
        List<Course> lista= modelo.getListCourses(idUser);
        return lista;
    }
    @GetMapping(path = "/allcourses", produces = "application/json")
    public Iterable<Course> getListCourses() {
        Iterable<Course> lista= modelo.getListCourses();
        return lista;
    }

}
