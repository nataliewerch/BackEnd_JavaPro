package homework11.level2.task1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Registration {
    private List<Patient> queue;
    private int maxQueueSize;

    public Registration(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        this.queue = new ArrayList<>();
    }

    public Registration() {

    }

    public void addPatient(Patient patient) {
        if (queue.size() > maxQueueSize) {
            System.out.println("Запись прекращена ");
        } else {
            queue.add(patient);
        }
    }
    public Patient getNextPatient(){
        return queue.remove(0);
    }


    public boolean isEmpty() {
        return  queue.isEmpty();
    }
}
