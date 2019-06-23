import java.util.Date;

public class VehicleFactory {

	public Vehicle CreateVehicle(String s)
	{
		if (s.toUpperCase().startsWith("C"))
		{
			return new Car("Honda", 2020);
		} else if (s.toUpperCase().startsWith("M")){
			return new Mathorcycle("MMM", "Dan");
		}
		
		return null;
	}
	
}
