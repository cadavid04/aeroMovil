/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Vuelos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.VuelosManager;

/**
 *
 * @author itmanager
 */
@Named(value = "vuelosMBean")
@SessionScoped
public class VuelosMBean implements Serializable {

    @EJB
    private VuelosManager vuelosManager;
    private Vuelos vuelo;
    private List <Vuelos> vuelos;

    /**
     * Creates a new instance of VuelosMBean
     */
    public VuelosMBean() {
    }
    
    public List <Vuelos>getVuelos(){
        if((vuelos == null) || (vuelos.isEmpty())) refresh();
       return vuelos; 
    }
    
    private void refresh() {
        vuelos = vuelosManager.getAllVuelos();
    }
    
    
    
    public Vuelos getDetails(){
        return vuelo;
    }
    
    public String ShowDetails (Vuelos vuelo){
        this.vuelo = vuelo;
        return "vueloDetails";
    }
    
    public String update (){
        
        vuelo = vuelosManager.update(vuelo);
        return "vuelosList";
        }
    public String list (){
       System.out.println("List");
        return "List";
    }
    
    public String home(){
       System.out.println("Home");
        return "Home";
    }
    
}
