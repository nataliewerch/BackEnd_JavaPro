package homework11.level2.task1;

public class ClinicTest {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.addPatient(new Patient("Ivanov "));
        clinic.addPatient(new Patient("Petrov "));
        clinic.addPatient(new Patient("Sidorov "));
        clinic.addPatient(new Patient("Glebov "));
        clinic.addPatient(new Patient("Setko "));
        clinic.addPatient(new Patient("Levenko "));
        clinic.addPatient(new Patient("Shmidt "));
        clinic.addPatient(new Patient("Frank "));
        clinic.addPatient(new Patient("Tomin "));
        clinic.addPatient(new Patient("Iljjan "));
        clinic.addPatient(new Patient("Rekjan"));
        clinic.doctorStartAppointment();

    }
}
