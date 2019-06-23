import java.util.LinkedList;
import java.util.List;

public class DBConnections {

    private List<ConnectionToDB> connections;
    private static DBConnections INSTANCE;
    private static final Object locker = new Object();

    private DBConnections () {
        connections = new LinkedList<>();
    }

    public static DBConnections getInstance() {
        if(INSTANCE != null)
            return INSTANCE;

        synchronized (locker) {
            if(INSTANCE == null)
                INSTANCE = new DBConnections();
        }
        return  INSTANCE;
    }

    public void add(ConnectionToDB connectionToDB) {
        connections.add(connectionToDB);
    }

    public void remove(int index) {
        try {
            connections.remove(index);
        } catch (Exception e) {
            //DO NOTHING
        }
    }

    public ConnectionToDB get() {
        if(connections.isEmpty()){
            return null;
        }
        return connections.get(0);
    }



}
