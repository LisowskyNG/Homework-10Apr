package pro.sky.skyprohomework10Apr;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plusTask2(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Параметры не заданы ";
        } else {
            int plus = num1 + num2;
            return num1 + " + " + num2 + " = " + plus;
        }

    }

    public String minusTask3(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Параметры не заданы ";
        } else {
            int minus = num1 - num2;
            return num1 + " - " + num2 + " = " + minus;
        }
    }

    public String multiplyTask4(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Параметры не заданы ";
        } else {
            int multiply = num1 * num2;
            return num1 + " * " + num2 + " = " + multiply;
        }
    }

    public String divideTask5(Integer num1, Integer num2) {

        if(num1 == null || num2 == null) {
            return "Параметры не заданы ";
        } else if (num2 == 0) {
            return "Делить на ноль нельзя";
        } else {
            int divide = num1 / num2;
            return num1 + " / " + num2 + " = " + divide;
        }
    }

}
