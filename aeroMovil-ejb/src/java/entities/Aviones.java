/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author itmanager
 */
@Entity
@Table(name = "aviones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aviones.findAll", query = "SELECT a FROM Aviones a")
    , @NamedQuery(name = "Aviones.findByCodAvion", query = "SELECT a FROM Aviones a WHERE a.codAvion = :codAvion")
    , @NamedQuery(name = "Aviones.findByDescripcion", query = "SELECT a FROM Aviones a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Aviones.findByMarca", query = "SELECT a FROM Aviones a WHERE a.marca = :marca")
    , @NamedQuery(name = "Aviones.findByCapacidad", query = "SELECT a FROM Aviones a WHERE a.capacidad = :capacidad")})
public class Aviones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cod_avion")
    private String codAvion;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "marca")
    private String marca;
    @Column(name = "capacidad")
    private Integer capacidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codAvion")
    private Collection<Vuelos> vuelosCollection;

    public Aviones() {
    }

    public Aviones(String codAvion) {
        this.codAvion = codAvion;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public void setCodAvion(String codAvion) {
        this.codAvion = codAvion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @XmlTransient
    public Collection<Vuelos> getVuelosCollection() {
        return vuelosCollection;
    }

    public void setVuelosCollection(Collection<Vuelos> vuelosCollection) {
        this.vuelosCollection = vuelosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAvion != null ? codAvion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aviones)) {
            return false;
        }
        Aviones other = (Aviones) object;
        if ((this.codAvion == null && other.codAvion != null) || (this.codAvion != null && !this.codAvion.equals(other.codAvion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Aviones[ codAvion=" + codAvion + " ]";
    }
    
}
