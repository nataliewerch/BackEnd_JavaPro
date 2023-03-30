package homework10.level1.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Newspaper {

    private List<Advertisement> advertisements;

    public Newspaper() {
        this.advertisements = new ArrayList<Advertisement>();
    }

    public void addAdvertisement(Advertisement advertisement) {
        this.advertisements.add(advertisement);
    }

    public void sortAdvertisement() {
        Collections.sort(this.advertisements);
    }

    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }


    public Advertisement minAd(Newspaper newspaper){
        Advertisement min = getAdvertisements().get(0);
        for (int i = 0; i < getAdvertisements().size(); i++){
            Advertisement current = getAdvertisements().get(i);
            if (current.compareTo(min) < 0){
                min = current;
            }
        } return min;

    }


    public Advertisement maxAd(Newspaper newspaper){
        Advertisement max = getAdvertisements().get(0);
        for (int i = 0; i < getAdvertisements().size(); i++){
            Advertisement current = getAdvertisements().get(i);
            if (current.compareTo(max) > 0){
                max = current;
            }
        } return max;

    }


    @Override
    public String toString() {
        return " " + advertisements;
    }
}
