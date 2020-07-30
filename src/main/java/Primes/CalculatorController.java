package Primes;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/kalkulacka")
    public String printCalculator(Model model) {
        model.addAttribute("kalkulacka", new CalculatorForm());
        return "kalkulacka";
    }



}
