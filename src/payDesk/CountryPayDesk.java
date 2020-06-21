package payDesk;

import state.Employee;

public class CountryPayDesk extends Employee {
    @Override
    public void sendingAShipment(String destination) throws InterruptedException {
        if (destination.equals("Country")) {
            this.setPreparation();
            notifyObs();
        } else if (successor != null) {
            successor.sendingAShipment(destination);
            this.setWaiting();
        }
    }
}
