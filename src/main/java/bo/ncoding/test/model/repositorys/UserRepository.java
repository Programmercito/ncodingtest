package bo.ncoding.test.model.repositorys;

import bo.ncoding.test.model.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 * @version     1.0
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Integer> {

}
