package bo.ncoding.test.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Programmercito <twitter, facebook, linkedin, github>
 */
@Entity
@Table(name = "enroll", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_user", "id_course"})})

public class Enroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "id_enroll")
    private long idEnroll;

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "id_user")
    private User user;
    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "id_course")
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
     * @return the idUser
     */
    public Integer getIdUser() {
        return this.getUser().getIdUser();
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(Integer idUser) {
        this.setUser(new User());
        this.getUser().setIdUser(idUser);
    }

    /**
     * @return the idCourse
     */
    public Integer getIdCourse() {
        return this.getCourse().getIdCourse();
    }

    /**
     * @param idCourse the idCourse to set
     */
    public void setIdCourse(Integer idCourse) {
        this.setCourse(new Courses());
        this.getCourse().setIdCourse(idCourse);
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
