package by.brest.mts.MyOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestControllerMy {
    // http://192.168.3.15/hello    (localhost, 127.0.0.1)

    @Autowired
    HumansStorage humansStorage;

    @Autowired
    HumanService humanService;

    // http://localhost/hello
    @GetMapping("/hello")
    public String homePage() {
        System.out.println("Invoked /hello");
        String someString = "Hello, world! ";
        return someString + '5';
    }

    // http://192.168.3.15
    @GetMapping("/")
    public String homePageDigit() {
        System.out.println("Invoked /");
        return "Blabla ";
    }

    @GetMapping("/human")
    public Human getHuman() {
        Human serg = new Human("Serega", 35, 70);
        return serg;
    }

    @GetMapping("/humans")
    public List<Human> getHumans() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Serega", 35, 70));
        humans.add(new Human("Sasha", 40, 78));
        humans.add(new Human("Vasya", 55, 85));

        return humans;
    }

    @GetMapping("/humansStorage")
    public List<Human> getHumansStorage() {
        return humansStorage.getAllHumans();
    }


    // POST
    @PostMapping("/new")
    public void inputMethod(@RequestBody int a) {
        System.out.println("a = " + a);
    }

    @PostMapping("/newhuman")
    public void newHuman(@RequestBody Human myNewHuman) {
        System.out.println("# Added human: " + myNewHuman.toString());
        humansStorage.addHuman(myNewHuman);
    }







    // ##############################################
    // JPA Added
    @GetMapping("/jpahumans")
    public List<Human> findAllHumans() {
        return humanService.findAllHumans();
    }

    @GetMapping("/jpahumansbyname/{name}")
    public List<Human> findHumansByName(@PathVariable String name) {
        return humanService.findHumanByName(name);
    }

    @GetMapping("/jpafirsthumanbyname/{name}")
    public Human findFirstHumanByName(@PathVariable String name) {
        return humanService.findFirstByName(name);
    }

    @GetMapping("jpahumansbycondition/{ageFrom}/{ageTo}/{weightFrom}/{weightTo}")
    public List<Human> findHumansByCondition(@PathVariable Integer ageFrom, @PathVariable Integer ageTo,
                                             @PathVariable float weightFrom, @PathVariable float weightTo) {
        return humanService.findHumansByCondition(ageFrom, ageTo, weightFrom, weightTo);
    }

    @GetMapping("jpahumansbycondition2/{ageFrom}/{ageTo}/{weightFrom}/{weightTo}")
    public List<Human> findAllByAgeBetweenAndWeightBetween(@PathVariable Integer ageFrom, @PathVariable Integer ageTo,
                                             @PathVariable float weightFrom, @PathVariable float weightTo) {
        return humanService.findAllByAgeBetweenAndWeightBetween(ageFrom, ageTo, weightFrom, weightTo);
    }

    @GetMapping("jpalong/{namepart}/{ageless}/{weightgreater}")
    public List<Human> findAllLong(@PathVariable String namepart, @PathVariable Integer ageless,
                                                           @PathVariable float weightgreater) {
        return humanService.findAllByNameContainsAndAgeIsLessThanAndWeightGreaterThanOrderByAge(namepart, ageless, weightgreater);
    }

}
