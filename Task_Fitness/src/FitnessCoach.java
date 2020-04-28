public class FitnessCoach {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void giveInstruction(){
        this.command.execute();
    }
}
