package bo.ncoding.test.web.controllers;

import bo.ncoding.test.model.dtos.Response;
import bo.ncoding.test.model.entities.Enroll;
import bo.ncoding.test.model.services.interfaces.EnrollService;
import bo.ncoding.test.utils.SystemController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class EnrollController extends SystemController {

    @Autowired
    EnrollService modelo;

    /**
     * List of users with courses
     *
     * @param enroll , course enroll and user
     * @return Enroll in the database
     */
    @PostMapping(path = "/enroll", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public Enroll persist(@RequestBody Enroll course) {
        return modelo.persist(course);
    }

    /**
     * List of users with courses
     *
     * @param list, list of courses enrolled
     * @return Message of success
     */
    @DeleteMapping(path = "/enroll", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public Response delete(@RequestBody List<Enroll> list) {
        Response response = new Response();
        modelo.delete(list);
        response.setMessage("deleted");
        return response;
    }
}
