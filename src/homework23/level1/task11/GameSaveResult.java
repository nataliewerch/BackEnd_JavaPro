package homework23.level1.task11;

import java.io.*;

public class GameSaveResult implements Serializable{
    private String name;
    private int winCounter;
    private int loseCounter;


    public GameSaveResult(String name, int winCounter, int loseCounter) {
        this.name = name;
        this.winCounter = winCounter;
        this.loseCounter = loseCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWinCounter(int winCounter) {
        this.winCounter = winCounter;
    }

    public void setLoseCounter(int loseCounter) {
        this.loseCounter = loseCounter;
    }

    public int getWinCounter() {
        return winCounter;
    }

    public int getLoseCounter() {
        return loseCounter;
    }
    public void winCounter() {
        winCounter++;
    }
    public void loseCounter() {
        loseCounter++;
    }

    public void saveResult(File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static GameSaveResult readResult(File file) {
        if (!file.exists()) {
            return null;
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (GameSaveResult) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name +", Wins: " + winCounter + ", Losses: " + loseCounter;
    }
}
