package at.htl.carRental.boundary;

import at.htl.carRental.entity.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/")
public class VehicleEndpoint {

    @PersistenceContext
    EntityManager em;

    @GET
    @Path("get/{id}")
    @Produces({
            MediaType.APPLICATION_JSON,
            MediaType.TEXT_PLAIN})
    public Vehicle find(@PathParam("id") long id){
        //return new Vehicle("Audi" + id, "A6",2011,2011);
        System.out.println("hey");
        return em.find(Vehicle.class,id);

    }

    @GET
    public List<Vehicle> findAll(){
        List<Vehicle> all = new ArrayList<>();
        all.add(find(11));
        return all;
    }

    @DELETE
    @Path("delete/{id}")
    public void delete(@PathParam("id") long id){

        em.remove(em.find(Vehicle.class,id));

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Vehicle vehicle){

        em.getTransaction().begin();
        Vehicle vehicle1 = new Vehicle("Peugot","207",2005,2005);
        em.persist(vehicle1);
        em.getTransaction().commit();
        System.out.println(vehicle1.toString());
    }


}
