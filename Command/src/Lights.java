public class Lights {
    private boolean lightsOn;

    public void switchOn(){
        this.lightsOn = true;
        System.out.println("Lights are on");
    }
    public void switchOff(){
        this.lightsOn = false;
        System.out.println("Lights are off");
    }
}
