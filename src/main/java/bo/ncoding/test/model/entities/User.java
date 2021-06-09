package bo.ncoding.test.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "id_user")

    private long idUser;

    @Column(name = "mail", unique = true)
    private String mail;
    @Column(name = "password")
    private String password;
    @OneToOne(mappedBy="user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private UserDetails userDetails;
    @OneToMany(mappedBy="user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Enroll> enrolls;

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

    /**
     * @return the userDetails
     */
    @JsonInclude(Include.NON_NULL)
    public UserDetails getUserDetails() {
        return userDetails;
    }

    /**
     * @param userDetails the userDetails to set
     */
    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    /**
     * @return the enrolls
     */
    @JsonInclude(Include.NON_NULL)
    public List<Enroll> getEnrolls() {
        return enrolls;
    }

    /**
     * @param enrolls the enrolls to set
     */
    public void setEnrolls(List<Enroll> enrolls) {
        this.enrolls = enrolls;
    }
}
