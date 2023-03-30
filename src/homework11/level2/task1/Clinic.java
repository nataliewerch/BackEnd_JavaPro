package homework11.level2.task1;

import java.util.ArrayDeque;

public class Clinic {
    private ArrayDeque<Patient> queue;

    private Doctor doctor;
    private Registration registration;

    public Clinic() {
        this.doctor = new Doctor();
        this.registration = new Registration(10);
    }


    public void doctorStartAppointment(){
        System.out.println("Доктор начинает прием: ");
        while (!registration.isEmpty()){
            Patient patient = registration.getNextPatient();
            Treatment treatment = doctor.getRandomTreatment();
            doctor.assignTreatmentToPatient(patient, treatment);
        }
    }

    public void addPatient(Patient patient){
        registration.addPatient(patient);
    }
}
