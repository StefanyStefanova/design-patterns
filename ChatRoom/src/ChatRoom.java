import java.util.*;

public class ChatRoom implements  ChatMediator{
    private List<User> users;

    public ChatRoom()
    {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        if((message=="cat") && (Bot.connection !=null) ){
            for (User u : this.users) {
                if(u == user)
                {
                System.out.println( u.getName() +" says unallowed word! " +  " User was removed!");
                delete(u);
                return;
                }
            }
        }
        if(message == "addBot")
        {
            Bot bot =Bot.getInstance();
            for (User u : this.users) {
                if (u != user) {
                    u.receive( user.getName() + " created Bot");
                }
            }
        }
        else{
            for (User u : this.users) {
                if (u != user) {
                    u.receive(message);
                }
            }
        }
    }

    @Override
    public void addUser(User user)
    {
        this.users.add(user);
    }

    @Override
    public void delete(User user) {
        this.users.remove(user);
    }


}
