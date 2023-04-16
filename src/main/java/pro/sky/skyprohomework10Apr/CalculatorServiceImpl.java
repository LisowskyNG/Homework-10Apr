package pro.sky.skyprohomework10Apr;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plusTask2(Integer num1, Integer num2) {
        if (nullChecking(num1, num2)) {
            return "Параметры не заданы ";
        } else {
            return num1 + " + " + num2 + " = " +(num1 + num2);
        }
    }

    public String minusTask3(Integer num1, Integer num2) {
        if (nullChecking(num1, num2)) {
            return "Параметры не заданы ";
        } else {
            return num1 + " - " + num2 + " = " +(num1 - num2);
        }
    }

    public String multiplyTask4(Integer num1, Integer num2) {
        if (nullChecking(num1, num2)) {
            return "Параметры не заданы ";
        } else {
            return num1 + " * " + num2 + " = " +(num1 * num2);
        }
    }

    public String divideTask5(Integer num1, Integer num2) {

        if(nullChecking(num1, num2)) {
            return "Параметры не заданы ";
        } else if (num2 == 0) {
            return "Делить на ноль нельзя";
        } else {
            return num1 + " / " + num2 + " = " +(num1 / num2);
        }
    }

    public boolean nullChecking(Integer num1, Integer num2) {
        boolean nullChecking;
        nullChecking = num1 == null || num2 == null;
        return nullChecking;
    }
}
