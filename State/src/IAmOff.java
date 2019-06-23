public class IAmOff extends State {
    @Override
    public State turnOn() {
        if(Math.random() < 0.1){
            System.out.println("broke");
            return new IAmBroken();
        }
        System.out.println("turn on");
        return new IAmOn();
    }

    @Override
    public State turnOff() {
        System.out.println("I'm off");
        return this;
    }
}
