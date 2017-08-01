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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "sibilinetype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sibilinetype.findAll", query = "SELECT s FROM Sibilinetype s"),
    @NamedQuery(name = "Sibilinetype.findById", query = "SELECT s FROM Sibilinetype s WHERE s.id = :id"),
    @NamedQuery(name = "Sibilinetype.findByType", query = "SELECT s FROM Sibilinetype s WHERE s.type = :type")})
public class Sibilinetype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sibilineTypeid")
    private List<Sibiline> sibilineList;

    public Sibilinetype() {
    }

    public Sibilinetype(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sibilinetype)) {
            return false;
        }
        Sibilinetype other = (Sibilinetype) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return type;
    }
    
}
