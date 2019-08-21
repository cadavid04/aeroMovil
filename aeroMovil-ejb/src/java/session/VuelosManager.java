/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;


import entities.Vuelos;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author itmanager
 */
@Stateless
@LocalBean
public class VuelosManager {

    @PersistenceContext(unitName = "aeroMovil-ejbPU")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
     public List<Vuelos> getAllVuelos() {
        Query query = em.createNamedQuery("Vuelos.findAll");
        return query.getResultList();
    }
     
     public Vuelos update (Vuelos vuelo){
         return em.merge(vuelo);
     }
   
    public void persist(Object object) {
        em.persist(object);
    }
}
