package bo.ncoding.test.model.repositorys;

import bo.ncoding.test.model.entities.Course;
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
public interface CoursesRepository extends CrudRepository<Course, Integer>, PagingAndSortingRepository<Course, Integer> {

    @Query(value = "select c.* from enroll r, courses c where r.id_course=c.id_course and r.id_user=:id_user", nativeQuery = true)
    public List<Course> getListCourses(@Param("id_user") Integer id_user);
    
}
