package models;

public class ParkingSlot {
    private int id;
    private Status parkingSlotStatus;
    private Vehicle vehicle;
    private ChargingMeter chargingMeter;

    public Status getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(Status parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
