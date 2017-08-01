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
@Table(name = "parent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parent.findAll", query = "SELECT p FROM Parent p"),
    @NamedQuery(name = "Parent.findById", query = "SELECT p FROM Parent p WHERE p.id = :id"),
    @NamedQuery(name = "Parent.findByFM", query = "SELECT p FROM Parent p WHERE p.fM = :fM")})
public class Parent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "f_m")
    private String fM;
    @JoinColumn(name = "Designation_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Designation designationid;
    @JoinColumn(name = "Student_rank", referencedColumnName = "rank")
    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    private Student studentrank;

    public Parent() {
    }

    public Parent(String fM, Designation designationid) {
        this.fM = fM;
        this.designationid = designationid;
    }

    public Parent(String fM, Designation designationid, Student studentrank) {
        this.fM = fM;
        this.designationid = designationid;
        this.studentrank = studentrank;
    }

    public Parent(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFM() {
        return fM;
    }

    public void setFM(String fM) {
        this.fM = fM;
    }

    public Designation getDesignationid() {
        return designationid;
    }

    public void setDesignationid(Designation designationid) {
        this.designationid = designationid;
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
        if (!(object instanceof Parent)) {
            return false;
        }
        Parent other = (Parent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Parent[ id=" + id + " ]";
    }
    
}
