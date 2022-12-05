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

		StaffManagement sm = new StaffManagement("01-12-2022", "10:30AM", "11:15AM", "12:10PM", "Sravan", "01-01-1995", 'M', "B-", "24Hours", "9Hours", "24Hours", "24Hours", 5, 20, 70);
		System.out.println(sm.date+ " " +sm.inTime+ " " +sm.timeSlot+ " " +sm.outTime+ " " +sm.patientName+ " " +sm.patientDOB+ " " +sm.gender+ " " +sm.bloodGroup+ " " +sm.pharmacy+ " "+sm.clinicalLaboratory+ " " +sm.ambulance+ " " +sm.healthCheckups+ " " +sm.manpowerPlanning+ " " +sm.recruitment+ " " +sm.actualStaff);
}

}