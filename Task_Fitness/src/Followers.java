public class Followers implements Observer{
    private String name;
    private boolean isFollow;
    private Observable trainingMan;

    public Followers(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if(isFollow ) {
            boolean latestInstruction = this.trainingMan.getUpdate();
            System.out.println(this.name + " : getUp " );
        }
        else
        {
            boolean latestInstruction = this.trainingMan.getUpdate();
            System.out.println(this.name + " : get down " );
        }
    }

    @Override
    public void setInstruction(Observable trainingMan) {
    this.trainingMan = trainingMan;
    }
}
