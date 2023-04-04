package homework22.level1.task8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class MatchTest {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/homework22/level1/task8/matches.txt");
       // файл FC Augsburg.txt с результатами матча этой команды
       List<String> augsburgResult = Files.lines(path)
                .map(Match::new)
                .filter(s -> s.getFirstTeam().equals("FC Augsburg") || s.getSecondTeam().equals("FC Augsburg"))
                .map(s -> {
                    if(s.getFirstTeam().equals("FC Augsburg")) {
                        return s.getFirstTeamCount() + ":" + s.getSecondTeamCount();
                    } else {
                        return s.getSecondTeamCount() + ":" + s.getFirstTeamCount();
                    }
                })
                .collect(Collectors.toList());
        Files.write(Path.of("src/homework22/level1/task8/FC Augsburg.txt"), augsburgResult, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        System.out.println(augsburgResult);

        //все матчи проходившие на Mercedes-Benz Arena
       List<String> mercedesBenzArena = Files.lines(path)
                .map(Match::new)
                .filter(s -> s.getStadium() != null)
                .filter(s -> s.getStadium().equals("Mercedes-Benz Arena"))
                .map(Match::toString)
                .collect(Collectors.toList());

        Files.write(Path.of("src/homework22/level1/task8/Mercedes-Benz Arena.txt"), mercedesBenzArena, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        System.out.println(mercedesBenzArena);

        //winners.txt
        List<String> winners = Files.lines(path)
                .map(Match::new)
                .map(Match::getWinner).toList();
        Files.write(Path.of("src/homework22/level1/task8/winners.txt"), winners, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        System.out.println(winners);

        //вывести файл table.txt информацию какая команда сколько забила мячей
        List<String> goalCount = Files.lines(path)
                .map(Match::new)
                .collect(Collectors.groupingBy(Match::getFirstTeam, Collectors.summingInt(Match::goalCounter)))
                .entrySet().stream()
                .map(s -> s.getKey() + ": " + s.getValue())
                .sorted().toList();
        Files.write(Path.of("src/homework22/level1/task8/table.txt"), goalCount, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        System.out.println(goalCount);
    }
}
