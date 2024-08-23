package models;

import models.enums.VehicleType;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    private int id;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private Map<VehicleType,Integer> basePrice;
    private Map<VehicleType,Integer> multiplier;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
