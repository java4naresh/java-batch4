package test;

import varargs.Caclulator;

public class VarArgsTest {

	public static void main(String[] args) {
		System.out.println(Caclulator.sum(10));
		System.out.println(Caclulator.sum(10,20));
		System.out.println(Caclulator.sum(10,20,30));
		System.out.println(Caclulator.sum(10,20,30,40));
		System.out.println(Caclulator.sum());

	}

}
