package bo.ncoding.test.model.services;

import bo.ncoding.test.model.dtos.Response;
import bo.ncoding.test.model.entities.Enroll;
import bo.ncoding.test.model.repositorys.EnrollRepository;
import bo.ncoding.test.model.services.interfaces.EnrollService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Service
public class EnrollServiceImpl implements EnrollService {

    @Autowired
    private EnrollRepository data;

    @Override
    public Enroll persist(Enroll enroll) {
        return data.save(enroll);
    }

    @Override
    public Response delete(List<Enroll> enrolls) {
        for (Enroll en : enrolls) {
            data.delete(en);
        }
        Response res = new Response();
        res.setMessage("deleted");
        return res;
    }

 

}
