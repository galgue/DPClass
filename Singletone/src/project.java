public class project {

    public static void main(String[] args) {
        DBConnections dbcon1 = DBConnections.getInstance();
        DBConnections dbcon2 = DBConnections.getInstance();

        dbcon1.add(new ConnectionToDB());
        dbcon2.add(new ConnectionToDB());

        dbcon1.remove(0);
        dbcon2.remove(0);

        System.out.println(dbcon1.get() == dbcon2.get());
    }
}
