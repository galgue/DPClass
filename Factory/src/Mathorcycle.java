public class Mathorcycle extends Vehicle {

    String rider;

    public Mathorcycle(String model, String rider) {
        super(model);
        this.rider = rider;
    }

    @Override
    public String toString() {
        return "Motorcycle";
    }
}
