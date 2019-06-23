import java.io.Reader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// add scanner input from user
		String userInput = s.next();
		
		Vehicle v = new VehicleFactory().CreateVehicle(userInput);

		System.out.println(v);
	}

}
