package externalization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizationClient {

	public static void main(String[] args) throws IOException {
		SBICustomer sc = new SBICustomer("sbi123", "Naresh", "Naresh@123", 30);
		FileOutputStream fos = new FileOutputStream(new File("D:\\javatestingfiles\\customers.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sc);
		oos.flush();
		System.out.println("Serialization is completed");

	}

}
