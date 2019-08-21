package entities;

import entities.Aviones;
import entities.Pasajes;
import entities.Ruta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-20T20:17:07")
@StaticMetamodel(Vuelos.class)
public class Vuelos_ { 

    public static volatile SingularAttribute<Vuelos, Ruta> codRuta;
    public static volatile SingularAttribute<Vuelos, Date> fechaHoraVuelo;
    public static volatile SingularAttribute<Vuelos, Aviones> codAvion;
    public static volatile CollectionAttribute<Vuelos, Pasajes> pasajesCollection;
    public static volatile SingularAttribute<Vuelos, String> codVuelo;

}