public class TrainingMan {
    private boolean isGetUp;

    public void getUp(){
        this.isGetUp = true;
        System.out.println("Training man is get up.");
    }
    public void getDown(){
        this.isGetUp = false;
        System.out.println("Training man is get down.");
    }
}
