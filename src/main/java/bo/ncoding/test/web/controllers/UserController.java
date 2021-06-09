package bo.ncoding.test.web.controllers;

import bo.ncoding.test.model.entities.User;
import bo.ncoding.test.model.services.interfaces.UserService;
import bo.ncoding.test.utils.EncryptNcoding;
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
public class UserController {

    @Autowired
    UserService modelo;

    @GetMapping(path = "/user")
    public String ping() {
        return "ok";
    }

    @PostMapping(path = "/user", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public User persist(@RequestBody User user) {
        user.setPassword(EncryptNcoding.encript(user.getPassword()));
        user = modelo.persist(user);
        user.setPassword(null);
        return user;
    }

}
