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
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "id_course")
    private long idCourse;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy="course",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Enroll> enrolls;

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

}
