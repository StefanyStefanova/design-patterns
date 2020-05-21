import java.util.ArrayList;
import java.util.List;

public class Bot {

    public static Bot connection;

    protected static Bot getInstance() {
        if(connection == null) {
            connection = new Bot();
        }
        return connection;
    }

}
