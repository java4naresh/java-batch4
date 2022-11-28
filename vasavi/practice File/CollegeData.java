class CollegeData 
{
	public static void main(String[] args) 
	{
		Students d = new Students();
		System.out.println(d.StudentsTotal());
		System.out.println(d.FacultyMembers());
		System.out.println(d.CollegeName());

		 Faculty f = new Faculty();
                System.out.println(f.FacultyMembers());
		System.out.println(f.CollegeName());

		College c = new College();
        System.out.println(c.CollegeName());
	}
}
