package payDesk;

import state.Employee;

public class ForeignCountryPayDesk extends Employee {
    @Override
    public void sendingAShipment(String destination) throws InterruptedException {
        if (destination.equals("Foreign Country")) {
            this.setPreparation();
            notifyObs();
        } else {
            this.setWaiting();
        }
    }
}
