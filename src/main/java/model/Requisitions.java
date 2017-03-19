/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author padrao
 */
@Entity
@Table(name = "requisitions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requisitions.findAll", query = "SELECT r FROM Requisitions r"),
    @NamedQuery(name = "Requisitions.findById", query = "SELECT r FROM Requisitions r WHERE r.id = :id"),
    @NamedQuery(name = "Requisitions.findByDescription", query = "SELECT r FROM Requisitions r WHERE r.description = :description")})
public class Requisitions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "id_service", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Services idService;

    public Requisitions() {
    }

    public Requisitions(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Services getIdService() {
        return idService;
    }

    public void setIdService(Services idService) {
        this.idService = idService;
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
        if (!(object instanceof Requisitions)) {
            return false;
        }
        Requisitions other = (Requisitions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Requisitions[ id=" + id + " ]";
    }
    
}
