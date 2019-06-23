public class IAmOn extends State {


    @Override
    public State turnOn() {
        System.out.println("I'm on");
        return this;
    }

    @Override
    public State turnOff() {
        if(Math.random() < 0.1){
            System.out.println("broke");
            return new IAmBroken();
        }
        System.out.println("turn off");
        return new IAmOff();
    }
}
