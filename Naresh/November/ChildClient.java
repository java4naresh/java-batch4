class ChildClient 
{
	public static void main(String[] args) 
	{
		Child ch = new Child();
		System.out.println(ch.childProperty());
		System.out.println(ch.parentProperty());
		System.out.println(ch.grandParentProperty());

		Parents p = new Parents();
        System.out.println(p.parentProperty());
		System.out.println(p.grandParentProperty());

		GrandParent gp = new GrandParent();
        System.out.println(gp.grandParentProperty());
	}
}
