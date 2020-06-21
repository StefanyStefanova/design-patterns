public class EmpState extends State{
    @Override
    public void prepareShipment(Context c){
        c.setState(this);
        System.out.println("The shipment is being prepared.");
    }
}
