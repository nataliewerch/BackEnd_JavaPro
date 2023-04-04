package homework22.level2.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Terminal {
private Path dirName;
    public Terminal(Path fileName) {
        dirName = fileName.toAbsolutePath();
    }
    private void inputCommand(String command) throws IOException {
        String[] words = command.split(" ");
        String splitCommand = words[0];

        switch (splitCommand) {
            case "cd":
                cd(words);
                break;
            case "ls":
                ls(words);
                break;
            case "mkdir":
                mkdir(words);
                break;
            case "nano":
                nano(words);
                break;
            case "rm":
                rm(words);
                break;
            case "pwd":
                pwd();
                break;
            case "exit":
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Неверная команда!!!");
                break;
        }
    }

    public void run() throws IOException {
       Scanner scanner = new Scanner(System.in);
       String strInput = "";

       while (!strInput.equals("exit")) {
           System.out.println(dirName.toString() + "> ");
           strInput = scanner.nextLine();
           inputCommand(strInput);
       }
    }

    public void cd(String[] command) {
        if (command.length < 2) {
           dirName = dirName.getFileName();
        } else if (command[1].equals("..")){
            dirName = dirName.getParent();
        }else {
            dirName = dirName.resolve(command[1]);
        }
    }

    public void ls(String[] command) throws IOException {
        Path path;
        if (command.length < 2) {
            path = dirName;
    } else  {
            path = dirName.resolve(command[1]);

    }
      if (Files.isDirectory(path)) {
          Files.list(path)
                  .forEach(p -> System.out.println(p.getFileName()));
          Files.list(path).close();
      }else {
          System.out.println(path.getFileName());
      }
    }

    public void mkdir(String[] command) throws IOException {
       String name = command[1];
       Path path =dirName.resolve(name);
       Files.createDirectory(path);
    }

    private void nano(String[] command) throws IOException {
        String name = command[1];
        Path path =dirName.resolve(name);
        Files.createFile(path);
    }

    private void rm(String[] command) throws IOException {
        String name = command[1];
        Path path = dirName.resolve(name);
        if (Files.isDirectory(path)) {
            Files.walk(path)
                    .sorted(Comparator.reverseOrder())
                    .forEach(p -> {
                        try {
                            Files.delete(p);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } else {
            Files.delete(path);
        }
    }

    private void pwd() {
        System.out.println(dirName.toAbsolutePath());
    }


}
