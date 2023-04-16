package pro.sky.skyprohomework10Apr;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String summTask2(int num1, int num2) {
        int summ = num1 + num2;
        return num1 + " + " + num2 + " = " + summ;
    }

    public String minusTask3(int num1, int num2) {
        int minus = num1 - num2;
        return num1 + " - " + num2 + " = " + minus;
    }

    public String multiplyTask4(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }

    public String divideTask5(int num1, int num2) {
        int divide = num1 - num2;
        return num1 + " / " + num2 + " = " + divide;
    }

}
