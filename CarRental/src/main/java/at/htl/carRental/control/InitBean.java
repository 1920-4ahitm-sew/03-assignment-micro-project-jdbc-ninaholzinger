package at.htl.carRental.control;

import at.htl.carRental.entity.Vehicle;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class InitBean {
    @PersistenceContext
    EntityManager em;
    public void init(@Observes@Initialized(ApplicationScoped.class) Object init){

        Vehicle audi = new Vehicle("Audi","A6",2011,2011);
        em.persist(audi);
        em.persist(new Vehicle("Tesla","Model 3",2017,2017));
        em.persist(new Vehicle("Opel","Commodore",1980,1980));


    }

    public void tearDown(@Observes @Destroyed(ApplicationScoped.class) Object init){

    }
}
