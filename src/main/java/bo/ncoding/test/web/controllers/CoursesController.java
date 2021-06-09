package bo.ncoding.test.web.controllers;

import bo.ncoding.test.model.entities.Courses;
import bo.ncoding.test.model.entities.UserDetails;
import bo.ncoding.test.model.services.interfaces.CoursesService;
import bo.ncoding.test.model.services.interfaces.UserDetailsService;
import bo.ncoding.test.utils.SystemController;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Courses persist(@RequestBody Courses course) {
        return modelo.persist(course);
    }

}
