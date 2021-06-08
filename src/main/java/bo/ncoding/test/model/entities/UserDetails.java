package bo.ncoding.test.model.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @Basic(optional = false)
    @Column(name = "id_user")
    private String idUser;

}
