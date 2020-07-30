package Primes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController



public class Kontroler {

    private Random nahodne = new Random();
    @GetMapping
    public int nahodneCislo() {
        return nahodne.nextInt();
    }



}
