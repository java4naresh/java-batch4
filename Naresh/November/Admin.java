class Admin 
{
	public static void main(String[] args) 
	{
		JntuCollegeStudents.collegeName = "JNTU";

        JntuCollegeStudents student1 = new JntuCollegeStudents();
        System.out.println(student1.studentId+" "+student1.studentName+" "+student1.studentGender+" "+ student1.collegeName);
        student1.studentId = 1;
		student1.studentName = "Naresh";
		student1.studentGender = 'M';
        System.out.println(student1.studentId+" "+student1.studentName+" "+student1.studentGender+" "+ student1.collegeName);
		JntuCollegeStudents student2 = new JntuCollegeStudents();
        System.out.println(student2.studentId+" "+student2.studentName+" "+student2.studentGender+" "+ student2.collegeName);
        student2.studentId = 2;
		student2.studentName = "Mahesh";
		student2.studentGender = 'M';
		System.out.println(student2.studentId+" "+student2.studentName+" "+student2.studentGender+" "+ student2.collegeName);
	}
}
