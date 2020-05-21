public class Singleton {
    private static Singleton connection;

    private static Singleton getInstance() {
        if(connection == null) {
            connection = new Singleton();
        }
        return connection;
    }

    public void printMessage(String msg) {
        System.out.println("Connection says: " + msg);
    }

    public static void main(String[] args) {

        Singleton st = Singleton.getInstance();
        st.printMessage("connected");

    }

}
