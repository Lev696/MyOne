package by.brest.mts.MyOne;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestControllerMy {
    // http://192.168.3.15/hello    (localhost, 127.0.0.1)

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



    // POST
    @PostMapping("/new")
    public void inputMethod(@RequestBody int a) {
        System.out.println("a = " + a);
    }

    @PostMapping("/newhuman")
    public void newHuman(@RequestBody Human myNewHuman) {
        System.out.println("myNewHuman = " + myNewHuman.toString());
    }

}
