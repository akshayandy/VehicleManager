public class Vehicle {

	public static void main(String[] args) {
		System.out.println("Hello");
		PetrolEngine pe = new PetrolEngine();
		pe.start();
		pe.stop();
		
		DiselEngine de = new DiselEngine();
		de.start();
		de.stop();
		
	}
}