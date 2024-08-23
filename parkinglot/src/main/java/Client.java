import controllers.TicketController;
import models.ParkingLot;

public class Client {
    public static void main(String[] args) {
        var ticketController = new TicketController();
        ticketController.generateTicket()

    }
}
/*
Requirement
1. Generate parking ticket when vehicle reached an entry gate


TikcetController
Inputs of a controller
1. Single param as a object
2. Models should not be used as a param because model can have less ort more information



Output of a controller


 */