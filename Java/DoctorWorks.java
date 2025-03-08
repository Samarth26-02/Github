class DoctorWorks{
	public static void main(String[] args){
		Hospital.admitPatient();
		Hospital.provideEmergencyCare();
		Hospital.manageRecords();
		Hospital.conductSurgery();
		Hospital.dischargePatient();
		
		Doctor.illeness();
		Doctor.medicine();
		Doctor.checkReports();
		Doctor.performSurgery();
		Doctor.consultPatient();
		}
}
class Doctor{
	public static void illness(){
		System.out.println("Illness are diagnoised");
	}
	public static void medicine(){
		System.out.println("Doctor priscribes the medicine");
	}
	public static void checkReports(){
		System.out.println("Doctor checks reports");
	}
	public static void performSurgery(){
		System.out.println("Surgeries are performed");
	}
	public static void consultPatient(){
		System.out.println("Doctor consults patients");
	}
}