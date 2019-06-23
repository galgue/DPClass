public class IAmBroken extends State {

    IAmBroken(Context context){
        super(context);
    }

    @Override
    public void turnOn() {
        System.out.println("broken again");
        context.setState(this);
    }

    @Override
    public void turnOff() {
        System.out.println("broken again and again");
        context.setState(this);
    }
}
