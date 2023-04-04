package homework22.level1.task8;

public class Match {
    private int year;
    private int month;
    private int day;
    private String firstTeam;
    private int firstTeamCount;
    private int secondTeamCount;
    private String secondTeam;
    private int watchers;
    private String stadium;
    private final String NULL_VALUE = "NULL";

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public int getFirstTeamCount() {
        return firstTeamCount;
    }

    public int getSecondTeamCount() {
        return secondTeamCount;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public int getWatchers() {
        return watchers;
    }

    public String getStadium() {
        return stadium;
    }

    public String getNULL_VALUE() {
        return NULL_VALUE;
    }

    public Match(String input) {
     String[] columns = input.split(", ");
     year = Integer.parseInt(columns[0]);
     month = Integer.parseInt(columns[1]);
     day = Integer.parseInt(columns[2]);
     firstTeam = columns[3];
     String[] twoInts = columns[4].split(":");
     firstTeamCount = Integer.parseInt(twoInts[0]);
     secondTeamCount = Integer.parseInt(twoInts[1]);
     secondTeam = columns[5];
     watchers =columns[6].equals(NULL_VALUE) ? 0 : Integer.parseInt(columns[6]);
     stadium = columns[7].equals(NULL_VALUE) ? null : columns[7];
    }

    public String getWinner() {
        if (firstTeamCount > secondTeamCount) {
            return firstTeam;
        } else if (firstTeamCount < secondTeamCount) {
            return secondTeam;
        }
        return "ничья";
    }

    public int goalCounter() {
       return firstTeamCount + secondTeamCount;
    }


    @Override
    public String toString() {
        return year + ", "
                + month + ", "
                + day + ", "
                + firstTeam + ", "
                + firstTeamCount + ":" + secondTeamCount + ", "
                + secondTeam + ", "
                + watchers + ", "
                + stadium;
    }
}
