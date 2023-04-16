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
    public String summTask2(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.plusTask2(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusTask3(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.minusTask3(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyTask4(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.multiplyTask4(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideTask5(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return calculatorService.divideTask5(num1, num2);
    }

}
