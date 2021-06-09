package bo.ncoding.test.model.services;

import bo.ncoding.test.model.entities.User;
import bo.ncoding.test.model.repositorys.UserRepository;
import bo.ncoding.test.model.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository data;
    
    @Override
    public User persist(User user){
        return data.save(user);
    }
    
}
