package by.brest.mts.MyOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HumanRunner implements CommandLineRunner {

    @Autowired
    HumanRepository humanRepository;

    @Autowired
    public HumanRunner(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        humanRepository.save(new Human("Leha", 15, 50));
        humanRepository.save(new Human("Leha", 17, 77));
        humanRepository.save(new Human("Sasha", 27, 78));
        humanRepository.save(new Human("Meow", 4, 7));
    }
}