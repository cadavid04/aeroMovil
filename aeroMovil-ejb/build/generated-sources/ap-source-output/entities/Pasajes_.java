package entities;

import entities.Persona;
import entities.Vuelos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-20T20:17:07")
@StaticMetamodel(Pasajes.class)
public class Pasajes_ { 

    public static volatile SingularAttribute<Pasajes, Vuelos> vuelosCodVuelo;
    public static volatile SingularAttribute<Pasajes, Date> hora;
    public static volatile SingularAttribute<Pasajes, Persona> personaIdPersona;
    public static volatile SingularAttribute<Pasajes, Integer> valor;
    public static volatile SingularAttribute<Pasajes, String> asiento;
    public static volatile SingularAttribute<Pasajes, String> nroPuesto;
    public static volatile SingularAttribute<Pasajes, String> reserva;
    public static volatile SingularAttribute<Pasajes, Integer> idPasaje;

}