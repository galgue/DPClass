public class project {
    public static void main(String[] args) {
        Bill b500 = new Bill(500);
        Bill b200 = new Bill(200);
        Bill b100 = new Bill(100);
        Bill b50 = new Bill(50);
        Bill b20 = new Bill(20);
        Bill b5 = new Bill(5);

        b500.setNext(b200).setNext(b100).setNext(b50).setNext(b20).setNext(b5);

        b500.handle(62416161);

    }
}
