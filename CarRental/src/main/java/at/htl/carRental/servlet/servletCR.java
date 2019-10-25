package at.htl.carRental.servlet;


import at.htl.carRental.model.Vehicle;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("crServlet")
public class servletCR  extends HttpServlet {

    @PersistenceContext
    EntityManager em;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        TypedQuery<Vehicle> query = em.createNamedQuery("vehicleList",Vehicle.class);
        List<Vehicle> vehicles = query.getResultList();
        resp.getWriter().printf("" + vehicles);
    }

}
