public class Vehicle {

	public static void main(String[] args) {
		System.out.println("Hello");
		PetrolEngine Pe = new PetrolEngine();
		Pe.start();
		Pe.stop();
		
		DiselEngine De = new DiselEngine();
		De.start();
		De.stop();
		
        ElectricEngine Ee = new ElectricEngine();
        Ee.start();

		HydrogenEngine He = new HydrogenEngine();
		He.start();
		He.stop();
	}
}