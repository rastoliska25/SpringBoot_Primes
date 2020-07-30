package Primes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController



public class Kontroler {

    private Random nahodne = new Random();
    @GetMapping("/random")
    public int nahodneCislo() {
        return nahodne.nextInt();
    }


        @GetMapping(value = "/greet/{meno}")
        public String greetUser(@PathVariable String meno) {
            return "Ahoj, "+ meno;
        }
    }


