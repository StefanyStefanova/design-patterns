public class GetUpCommand implements Command {
    private TrainingMan trainingMan ;

    public GetUpCommand(TrainingMan trainingMan) {
        this.trainingMan = trainingMan;
    }

    @Override
    public void execute() {
        this.trainingMan.getUp();
    }
}
