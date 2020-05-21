public class mainClass {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User us1 = new ChatUser(mediator,"Maria");
        User us2 = new ChatUser(mediator,"Nikolay");
        User us3 = new ChatUser(mediator,"Ivan");

        us1.send("Hi");
        us2.send("cat");
        us1.send("wow");
        us3.send("addBot");
        us2.send("cat");
    }
}
