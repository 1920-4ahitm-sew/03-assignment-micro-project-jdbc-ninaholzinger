package at.htl.carRental.control;

import at.htl.carRental.entity.Vehicle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VehicleDao {

    @PersistenceContext
    EntityManager em;

    public Vehicle save(Vehicle vehicle){
        return em.merge(vehicle);
    }
}
