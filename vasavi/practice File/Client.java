class Client 
{
	public static void main(String[] args) 
	{
		Assignment ass = new Assignment();
		System.out.println(ass.equal(10,20));
		System.out.println(ass.sub(20,10));
		System.out.println(ass.add(20,10));
		System.out.println(ass.mul(20,10));
	}

	public String getInfo() {
	String info = "Name: vasavi, Gender: Female";
	return info;
	}
}