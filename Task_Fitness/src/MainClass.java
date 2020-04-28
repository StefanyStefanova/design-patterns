public class MainClass {

    public static void main(String[] args){
        FitnessCoach instructor = new FitnessCoach();
        TrainingMan trainingMan = new TrainingMan();

        Command getUpCommand = new GetUpCommand(trainingMan);
        Command getDownCommand = new GetDownCommand(trainingMan);

        instructor.setCommand(getUpCommand);
        instructor.giveInstruction();

        instructor.setCommand(getDownCommand);
        instructor.giveInstruction();
    }
}
