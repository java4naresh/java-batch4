package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(new File("D:\\Customer.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		KotakCustomer kc = (KotakCustomer) ois.readObject();
		KotakCustomer kc1 = (KotakCustomer) ois.readObject();
		KotakCustomer kc2 = (KotakCustomer) ois.readObject();
		KotakCustomer kc3 = (KotakCustomer) ois.readObject();
		KotakCustomer kc4 = (KotakCustomer) ois.readObject();
		SBIBank sb = (SBIBank) ois.readObject();
		System.out.println(kc);
		System.out.println(kc1);
		System.out.println(kc2);
		System.out.println(kc3);
		System.out.println(kc4);
		System.out.println(sb);

	}

}
