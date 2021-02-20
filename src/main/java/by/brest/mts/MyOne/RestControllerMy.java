package by.brest.mts.MyOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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



    // POST
    @PostMapping("/new")
    public void inputMethod(@RequestBody int a) {
        System.out.println("a = " + a);
    }

}
