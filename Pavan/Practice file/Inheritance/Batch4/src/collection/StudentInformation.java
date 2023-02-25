package collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentInformation {

	public static void main(String[] args) throws Exception {

		Map<String, List<String>> test = new HashMap<>();

		FileReader fr = new FileReader("F:\\Student1.txt");
		try (BufferedReader br = new BufferedReader(fr)) {
			String i;

			while ((i = br.readLine()) != null) {
				String data[] = i.split(" ");
				i = i.substring(0, i.length() - 1);
				List<String> datalist = new ArrayList<String>();
				datalist.add(data[0]);
				datalist.add(data[1]);
				datalist.add(data[2]);
				datalist.add(data[3]);
				datalist.add(data[4]);
				datalist.add(data[5]);
				datalist.add(data[6]);
				datalist.add(data[7]);
				test.put(data[1], datalist);
				Iterator<String> itr = datalist.iterator();
				while (itr.hasNext()) {
					// System.out.println(itr.next());
					String datalist1 = itr.next();

				}
			}
			for (String datalist1 : test.keySet()) {
				System.out.println("key is " + datalist1 + "Data" + test.get(datalist1));
			}

		}
	}
}
