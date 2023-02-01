package tasks;

public class StringBufferExample {

	public static void main(String[] args) {
		
		String name = "GnanaVikas";
		System.out.println(name);
		String name2 = name.concat(" Pallapati");
		System.out.println(name2);
		
		StringBuilder sbd = new StringBuilder("Pardhu");
		System.out.println(sbd);
		sbd.append(" Pallapati");
		System.out.println(sbd);
		
		
		
	}
	}

