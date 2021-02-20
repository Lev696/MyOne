package by.brest.mts.MyOne;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HumansStorage {
    List<Human> allHumans;


    public HumansStorage() {
        allHumans = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "HumansStorage{" +
                "allHumans=" + allHumans +
                '}';
    }

    public List<Human> getAllHumans() {
        return allHumans;
    }

    public void setAllHumans(List<Human> allHumans) {
        this.allHumans = allHumans;
    }

    public void addHuman(Human addH) {
        this.allHumans.add(addH);
    }
}
