package homework200423.task3;

public record ProjectStudent(String name, double rate, String type) {

    @Override
    public String toString() {
        return "name: " + name +
                ", rate: " + rate +
                ", type: " + type +
                ';';
    }
}
