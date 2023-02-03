package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(new File("E:\\javatestfile\\customers.txt"));
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    HDFCCustomer hc = (HDFCCustomer)ois.readObject();
	    //HDFCBankCustomer hbc = (HDFCBankCustomer)ois.readObject();
	    System.out.println(hc);
	}

}
