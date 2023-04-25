package homework200423.task3;

public class Student {
    protected String name;
    protected double rate;
    protected boolean finished;
    protected String type;

    public Student(String name, double rate, boolean finished, String type) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }
    public boolean isFinished() {
        return finished;
    }
    public String getType() {
        return type;
    }
}

