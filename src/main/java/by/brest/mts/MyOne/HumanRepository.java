package by.brest.mts.MyOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends JpaRepository<Human, Integer> {

    //List<Human> findByName(String name);
    List<Human> findHumanByName(String myFilterName);

    Human findFirstByName(String name);

    @Query(            value = "SELECT * FROM HUMAN WHERE AGE >= ?1 AND AGE <= ?2 AND WEIGHT >= ?3 AND WEIGHT <= ?4", nativeQuery = true    )
    List<Human> findHumansByCondition(Integer ageFrom, Integer ageTo, float weightFrom, float weightTo);

    List<Human> findAllByAgeBetweenAndWeightBetween(Integer ageFrom, Integer ageTo, float weightFrom, float weightTo);

    List<Human> findAllByNameContainsAndAgeIsLessThanAndWeightGreaterThanOrderByAgeDesc(
            String namePart, Integer ageLess, float weightGreater);
}
