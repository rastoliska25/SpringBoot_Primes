package Primes;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public CalculatorForm calculate(CalculatorForm calculator){
        if (calculator.getOperation().equals("+")) {
            calculator.setResult(calculator.getNumber1() + calculator.getNumber2());
        } else if (calculator.getOperation().equals("-")) {
            calculator.setResult(calculator.getNumber1() - calculator.getNumber2());
        } else if ((calculator.getOperation().equals("*"))){
            calculator.setResult(calculator.getNumber1() * calculator.getNumber2());
        } else if(calculator.getOperation().equals("/")) {
            if(calculator.getNumber2() == 0){
                throw new IllegalArgumentException("Druhé číslo nemôže byť!!!!");
            }
            calculator.setResult(calculator.getNumber1() / calculator.getNumber2());
        }
        return calculator;
    }


}
