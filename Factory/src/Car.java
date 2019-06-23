public class Car extends Vehicle {

    int year;

    public Car(String model, int year) {
        super(model);
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car";
    }
}
