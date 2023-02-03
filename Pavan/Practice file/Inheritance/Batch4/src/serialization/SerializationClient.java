package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClient {

	public static void main(String[] args) throws IOException {
		KotakCustomer kc = new KotakCustomer("kk1245", "Pavan", "+91-9160260888");
		KotakCustomer kc1 = new KotakCustomer("kk2584", "Naresh", "+91-9951288766");
		KotakCustomer kc2 = new KotakCustomer("kk5789", "Vasavi", "+91-25896354");
		KotakCustomer kc3 = new KotakCustomer("kk0254", "Dhana Lakshm", "+91-36585");
		KotakCustomer kc4 = new KotakCustomer("kk245", "Veerababu", "+91-8341813139");
		SBIBank sb = new SBIBank("Triveni", 222552, "sb552");
		FileOutputStream fos = new FileOutputStream("D:\\Customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(kc);
		oos.writeObject(kc1);
		oos.writeObject(kc2);
		oos.writeObject(kc3);
		oos.writeObject(kc4);
		oos.writeObject(sb);
		oos.flush();
		System.out.println("Serialization completed");

		oos.close();

	}

}
