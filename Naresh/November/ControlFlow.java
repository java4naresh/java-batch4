class ControlFlow 
{
	static {
	System.out.println("static-block1");
	}

	{
	System.out.println("non static-block1");
	}

	static int num1 = getNum1();

    int num2 = getNum2();

	int num3 = getNum3();

    static int num4 = getNum4();

	static {
	System.out.println("static-block2");
	}

	{
	System.out.println("non static-block2");
	}

	public static int getNum1() {
		System.out.println("getNum1");
	    return 10;
	}

    public int getNum2() {
		System.out.println("getNum2");
	    return 20;
	}

	public static int getNum4() {
		System.out.println("getNum4");
	    return 30;
	}

    public int getNum3() {
		System.out.println("getNum3");
	    return 40;
	}

	public ControlFlow() {
	System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		ControlFlow cf1 = new ControlFlow();
		ControlFlow cf2 = new ControlFlow();
	}
}
