class  AppointmentManagement
{
	String date;
	String inTime;
	String timeSlot;
	String outTime;
      public AppointmentManagement(String date, String inTime, String timeSlot, String outTime) {
}
	
}

class PatientManagement extends AppointmentManagement
{
	String patientName;
	String patientDOB;
	char gender;
	String bloodGroup;
	public PatientManagement(String date, String inTime, String timeSlot, String outTime, String patientName, String patientDOB, char gender, String bloodGroup) {
      super(date, inTime, timeSlot, outTime);
	super.date = date;
	super.inTime = inTime;
	super.timeSlot = timeSlot;
	super.outTime = outTime;
	this.patientName = patientName;
	this.patientDOB = patientDOB;
	this.gender = gender;
	this.bloodGroup = bloodGroup;

	}
}

class FacilityManagement extends PatientManagement
{
	String pharmacy;
	String clinicalLaboratory;
	String ambulance;
	String healthCheckups;
	public FacilityManagement(String date, String inTime, String timeSlot, String outTime, String patientName, String patientDOB, char gender, String bloodGroup, String pharmacy, String clinicalLaboratory, String ambulance, String healthCheckups) {
      super(date, inTime, timeSlot, outTime, patientName, patientDOB, gender, bloodGroup);
	super.date = date;
	super.inTime = inTime;
	super.timeSlot = timeSlot;
	super.outTime = outTime;
	super.patientName = patientName;
	super.patientDOB = patientDOB;
	super.gender = gender;
	super.bloodGroup = bloodGroup;
	this.pharmacy = pharmacy;
	this.clinicalLaboratory = clinicalLaboratory;
	this.ambulance = ambulance;
	this.healthCheckups = healthCheckups;

	}

}

class StaffManagement extends FacilityManagement
{
	int manpowerPlanning;
	int recruitment;
	int actualStaff;
      public StaffManagement(String date, String inTime, String timeSlot, String outTime, String patientName, String patientDOB, char gender, String bloodGroup, String pharmacy, String clinicalLaboratory, String ambulance, String healthCheckups, int manpowerPlanning, int recruitment, int actualStaff) {
      super(date, inTime, timeSlot, outTime, patientName, patientDOB, gender, bloodGroup, pharmacy, clinicalLaboratory, ambulance, healthCheckups);
	super.date = date;
	super.inTime = inTime;
	super.timeSlot = timeSlot;
	super.outTime = outTime;
	super.patientName = patientName;
	super.patientDOB = patientDOB;
	super.gender = gender;
	super.bloodGroup = bloodGroup;
	super.pharmacy = pharmacy;
	super.clinicalLaboratory = clinicalLaboratory;
	super.ambulance = ambulance;
	super.healthCheckups = healthCheckups;
	this.manpowerPlanning = manpowerPlanning;
	this.recruitment = recruitment;
	this.actualStaff = actualStaff;

	}
}

class HospitalManagement
{
	public static void main(String[] args){
		/*System.out.println("Appointment Mangement");
		System.out.println("Patient 1");
		AppointmentManagement am = new AppointmentManagement("01-12-2022", "10:30AM", "11:15AM", "12:10PM");
		System.out.println(am.date+ " " +am.inTime+ " " +am.timeSlot+ " " +am.outTime);
            System.out.println("Patient 2");
		AppointmentManagement am2 = new AppointmentManagement("04-12-2022", "12:30PM", "01:30PM", "04:10PM");
		System.out.println(am2.date+ " " +am2.inTime+ " " +am2.timeSlot+ " " +am2.outTime);
		System.out.println("-----------------");*/

		System.out.println("Patient Mangement");
		System.out.println("Patient 1");
		PatientManagement pm = new PatientManagement("01-12-2022", "10:30AM", "11:15AM", "12:10PM", "Sravan", "01-01-1995", 'M', "B-");
		System.out.println(pm.date+ " " +pm.inTime+ " " +pm.timeSlot+ " " +pm.outTime+ " " +pm.patientName+ " " +pm.patientDOB+ " " +pm.gender+ " " +pm.bloodGroup);
		System.out.println("Patient 2");
		PatientManagement pm2 = new PatientManagement("04-12-2022", "12:30PM", "01:30PM", "04:10PM", "Latha", "07-11-1993", 'F', "A+");
		System.out.println(pm2.date+ " " +pm2.inTime+ " " +pm2.timeSlot+ " " +pm2.outTime+ " " +pm2.patientName+ " " +pm2.patientDOB+ " " +pm2.gender+ " " +pm2.bloodGroup);
		System.out.println("----------------------");

            System.out.println("Facility Management");
            System.out.println("Patient 1");
		FacilityManagement fm = new FacilityManagement("01-12-2022", "10:30AM", "11:15AM", "12:10PM", "Sravan", "01-01-1995", 'M', "B-", "24Hours", "9Hours", "24Hours", "24Hours");
		System.out.println(fm.date+ " " +fm.inTime+ " " +fm.timeSlot+ " " +fm.outTime+ " " +fm.patientName+ " " +fm.patientDOB+ " " +fm.gender+ " " +fm.bloodGroup+ " " +fm.pharmacy+ " "+fm.clinicalLaboratory+ " " +fm.ambulance+ " " +fm.healthCheckups);
		System.out.println("Patient 2");
            FacilityManagement fm2 = new FacilityManagement("04-12-2022", "12:30PM", "01:30PM", "04:10PM", "Latha", "07-11-1993", 'F', "A+", "24Hours", "9Hours", "24Hours", "24Hours");
		System.out.println(fm2.date+ " " +fm2.inTime+ " " +fm2.timeSlot+ " " +fm2.outTime+ " " +fm2.patientName+ " " +fm2.patientDOB+ " " +fm2.gender+ " " +fm2.bloodGroup+ " " +fm2.pharmacy+ " "+fm2.clinicalLaboratory+ " " +fm2.ambulance+ " " +fm2.healthCheckups);
            System.out.println("-----------------");

            System.out.println("Staff Mangement");
            System.out.println("Patient 1");
		StaffManagement sm = new StaffManagement("01-12-2022", "10:30AM", "11:15AM", "12:10PM", "Sravan", "01-01-1995", 'M', "B-", "24Hours", "9Hours", "24Hours", "24Hours", 5, 20, 70);
		System.out.println(sm.date+ " " +sm.inTime+ " " +sm.timeSlot+ " " +sm.outTime+ " " +sm.patientName+ " " +sm.patientDOB+ " " +sm.gender+ " " +sm.bloodGroup+ " " +sm.pharmacy+ " "+sm.clinicalLaboratory+ " " +sm.ambulance+ " " +sm.healthCheckups+ " " +sm.manpowerPlanning+ " " +sm.recruitment+ " " +sm.actualStaff);
            System.out.println("Patient 2");
		StaffManagement sm2 = new StaffManagement("04-12-2022", "12:30PM", "01:30PM", "04:10PM", "Latha", "07-11-1993", 'F', "A+", "24Hours", "9Hours", "24Hours", "24Hours", 7, 18, 68);
		System.out.println(sm2.date+ " " +sm2.inTime+ " " +sm2.timeSlot+ " " +sm2.outTime+ " " +sm2.patientName+ " " +sm2.patientDOB+ " " +sm2.gender+ " " +sm2.bloodGroup+ " " +sm2.pharmacy+ " "+sm2.clinicalLaboratory+ " " +sm2.ambulance+ " " +sm2.healthCheckups+ " " +sm2.manpowerPlanning+ " " +sm2.recruitment+ " " +sm2.actualStaff);
		

		
}

}