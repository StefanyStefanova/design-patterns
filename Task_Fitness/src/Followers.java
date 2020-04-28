public class Followers implements Observer{
    private String name;
    private boolean isFollow;
    private Observable trainingMan;

    public Followers(String name) {
        this.name = name;
    }

    @Override
    public void update() {
       boolean last= this.trainingMan.getUpdate();

        if(last== true) {
            System.out.println(this.name + " : getUp " );
        }
        else
        {
            System.out.println(this.name + " : get down " );
        }
    }

    @Override
    public void setInstruction(Observable trainingMan) {
    this.trainingMan = trainingMan;
    }
}
