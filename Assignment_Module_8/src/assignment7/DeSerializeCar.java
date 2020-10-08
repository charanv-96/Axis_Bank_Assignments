package assignment7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeCar {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("cars.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Car output = (Car) ois.readObject();

		System.out.println(output.getCarMake() + " " + output.getRegistrationNo() + " "
				+ output.getEngine().getCubicCapacity() + " " + output.getEngine().getEngineNo());
		
		ois.close();

	}

}
