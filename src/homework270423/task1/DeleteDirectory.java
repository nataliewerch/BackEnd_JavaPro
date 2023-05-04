package homework270423.task1;

import java.io.File;

public class DeleteDirectory {

    public static void main(String[] args) {
        File directory = new File("/Users/Natalie/Desktop/test");
        deleteDirectory(directory);
    }

    public static void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDirectory(file);
                    } else {
                        file.delete();
                    }
                }
            }
            directory.delete();
        }
    }
}
