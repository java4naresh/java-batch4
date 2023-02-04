package externalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeExternalization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\sampleFiles\\customers.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		SBICustomer sc = (SBICustomer)ois.readObject();
        System.out.println(sc);

	}

}
