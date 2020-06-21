public abstract class Employee implements Observable{

    public static int InternationalServices = 1;
    public static int ServicesInBulgaria = 2;
    public static int ServicesInPlovdiv = 3 ;

    protected int level;
    protected Employee nextEmployee;

    public void setNextEmployee(Employee nextEmployee){
        this.nextEmployee = nextEmployee;
    }

    public void processShipment(String message, int type){

        if(this.level <=level)
        {
            this.logShipment(message);
            return;
        }
        if(this.nextEmployee != null)
        {
            this.nextEmployee.processShipment(message,level);
        }
    }

    abstract protected void logShipment(String message);
}
