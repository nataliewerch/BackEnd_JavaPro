package homework270423.task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ListOutputWriterTest {
    public static void main(String[] args) {

        String message = "This is my first experience when I myself work with IO API";
        List<String> list = new ArrayList<>();

        try(ListOutputWriter writer = new ListOutputWriter(list)) {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.stream().forEach(System.out::println);
    }
}
