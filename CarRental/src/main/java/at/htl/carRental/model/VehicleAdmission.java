package at.htl.carRental.model;

import java.util.LinkedList;
import java.util.List;

public class VehicleAdmission {

    public List<String> vehicle = new LinkedList<>();

    public VehicleAdmission() {
    }

    public void setVehicle(List<String> vehicle) {
        this.vehicle = vehicle;
    }

    public List<String> getVehicle() {
        return vehicle;
    }

    public void add(String name){
        vehicle.add(name);
    }

}
