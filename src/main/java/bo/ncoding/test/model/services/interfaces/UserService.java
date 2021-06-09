package bo.ncoding.test.model.services.interfaces;

import bo.ncoding.test.model.entities.User;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
public interface UserService {

    public User persist(User user);
    public User find(Integer id);
}
