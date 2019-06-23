public class Context {

    private State state;

    public void init(State state) {
        this.state = state;
    }

    public void turnOn() {
        state.turnOn();
    }

    public void turnOff() { state.turnOff();
    }

    public void setState(State state) {
        this.state = state;

    }
}
