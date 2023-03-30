package homework11.level2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Doctor {
    private String name;
    private List<Treatment> treatments;

    public Doctor() {
        this.treatments = new ArrayList<>();
    }

    public Doctor(String name) {
        this.name = name;
       this.treatments = new ArrayList<>();


    }

    public List<String> addTreatment(){
        treatments.add(new Treatment("Капельница"));
        treatments.add(new Treatment("Нурофен"));
        treatments.add(new Treatment("Направление в стационар"));
        treatments.add(new Treatment("Нуррофен"));
        treatments.add(new Treatment("Сдать все анализы"));
        treatments.add(new Treatment("Антибиотики"));
        return new ArrayList<>();
    }
    public Treatment getRandomTreatment(){
        addTreatment();
        Random random = new Random();
        int index = random.nextInt(treatments.size());
        return treatments.get(index);
    }
    public void assignTreatmentToPatient(Patient patient, Treatment treatment){
        System.out.println("Пациенту " + patient.getName() + "назначить: " + treatment.getName());
    }



}
