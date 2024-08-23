package models;

import models.enums.GateStatus;
import models.enums.GateType;

public class Gate {
    private int id;
    private GateType gateType;
    private GateStatus gateStatus;
    private String parkingTicketCollector;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getParkingTicketCollector() {
        return parkingTicketCollector;
    }

    public void setParkingTicketCollector(String parkingTicketCollector) {
        this.parkingTicketCollector = parkingTicketCollector;
    }
}
