package bo.ncoding.test.model.repositorys;

import bo.ncoding.test.model.entities.Courses;
import bo.ncoding.test.model.entities.Enroll;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Repository
public interface EnrollRepository extends CrudRepository<Enroll, Integer>, PagingAndSortingRepository<Enroll, Integer> {

    @Query(value = "select r.* from enroll r where r.id_user=:id_user", nativeQuery = true)
    public List<Enroll> getListEnroll(@Param("id_user") Integer id_user);

}
