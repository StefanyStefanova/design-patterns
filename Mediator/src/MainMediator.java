public class MainMediator {
    public static void main(String[] args) {
         IChatRoom chatRoom = new ChatRoom();

         User user1 = new ChatUser(chatRoom,"1","Maria");
        User user2 = new ChatUser(chatRoom,"2","Krasimira");
        User user3 = new ChatUser(chatRoom,"3","Iva");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello Krasi","2");
    }
}
