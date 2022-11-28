class College 
{
	public String CollegeName() {
	
	return "GVP";
	}
}

class Faculty extends College
{
	public int FacultyMembers() {
		return 120;
	}
}

class Students extends Faculty
{
	public int StudentsTotal() {
		return 11000;
	}
}