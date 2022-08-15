package practicequiz1;

public class VehicleTester {

	public static void main(String[] args) {
		Vehicle civic = new Vehicle("Honda", "Civic", 12.4, 35);

		if (civic.getFuelLevel() == 12.4)
			System.out.println("Passed 1: " + civic.getFuelLevel());
		else
			System.out.println("Failed 1: " + civic.getFuelLevel());

		if (civic.getMake().equals("Honda"))
			System.out.println("Passed 2");
		else
			System.out.println("Failed 2");

		if (civic.getModel().equals("Civic"))
			System.out.println("Passed 3");
		else
			System.out.println("Failed 3");

		if (civic.getMpg() == 35)
			System.out.println("Passed 4");
		else
			System.out.println("Failed 4");

		civic.addGas(15);
		if (civic.getFuelLevel() == 12.4)
			System.out.println("Passed 5");
		else
			System.out.println("Failed 5");

		civic.drive(40);
		civic.drive(100);

		if (civic.getTotalMiles() == 140)
			System.out.println("Passed 6");
		else
			System.out.println("Failed 6");

		if ((int)(civic.getFuelLevel()) == 8)
			System.out.println("Passed 7");
		else
			System.out.println("Failed 7");

		civic.addGas(1);

		if ((int)(civic.getFuelLevel()) == 9)
			System.out.println("Passed 8");
		else
			System.out.println("Failed 8");

		System.out.println(civic.toString());
	}

}
