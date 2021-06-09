package bo.ncoding.test.model.entities;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Entity
@Table(name = "enroll")

public class Enroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "id_enroll")
    private long idEnroll;
    @Column(name = "id_user")
    private long idUser;
    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    @JoinColumn(name = "id_course", referencedColumnName = "id_course")
    @ManyToOne(fetch = FetchType.LAZY)
    private Courses course;

    /**
     * @return the idEnroll
     */
    public long getIdEnroll() {
        return idEnroll;
    }

    /**
     * @param idEnroll the idEnroll to set
     */
    public void setIdEnroll(long idEnroll) {
        this.idEnroll = idEnroll;
    }
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the course
     */
    public Courses getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Courses course) {
        this.course = course;
    }

}
