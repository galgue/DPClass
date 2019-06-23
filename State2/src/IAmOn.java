public class IAmOn extends State {
    IAmOn(Context context){
        super(context);
    }

    @Override
    public void turnOn() {
        System.out.println("I'm on");
        context.setState(this);
    }

    @Override
    public void turnOff() {
        if(Math.random() < 0.1) {
            System.out.println("broke");
            context.setState(new IAmBroken(context));
            return;
        }
        System.out.println("turn off");
        context.setState(new IAmOff(context));
    }
}
