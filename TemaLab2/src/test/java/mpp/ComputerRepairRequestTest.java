package mpp;

import mpp.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {

    @Test
    @DisplayName("Test Getters and Setters")
    public void testGettersAndSetters() {
        ComputerRepairRequest request = new ComputerRepairRequest();
        request.setID(1);
        request.setOwnerName("Dan");
        request.setOwnerAddress("Strada Y");
        request.setPhoneNumber("0722222222");
        request.setModel("Asus");
        request.setDate("2023-10-01");
        request.setProblemDescription("Ecran spart");

        assertEquals(1, request.getID());
        assertEquals("Dan", request.getOwnerName());
        assertEquals("Strada Y", request.getOwnerAddress());
        assertEquals("0722222222", request.getPhoneNumber());
        assertEquals("Asus", request.getModel());
        assertEquals("2023-10-01", request.getDate());
        assertEquals("Ecran spart", request.getProblemDescription());
    }

    @Test
    @DisplayName("Test Constructor")
    public void testConstructor() {
        ComputerRepairRequest request = new ComputerRepairRequest(2, "Dan", "Strada X", "0722222222", "HP", "2023-10-02", "Problema baterie");

        assertEquals(2, request.getID());
        assertEquals("Dan", request.getOwnerName());
        assertEquals("Strada X", request.getOwnerAddress());
        assertEquals("0722222222", request.getPhoneNumber());
        assertEquals("HP", request.getModel());
        assertEquals("2023-10-02", request.getDate());
        assertEquals("Problema baterie", request.getProblemDescription());
    }
}