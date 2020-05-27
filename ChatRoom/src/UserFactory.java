public class UserFactory {

    public ChatUser makeUser(ChatMediator m,String name){
        return new ChatUser(m,name);
    }
}
