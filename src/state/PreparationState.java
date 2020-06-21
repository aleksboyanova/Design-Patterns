package state;

import state.State;

public class PreparationState implements State {

    Employee employee;

    public PreparationState(Employee employee){
        this.employee = employee;
    }

    @Override
    public void waitingForCustomer() {
        employee.setPayDesk(employee.getWaiting());
        System.out.println("Waiting for customer");
    }

    @Override
    public void shipmentPreparation() {
        employee.setPayDesk(employee.getPreparation());
        System.out.println("The shipment is being prepared");
    }
}
