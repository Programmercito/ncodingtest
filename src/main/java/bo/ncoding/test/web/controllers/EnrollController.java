package bo.ncoding.test.web.controllers;

import bo.ncoding.test.model.entities.Courses;
import bo.ncoding.test.model.entities.Enroll;
import bo.ncoding.test.model.services.interfaces.CoursesService;
import bo.ncoding.test.model.services.interfaces.EnrollService;
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
public class EnrollController extends SystemController {

    @Autowired
    EnrollService modelo;

    @PostMapping(path = "/enroll", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public Enroll persist(@RequestBody Enroll course) {
        return modelo.persist(course);
    }

}
