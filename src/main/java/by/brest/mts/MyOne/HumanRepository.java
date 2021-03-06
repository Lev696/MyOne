package by.brest.mts.MyOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends JpaRepository<Human, Integer> {

    List<Human> findByName(String name);

}
