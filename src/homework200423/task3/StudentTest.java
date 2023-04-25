package homework200423.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<FrontEndStudent> feStudents = new ArrayList<>();
        feStudents.add(new FrontEndStudent("Schmidt A.", 5.3,true));
        feStudents.add(new FrontEndStudent("Ivanov B.", 4.1,false));
        feStudents.add(new FrontEndStudent("Bred S.", 3.3,true));
        feStudents.add(new FrontEndStudent("Schwarz G.", 5.8,true));
        feStudents.add(new FrontEndStudent("Stern C.", 5.5,false));

        List<BackEndStudent> beStudents = new ArrayList<>();
        beStudents.add(new BackEndStudent("Strauß A.", 4.2, false));
        beStudents.add(new BackEndStudent("Petrov B.", 4.4, false));
        beStudents.add(new BackEndStudent("Kleene A.", 5.2, true));
        beStudents.add(new BackEndStudent("Melko D.", 5.6, true));
        beStudents.add(new BackEndStudent("Stoll K.", 4.0, false));

        List<QAStudent> qaStudents = new ArrayList<>();
        qaStudents.add(new QAStudent("Groß S.", 3.8, false));
        qaStudents.add(new QAStudent("Klein A.", 4.9, true));
        qaStudents.add(new QAStudent("Metin E.", 3.1, false));
        qaStudents.add(new QAStudent("Kleber D.", 5.8, true));
        qaStudents.add(new QAStudent("Lamp S.", 4.1, true));

        List<List<? extends Student>> allStudents = new ArrayList<>();
        allStudents.add(feStudents);
        allStudents.add(beStudents);
        allStudents.add(qaStudents);

        List<ProjectStudent> peStudents = allStudents.stream()
                .flatMap(List::stream)
                .filter(student -> student.getRate() > 4.5 && student.isFinished())
                .map(student -> new ProjectStudent(student.getName(), student.getRate(), student.getType()))
                .peek(System.out::println)
                .toList();
    }
}
