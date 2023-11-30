
public class Farm {

	public static void main(String[] args) {
		Cat felix = new Cat(1.5,2.0, "Orange");
		Animal fido = new Dog(3, 2, true);
		Animal muppet = new Animal(1, 3);
		Horse foxy = new Horse(1, 3, 22);
		
		
		System.out.println(felix);
		System.out.println(muppet);
		System.out.println(fido);
		System.out.println(fido.makeNoise());

	}

}
