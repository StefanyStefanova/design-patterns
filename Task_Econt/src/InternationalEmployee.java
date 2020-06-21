import java.util.ArrayList;
import java.util.List;

public class InternationalEmployee extends Employee {
    private List<Observer> observers = new ArrayList<Observer>();

    public InternationalEmployee(){
        this.level  = Employee.InternationalServices;
    }

    @Override
    protected void logShipment(String message) {
        System.out.println("Your international shipment is being processed. Shipment for: " + message);
        Context c = new Context();
        EmpState state = new EmpState();
        state.prepareShipment(c);
        notifyObservers();
        System.out.println("The employee for international shipments finished his work");
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.shipmentToWarehouse(this);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs:this.observers)
        {
            obs.update();
        }

    }
}
