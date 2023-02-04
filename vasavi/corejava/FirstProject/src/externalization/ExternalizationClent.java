
package externalization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizationClent {

	public static void main(String[] args) throws IOException {
		SBICustomer sc = new SBICustomer("sbi123", "vasavi", "vasavi@123", 3);
		FileOutputStream fos = new FileOutputStream(new File("E:\\javatestfile\\customers.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sc);
		oos.flush();
		System.out.println("Serialization is completed");

	}

}