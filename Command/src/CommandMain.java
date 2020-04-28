public class CommandMain {

    public static void main(String[] args){
        RemoteController remoteController = new RemoteController();
        Lights lights = new Lights();

        Command lightsOnCommand = new LightsOnCommand(lights);
        Command lightsOffCommand = new LightsOffCommand(lights);

        remoteController.setCommand(lightsOnCommand);
        remoteController.pressButton();

        remoteController.setCommand(lightsOffCommand);
        remoteController.pressButton();
    }
}
