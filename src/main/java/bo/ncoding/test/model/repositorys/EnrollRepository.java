package bo.ncoding.test.model.repositorys;

import bo.ncoding.test.model.entities.Courses;
import bo.ncoding.test.model.entities.Enroll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Repository
public interface EnrollRepository extends CrudRepository<Enroll, Integer>, PagingAndSortingRepository<Enroll, Integer> {

}
