package bo.ncoding.test.web.controllers;

import bo.ncoding.test.model.dtos.Extras;
import bo.ncoding.test.model.dtos.Register;
import bo.ncoding.test.model.entities.User;
import bo.ncoding.test.model.services.interfaces.UserService;
import bo.ncoding.test.utils.EncryptNcoding;
import bo.ncoding.test.utils.SystemController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
public class UserController extends SystemController {

    @Autowired
    UserService modelo;

    /**
     * List of users with courses
     *
     * @param id of user
     * @return User and the all courses
     */
    @GetMapping(path = "/user")
    public User list(Integer id) {
        User u = modelo.find(id);

        return u;
    }

    /**
     * List of users with courses
     *
     * @param register Register of the new user
     * @return User return new user
     */
    @PostMapping(path = "/user", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public User persist(@RequestBody Register register
    ) {

        register.setPassword(EncryptNcoding.encript(register.getPassword()));
        User user = new User();
        user.setMail(register.getMail());
        user.setPassword(register.getPassword());

        user = modelo.persist(user);
        return user;
    }
    /**
     * List of users with courses
     *
     * @param register with other data of user
     * @return User return new user
     */
    @PatchMapping(path = "/complete", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public User persist(@RequestBody Extras register
    ) {
        User u = null;
        u = modelo.find(register.getIdUser());
        u.setName(register.getName());
        u.setAdress(register.getAdress());
        u.setLastname(register.getLastname());
        return modelo.persist(u);
    }

}
