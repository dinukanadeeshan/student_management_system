/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "sibiline")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sibiline.findAll", query = "SELECT s FROM Sibiline s"),
    @NamedQuery(name = "Sibiline.findById", query = "SELECT s FROM Sibiline s WHERE s.id = :id"),
    @NamedQuery(name = "Sibiline.findByWork", query = "SELECT s FROM Sibiline s WHERE s.work = :work")})
public class Sibiline implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "work")
    private String work;
    @JoinColumn(name = "SibilineType_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sibilinetype sibilineTypeid;
    @JoinColumn(name = "Student_rank", referencedColumnName = "rank")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Student studentrank;

    public Sibiline() {
    }

    public Sibiline(String work, Sibilinetype sibilineTypeid, Student studentrank) {
        this.work = work;
        this.sibilineTypeid = sibilineTypeid;
        this.studentrank = studentrank;
    }

    public Sibiline(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Sibilinetype getSibilineTypeid() {
        return sibilineTypeid;
    }

    public void setSibilineTypeid(Sibilinetype sibilineTypeid) {
        this.sibilineTypeid = sibilineTypeid;
    }

    public Student getStudentrank() {
        return studentrank;
    }

    public void setStudentrank(Student studentrank) {
        this.studentrank = studentrank;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sibiline)) {
            return false;
        }
        Sibiline other = (Sibiline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Sibiline[ id=" + id + " ]";
    }
    
}
