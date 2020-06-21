package state;

import observer.Observable;

public abstract class Employee extends Observable {

    public abstract void sendingAShipment(String destination) throws InterruptedException;

    protected Employee successor;
    protected State payDesk;
    protected State waiting;
    protected State preparation;

    public Employee() {
        waiting = new WaitState(this);
        preparation = new PreparationState(this);
        payDesk = waiting;
    }

    public void setSuccessor(Employee successor) {
        this.successor = successor;
    }

    public void setPayDesk(State state) {
        payDesk = state;
    }

    public State getWaiting() {
        return waiting;
    }

    public void setWaiting() {
        payDesk.waitingForCustomer();
    }

    public State getPreparation() {
        return preparation;
    }

    public void setPreparation() {
        payDesk.shipmentPreparation();
    }
}
