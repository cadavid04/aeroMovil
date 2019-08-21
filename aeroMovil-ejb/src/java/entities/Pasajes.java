/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itmanager
 */
@Entity
@Table(name = "pasajes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasajes.findAll", query = "SELECT p FROM Pasajes p")
    , @NamedQuery(name = "Pasajes.findByIdPasaje", query = "SELECT p FROM Pasajes p WHERE p.idPasaje = :idPasaje")
    , @NamedQuery(name = "Pasajes.findByHora", query = "SELECT p FROM Pasajes p WHERE p.hora = :hora")
    , @NamedQuery(name = "Pasajes.findByNroPuesto", query = "SELECT p FROM Pasajes p WHERE p.nroPuesto = :nroPuesto")
    , @NamedQuery(name = "Pasajes.findByAsiento", query = "SELECT p FROM Pasajes p WHERE p.asiento = :asiento")
    , @NamedQuery(name = "Pasajes.findByValor", query = "SELECT p FROM Pasajes p WHERE p.valor = :valor")
    , @NamedQuery(name = "Pasajes.findByReserva", query = "SELECT p FROM Pasajes p WHERE p.reserva = :reserva")})
public class Pasajes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pasaje")
    private Integer idPasaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "nro_puesto")
    private String nroPuesto;
    @Size(max = 45)
    @Column(name = "asiento")
    private String asiento;
    @Column(name = "valor")
    private Integer valor;
    @Size(max = 45)
    @Column(name = "reserva")
    private String reserva;
    @JoinColumn(name = "persona_id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false)
    private Persona personaIdPersona;
    @JoinColumn(name = "vuelos_cod_vuelo", referencedColumnName = "cod_vuelo")
    @ManyToOne(optional = false)
    private Vuelos vuelosCodVuelo;

    public Pasajes() {
    }

    public Pasajes(Integer idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Pasajes(Integer idPasaje, Date hora, String nroPuesto) {
        this.idPasaje = idPasaje;
        this.hora = hora;
        this.nroPuesto = nroPuesto;
    }

    public Integer getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(Integer idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getNroPuesto() {
        return nroPuesto;
    }

    public void setNroPuesto(String nroPuesto) {
        this.nroPuesto = nroPuesto;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public Persona getPersonaIdPersona() {
        return personaIdPersona;
    }

    public void setPersonaIdPersona(Persona personaIdPersona) {
        this.personaIdPersona = personaIdPersona;
    }

    public Vuelos getVuelosCodVuelo() {
        return vuelosCodVuelo;
    }

    public void setVuelosCodVuelo(Vuelos vuelosCodVuelo) {
        this.vuelosCodVuelo = vuelosCodVuelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPasaje != null ? idPasaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasajes)) {
            return false;
        }
        Pasajes other = (Pasajes) object;
        if ((this.idPasaje == null && other.idPasaje != null) || (this.idPasaje != null && !this.idPasaje.equals(other.idPasaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pasajes[ idPasaje=" + idPasaje + " ]";
    }
    
}
