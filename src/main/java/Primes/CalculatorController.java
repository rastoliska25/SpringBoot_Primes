package Primes;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String printCalculator(Model model) {
        model.addAttribute("calculator", new CalculatorForm());
        return "calculator";
    }



}
