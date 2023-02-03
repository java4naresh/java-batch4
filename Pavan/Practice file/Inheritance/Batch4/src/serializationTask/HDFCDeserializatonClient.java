package serializationTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HDFCDeserializatonClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("E:\\HDFCCustomerFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		HDFCCustomer hc = (HDFCCustomer) ois.readObject();
		System.out.println(hc);

	}

}
