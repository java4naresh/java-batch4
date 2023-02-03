package serializationTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class KotakBankSerializationClient {

	public static void main(String[] args) throws IOException {

		KotakBankCustomer kbc = new KotakBankCustomer("Savings", "100000", "kk0124", "Pavan", 'M', "Pavan@123");
		FileOutputStream fos = new FileOutputStream(new File("E:\\KotakCustomerFile.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(kbc);
		oos.flush();
		oos.close();

		System.out.println("Serialization completed");

	}

}
