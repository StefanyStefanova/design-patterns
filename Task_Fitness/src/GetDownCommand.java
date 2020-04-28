public class GetDownCommand implements Command {
    private TrainingMan trainingMan;

    public GetDownCommand(TrainingMan trainingMan) {
        this.trainingMan = trainingMan;
    }

    @Override
    public void execute() {
        this.trainingMan.getDown();
    }
}
