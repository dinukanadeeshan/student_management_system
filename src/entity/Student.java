/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByRank", query = "SELECT s FROM Student s WHERE s.rank = :rank"),
    @NamedQuery(name = "Student.findBySchool", query = "SELECT s FROM Student s WHERE s.schoolid = :id"),
    @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name"),
    @NamedQuery(name = "Student.findByAddress", query = "SELECT s FROM Student s WHERE s.address = :address"),
    @NamedQuery(name = "Student.findByShy", query = "SELECT s FROM Student s WHERE s.shy = :shy"),
    @NamedQuery(name = "Student.findByTelephone", query = "SELECT s FROM Student s WHERE s.telephone = :telephone")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rank")
    private Integer rank;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "shy")
    private Integer shy;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentrank")
    private List<Parent> parentList;
    @JoinColumn(name = "School_id", referencedColumnName = "id")
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    private School schoolid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentrank")
    private List<Sibiline> sibilineList;

    public Student() {
    }

    public Student(Integer rank, String name, String address, Integer shy, String telephone, List<Parent> parentList, School schoolid, List<Sibiline> sibilineList) {
        this.rank = rank;
        this.name = name;
        this.address = address;
        this.shy = shy;
        this.telephone = telephone;
        this.parentList = parentList;
        this.schoolid = schoolid;
        this.sibilineList = sibilineList;
    }

    public Student(Integer rank) {
        this.rank = rank;
    }

    public Student(Integer rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getShy() {
        return shy;
    }

    public void setShy(Integer shy) {
        this.shy = shy;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @XmlTransient
    public List<Parent> getParentList() {
        return parentList;
    }

    public void setParentList(List<Parent> parentList) {
        this.parentList = parentList;
    }

    public School getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(School schoolid) {
        this.schoolid = schoolid;
    }

    @XmlTransient
    public List<Sibiline> getSibilineList() {
        return sibilineList;
    }

    public void setSibilineList(List<Sibiline> sibilineList) {
        this.sibilineList = sibilineList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rank != null ? rank.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.rank == null && other.rank != null) || (this.rank != null && !this.rank.equals(other.rank))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "(" + rank + ") " + name;
    }

}
