package at.htl.mock;

import at.htl.carRental.model.Vehicle;
import at.htl.carRental.model.VehicleAdmission;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class VehicleAdmissionTest {

    @Test
    void Test001(){
        //arrange
        VehicleAdmission vehicles = new VehicleAdmission();
        vehicles.vehicle = mock(List.class);

        //act
        vehicles.add("Commodore");

        //assert
        verify(vehicles.vehicle,times(1)).add("Commodore");
    }
}
