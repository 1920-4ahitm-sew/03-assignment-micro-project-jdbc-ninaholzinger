package at.htl.carrental.rest;


import at.htl.carrentalse.entity.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class VehicleEndpointIT {

    static EntityManager em;

    @BeforeEach
    private  static void init(){
        em = Persistence.createEntityManagerFactory("myPU").createEntityManager();
    }

    @Test
    public void testGet(){
        TypedQuery<Vehicle> query = em.createNamedQuery("CarRental",Vehicle.class).setParameter(1,1);
        Vehicle vehicle = query.getSingleResult();
        assertThat(vehicle.getBrand(), is("Audi"));
        assertThat(vehicle.getType(),is("A6"));
        assertThat(vehicle.getConstructionYear(),is(2011));
        assertThat(vehicle.getPivotalYear(),is(2011));
    }
}
