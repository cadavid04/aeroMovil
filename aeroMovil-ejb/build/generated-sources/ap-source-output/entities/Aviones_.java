package entities;

import entities.Vuelos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-21T16:00:55")
@StaticMetamodel(Aviones.class)
public class Aviones_ { 

    public static volatile SingularAttribute<Aviones, String> descripcion;
    public static volatile SingularAttribute<Aviones, String> marca;
    public static volatile SingularAttribute<Aviones, String> codAvion;
    public static volatile CollectionAttribute<Aviones, Vuelos> vuelosCollection;
    public static volatile SingularAttribute<Aviones, Integer> capacidad;

}