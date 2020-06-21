package state;

public class WaitState implements State {

    Employee employee;

    public WaitState(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void waitingForCustomer() {
        employee.setPayDesk(employee.getWaiting());
        System.out.println("Waiting for customer");
    }

    @Override
    public void shipmentPreparation() {
        employee.setPayDesk(employee.getWaiting());
        System.out.println("The shipment is being prepared");
    }
}
