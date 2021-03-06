package bo.ncoding.test.model.services.interfaces;

import bo.ncoding.test.model.dtos.Response;
import bo.ncoding.test.model.entities.Enroll;
import java.util.List;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 * @version     1.0
 */

public interface EnrollService {

    public Enroll persist(Enroll enroll);

    public void delete(List<Enroll> enrolls);

    
}
