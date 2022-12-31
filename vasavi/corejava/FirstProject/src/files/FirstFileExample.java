package files;

import java.io.File;
import java.io.IOException;


public class FirstFileExample {
	
	public static void main(String[] args) {
		createNewFile("sample1.txt");
		createFolder("sampleFiles");
		createFolderAndFile("sampleFiles", "sample.txt");
        displayFolderData("sampleFiles");
		displayOnlyFolders("sampleFiles");
		displayOnlyFiles("sampleFiles");
	}
	
	public static void createNewFile(String fileName) {
		File file = new File(fileName);
		System.out.println(file.exists());
		if(!file.exists()) {
			try {
				// this method will create a file
				file.createNewFile();
				System.out.println(file.exists());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void createFolder(String folderName) {
		File file = new File(folderName);
		System.out.println(file.exists());
		if(!file.exists()) {
			file.mkdir();
			System.out.println(file.exists());
		}
	}
	
	public static void createFolderAndFile(String folderName, String fileName) {
		File folder = new File(folderName);
		//creating new folder
		folder.mkdir();
		//in the folder we are creating file
		File file = new File(folderName, fileName);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void displayFolderData(String folderName) {
		File file = new File(folderName);
		String[] names = file.list();
		for(String name:names) {
			System.out.println(name);
		}
	}
	
	public static void displayOnlyFolders(String folderName) {
		File file = new File(folderName);
		String[] names = file.list();
		for(String name:names) {
			File file2 = new File(folderName, name);
			if (file2.isDirectory())
				System.out.println(name);
		}
	}
	
	public static void displayOnlyFiles(String folderName) {
		File file = new File(folderName);
		String[] names = file.list();
		for(String name:names) {
			File file2 = new File(folderName, name);
			if (file2.isFile())
				System.out.println(name);
		}
	}

}
