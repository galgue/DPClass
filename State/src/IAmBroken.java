public class IAmBroken extends State {
    @Override
    public State turnOn() {
        System.out.println("broken again");
        return this;
    }

    @Override
    public State turnOff() {
        System.out.println("broken again and again");
        return this;
    }
}
