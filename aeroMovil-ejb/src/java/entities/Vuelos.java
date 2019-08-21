/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author itmanager
 */
@Entity
@Table(name = "vuelos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vuelos.findAll", query = "SELECT v FROM Vuelos v")
    , @NamedQuery(name = "Vuelos.findByCodVuelo", query = "SELECT v FROM Vuelos v WHERE v.codVuelo = :codVuelo")
    , @NamedQuery(name = "Vuelos.findByFechaHoraVuelo", query = "SELECT v FROM Vuelos v WHERE v.fechaHoraVuelo = :fechaHoraVuelo")})
public class Vuelos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cod_vuelo")
    private String codVuelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora_vuelo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraVuelo;
    @JoinColumn(name = "cod_avion", referencedColumnName = "cod_avion")
    @ManyToOne(optional = false)
    private Aviones codAvion;
    @JoinColumn(name = "cod_ruta", referencedColumnName = "cod_ruta")
    @ManyToOne(optional = false)
    private Ruta codRuta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vuelosCodVuelo")
    private Collection<Pasajes> pasajesCollection;

    public Vuelos() {
    }

    public Vuelos(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public Vuelos(String codVuelo, Date fechaHoraVuelo) {
        this.codVuelo = codVuelo;
        this.fechaHoraVuelo = fechaHoraVuelo;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public Date getFechaHoraVuelo() {
        return fechaHoraVuelo;
    }

    public void setFechaHoraVuelo(Date fechaHoraVuelo) {
        this.fechaHoraVuelo = fechaHoraVuelo;
    }

    public Aviones getCodAvion() {
        return codAvion;
    }

    public void setCodAvion(Aviones codAvion) {
        this.codAvion = codAvion;
    }

    public Ruta getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(Ruta codRuta) {
        this.codRuta = codRuta;
    }

    @XmlTransient
    public Collection<Pasajes> getPasajesCollection() {
        return pasajesCollection;
    }

    public void setPasajesCollection(Collection<Pasajes> pasajesCollection) {
        this.pasajesCollection = pasajesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVuelo != null ? codVuelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vuelos)) {
            return false;
        }
        Vuelos other = (Vuelos) object;
        if ((this.codVuelo == null && other.codVuelo != null) || (this.codVuelo != null && !this.codVuelo.equals(other.codVuelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vuelos[ codVuelo=" + codVuelo + " ]";
    }
    
}
