package pro.sky.skyprohomework10Apr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return calculatorService.answerCalculator();
    }


    @GetMapping(path = "/calculator/plus")
    public String summTask2(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.summTask2(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusTask3(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minusTask3(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyTask4(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplyTask4(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideTask5(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divideTask5(num1, num2);
    }

}
