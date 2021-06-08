package bo.ncoding.test.model.repositorys;

import bo.ncoding.test.model.entities.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer>, PagingAndSortingRepository<UserDetails, Integer> {

}
