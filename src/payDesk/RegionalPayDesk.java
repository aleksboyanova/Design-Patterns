package payDesk;

import state.Employee;

public class RegionalPayDesk extends Employee {

    @Override
    public void sendingAShipment(String destination) throws InterruptedException {
        if (destination.equals("Regional")) {
            this.setPreparation();
            notifyObs();
        } else if (successor != null) {
            successor.sendingAShipment(destination);
            this.setWaiting();
        }
    }
}
