public class IAmOff extends State {

    IAmOff(Context context){
        super(context);
    }

    @Override
    public void turnOn() {
        if(Math.random() < 0.1){
            System.out.println("broke");
            context.setState(new IAmBroken(context));
        }
        System.out.println("turn on");
        context.setState(new IAmOn(context));
    }

    @Override
    public void turnOff() {
        System.out.println("I'm off");
        context.setState(this);
    }
}
