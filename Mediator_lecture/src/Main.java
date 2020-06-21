public class Main {
    public static void main(String[] args) {
            ChatMediator mediator = new MessagesChatMediator();

            User us1 = new ChatUser(mediator,"Peter");
        User us2 = new ChatUser(mediator,"Nikolay");
        User us3 = new ChatUser(mediator,"Ivan");

        us1.send(" Hello :)");
    }
}
