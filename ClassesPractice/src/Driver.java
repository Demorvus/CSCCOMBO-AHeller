
public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car myCar = new Car();
		Car yourCar = new Car("Red", 42, 22.0, 4);
		
		yourCar.setWheels(15,"Alloy");

		System.out.println(yourCar.getColor() + " " + yourCar.getMileage() + " " + yourCar.amtOfGas() + " " + yourCar.getWheels());
		System.out.println(yourCar.toString());
	}

}
