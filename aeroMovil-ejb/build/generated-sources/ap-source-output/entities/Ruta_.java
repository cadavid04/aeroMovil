package entities;

import entities.Vuelos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-21T16:00:55")
@StaticMetamodel(Ruta.class)
public class Ruta_ { 

    public static volatile SingularAttribute<Ruta, String> codRuta;
    public static volatile SingularAttribute<Ruta, String> valor;
    public static volatile SingularAttribute<Ruta, String> origen;
    public static volatile SingularAttribute<Ruta, String> destino;
    public static volatile CollectionAttribute<Ruta, Vuelos> vuelosCollection;

}