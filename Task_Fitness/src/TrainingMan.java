import java.util.ArrayList;
import java.util.List;

public class TrainingMan implements Observable{
    private boolean isGetUp;
    private List<Observer> observers = new ArrayList<Observer>();

    public void getUp(){
        this.isGetUp = true;
        System.out.println("Training man is get up.");
        this.notifyObservers();
    }
    public void getDown(){
        this.isGetUp = false;
        System.out.println("Training man is get down.");
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setInstruction(this);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.observers){
            observer.update();
        }
    }

    @Override
    public boolean getUpdate() {
        return this.isGetUp;
    }
}
