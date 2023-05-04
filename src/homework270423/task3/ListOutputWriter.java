package homework270423.task3;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class ListOutputWriter extends Writer {

    List<String> list;

    public ListOutputWriter(List<String> list) {
        this.list = list;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        String string = new String(cbuf, off, len);
        String[] words = string.split(" ");
        list.addAll(Arrays.asList(words));
    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
