package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //vehicle에 없기때문에 안된다. 강제 타입변환을 해야한다.
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();

	}

}
