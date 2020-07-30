package Primes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Operacie {

    @GetMapping("/kalkulacka")
    public void printCalculator(Model model) {

    }
}

