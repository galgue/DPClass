public class project {
    public static void main(String[] args) {
        Bill b200 = new Bill(200);
        Bill b100 = new Bill(100);
        b200.setNext(b100);
        Bill b50 = new Bill(50);
        b100.setNext(b50);
        Bill b20 = new Bill(20);
        b50.setNext(b20);
        Bill b5 = new Bill(5);
        b20.setNext(b5);

        b200.handle(588);

    }
}
