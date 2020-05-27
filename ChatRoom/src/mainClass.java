public class mainClass {
    public static void main(String[] args) {
        Factory factory = new basicFactory();
        ChatMediator mediator = new ChatRoom();

        User us1 = factory.makeUser(mediator,"Maria");
        User us2 = factory.makeUser(mediator,"Nikolay");
        User us3 =factory.makeUser(mediator,"Ivan");

        us1.send("Hi");
        us2.send("cat");
        us1.send("wow");
        us3.send("addBot");
        us2.send("cat");
        us1.send("addBot");
        us3.send("I am so happy");
    }
}
