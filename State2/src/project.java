public class project {

    public static void main(String[] args) {
        Context context = new Context();
        context.init(new IAmOff(context));

        for (int i = 0; i < 10; i++) {
            context.turnOff();
            context.turnOn();
            context.turnOn();
            context.turnOff();
        }

    }

}
