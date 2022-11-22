class Client 
{
	public static void main(String[] args) 
	{
		Arithmetic art = new Arithmetic();
		System.out.println(art.sum(10,20));
		System.out.println(art.sub(20,10));
		System.out.println(art.mul(20,10));
		System.out.println(art.div(20,10));
	}

	public String getInformation() {
	String info = "Name: Naresh, Age: 30, Gender: Male";
	return info;
	}
}
