public class ChatUser extends User {

    public ChatUser(ChatMediator mediathor, String nickname){
        super(mediathor,nickname);
        mediathor.addUser(this);
    }
    @Override
    public void send(String message) {
        System.out.println(this.nickname + " sent :" + message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.nickname + " received :" + message);
    }
}
