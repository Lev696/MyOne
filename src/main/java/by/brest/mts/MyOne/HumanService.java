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

}
