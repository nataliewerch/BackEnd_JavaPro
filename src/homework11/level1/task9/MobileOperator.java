package homework11.level1.task9;

import java.util.PriorityQueue;

public class MobileOperator {
    private PriorityQueue<Client> queue;

    public MobileOperator() {
        this.queue = new PriorityQueue<>();
    }


    public void addClient(Client client){
        queue.add(client);
    }

    public Client getNextClient(){
        return queue.poll();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

}
