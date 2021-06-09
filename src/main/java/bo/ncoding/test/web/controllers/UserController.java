package bo.ncoding.test.web.controllers;

import bo.ncoding.test.model.entities.Register;
import bo.ncoding.test.model.entities.User;
import bo.ncoding.test.model.services.interfaces.UserService;
import bo.ncoding.test.utils.EncryptNcoding;
import bo.ncoding.test.utils.SystemController;
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
public class UserController extends SystemController {

    @Autowired
    UserService modelo;

    @PostMapping(path = "/user", consumes = "application/json;charset=UTF-8", produces = "application/json")
    public User persist(@RequestBody Register register) {

        register.setPassword(EncryptNcoding.encript(register.getPassword()));
        User user = new User();
        user.setMail(register.getMail());
        user.setPassword(register.getPassword());

        user = modelo.persist(user);
        return user;
    }

}
