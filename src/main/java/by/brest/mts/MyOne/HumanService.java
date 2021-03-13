package by.brest.mts.MyOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HumanService {

    @Autowired
    HumanRepository humanRepository;

    public List<Human> findAllHumans() {
        return humanRepository.findAll();
    }

    public List<Human> findHumanByName(String humanName) {
        return humanRepository.findHumanByName(humanName);
    }

    public Human findFirstByName(String humanName) {
        return humanRepository.findFirstByName(humanName);

    }

    public List<Human> findHumansByCondition(Integer ageFrom, Integer ageTo, float weightFrom, float weightTo) {
        return humanRepository.findHumansByCondition(ageFrom, ageTo, weightFrom, weightTo);
    }

    public List<Human> findAllByAgeBetweenAndWeightBetween(Integer ageFrom, Integer ageTo, float weightFrom, float weightTo) {
        return humanRepository.findAllByAgeBetweenAndWeightBetween(ageFrom, ageTo, weightFrom, weightTo);
    }

    public List<Human> findAllByNameContainsAndAgeIsLessThanAndWeightGreaterThanOrderByAge(String namePart, Integer ageLess, float weightGreater) {
        return humanRepository.findAllByNameContainsAndAgeIsLessThanAndWeightGreaterThanOrderByAgeDesc(namePart, ageLess, weightGreater);
    }

}
