public class MainClass {

    public static void main(String[] args){
        FitnessCoach instructor = new FitnessCoach();
        TrainingMan trainingMan = new TrainingMan();

        Observer obs1 = new Followers("Ivan");
        Observer obs2 = new Followers("Nikolay");
        Observer obs3 = new Followers("Mariq");


        Command getUpCommand = new GetUpCommand(trainingMan);
        Command getDownCommand = new GetDownCommand(trainingMan);


        instructor.setCommand(getUpCommand);
        instructor.giveInstruction();

        instructor.setCommand(getDownCommand);
        instructor.giveInstruction();

        trainingMan.subscribe(obs1);
        trainingMan.subscribe(obs2);
        trainingMan.subscribe(obs3);

       // trainingMan.getDown();
       // trainingMan.getUp();



    }
}
