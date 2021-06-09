package bo.ncoding.test.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Entity
@Table(name = "user")

public class User {

    @Id
    @GenericGenerator(name = "sec_user", strategy = "increment")
    @GeneratedValue(generator = "sec_user")
    @Basic(optional = false)
    @Column(name = "id_user")
    
    private long idUser;
    @Column(name = "mail")
    private String mail;
    @Column(name = "password")
    private String password;

    /**
     * @return the idUser
     */
    public long getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    @JsonIgnore
    @JsonProperty(value = "id_user")
    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the password
     */
    @JsonIgnore
    @JsonProperty(value = "password")
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
