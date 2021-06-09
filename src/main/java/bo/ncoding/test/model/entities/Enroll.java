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
import javax.persistence.OneToMany;
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
    @Column(name = "id_course")
    private long idCourse;
    @Column(name = "id_user")
    private long idUser;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_course")
    private List<Courses> courses;

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
     * @return the idCourse
     */
    public long getIdCourse() {
        return idCourse;
    }

    /**
     * @param idCourse the idCourse to set
     */
    public void setIdCourse(long idCourse) {
        this.idCourse = idCourse;
    }

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
     * @return the courses
     */
    public List<Courses> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

}
