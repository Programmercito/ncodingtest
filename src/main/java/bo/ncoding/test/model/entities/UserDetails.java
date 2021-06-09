package bo.ncoding.test.model.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
    private long idUser;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "adress")
    private String adress;
    @OneToOne(mappedBy = "userDetails")
    private User user;

    /**
     * @return the idUser
     */
    public long getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the user
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}
