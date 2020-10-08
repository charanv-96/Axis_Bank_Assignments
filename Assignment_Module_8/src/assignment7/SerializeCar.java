package assignment7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("C100", "Volvo", new Engine("ee100", 10));
		

        FileOutputStream fos = new FileOutputStream("cars.dat"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(c1); 
        
        oos.close();

	}

}
