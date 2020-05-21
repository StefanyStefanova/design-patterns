public class ChatUser extends User {

    public ChatUser(ChatMediator mediator,  String name){
        super(mediator,name);
        mediator.addUser(this);
    }
    @Override
    public void send(String msg) {
        System.out.println(this.getName()+ " sent : " + msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg)
    {
        System.out.println(this.getName() + " received :" + msg);
    }


}
