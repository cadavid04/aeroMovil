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
@Table(name = "ruta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ruta.findAll", query = "SELECT r FROM Ruta r")
    , @NamedQuery(name = "Ruta.findByCodRuta", query = "SELECT r FROM Ruta r WHERE r.codRuta = :codRuta")
    , @NamedQuery(name = "Ruta.findByValor", query = "SELECT r FROM Ruta r WHERE r.valor = :valor")
    , @NamedQuery(name = "Ruta.findByOrigen", query = "SELECT r FROM Ruta r WHERE r.origen = :origen")
    , @NamedQuery(name = "Ruta.findByDestino", query = "SELECT r FROM Ruta r WHERE r.destino = :destino")})
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cod_ruta")
    private String codRuta;
    @Size(max = 45)
    @Column(name = "valor")
    private String valor;
    @Size(max = 45)
    @Column(name = "origen")
    private String origen;
    @Size(max = 45)
    @Column(name = "destino")
    private String destino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codRuta")
    private Collection<Vuelos> vuelosCollection;

    public Ruta() {
    }

    public Ruta(String codRuta) {
        this.codRuta = codRuta;
    }

    public String getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(String codRuta) {
        this.codRuta = codRuta;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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
        hash += (codRuta != null ? codRuta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ruta)) {
            return false;
        }
        Ruta other = (Ruta) object;
        if ((this.codRuta == null && other.codRuta != null) || (this.codRuta != null && !this.codRuta.equals(other.codRuta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ruta[ codRuta=" + codRuta + " ]";
    }
    
}
