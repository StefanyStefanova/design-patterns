public class Man implements Observer {
    private String name;
    private Observable emp;

    public Man(String name)
    {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.emp == null)
        {
            System.out.println(this.name + " has no shipment set");
            return;
        }
        System.out.println(this.name + " tooks the shipment to take it to the warehouse");
    }

    @Override
    public void shipmentToWarehouse(Observable emp) {
        this.emp = emp;
    }
}
