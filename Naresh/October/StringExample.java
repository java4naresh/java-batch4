class StringExample 
{
	public static void main(String[] args) 
	{
		String name = "Naresh";
		String email = "java4naresh@gmail.com";
		System.out.println(name);//Naresh
		//System.out.println(nameemail);//will it work?
		System.out.println(name + " "+ email);
		System.out.println(20+30);//50
		System.out.println(20+30+name);//50Naresh
		System.out.println(name+20+30);//Naresh2030
		System.out.println(name+20*30);//Naresh600
		System.out.println(name+(20+30));//Naresh50
		System.out.println(20+30+"Naresh");//50Naresh
	}
}
