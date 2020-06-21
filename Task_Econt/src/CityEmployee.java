import java.util.ArrayList;
import java.util.List;

public class CityEmployee extends Employee {
    private List<Observer> observers = new ArrayList<Observer>();

    public CityEmployee(){
        this.level = Employee.ServicesInPlovdiv;
    }
    @Override
    protected void logShipment(String message) {
        System.out.println("Your city shipment is being processed. Shipment for: " + message);
        Context c = new Context();
        EmpState state = new EmpState();
        state.prepareShipment(c);
        notifyObservers();
        System.out.println("The employee for city shipments finished his work");
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
