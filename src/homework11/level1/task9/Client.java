package homework11.level1.task9;

import java.util.PriorityQueue;

public class Client implements Comparable<Client> {

    private String name;
   private boolean isVip;

    public Client(String name, boolean isVip) {
        this.name = name;
        this.isVip = isVip;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return isVip;
    }

    @Override
    public int compareTo(Client o) {
        if (this.isVip && !o.isVip){
            return -1;
        }
        if (!this.isVip && o.isVip){
            return 1;
        }else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", isVip=" + isVip +
                '}';
    }
}
