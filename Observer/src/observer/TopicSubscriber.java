package observer;

public class TopicSubscriber  implements Observer {

    private String name;
    private Observable topic;

    public TopicSubscriber(String name)
    {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.topic == null)
        {
            System.out.println(this.name + " has no topic set");
            return;
        }

        String latestTopic = this.topic.getUpdate();
        System.out.println(this.name + " : got update for topic " + latestTopic);

    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;

    }
}
