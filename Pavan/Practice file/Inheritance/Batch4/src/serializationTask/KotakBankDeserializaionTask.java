package serializationTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class KotakBankDeserializaionTask {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(new File("E:\\KotakCustomerFile.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		KotakBank kb = (KotakBankCustomer) ois.readObject();
		System.out.println(kb);
	}

}
