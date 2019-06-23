public class Context {

    private State state;

    public void init(State state) {
        this.state = state;
    }

    public void turnOn() {
        this.state = state.turnOn();
    }

    public void turnOff() {
        this.state = state.turnOff();
    }

}
