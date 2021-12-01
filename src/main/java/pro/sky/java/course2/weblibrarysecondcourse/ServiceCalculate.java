package pro.sky.java.course2.weblibrarysecondcourse;

import org.springframework.stereotype.Service;

@Service

public class ServiceCalculate {
    public String answerGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int num1, int num2) {
        int totalSum;
        totalSum = num1 + num2;
        return num1 + " + " + num2 + " = " + totalSum;
    }

    public String negative(int num1, int num2) {
        int totalSum;
        totalSum = num1 - num2;
        return num1 + " - " + num2 + " = " + totalSum;
    }

    public String multiply(int num1, int num2) {
        int totalSum;
        totalSum = num1 * num2;
        return num1 + " * " + num2 + " = " + totalSum;
    }

    public String divide(double num1, double num2) {
        double totalSum;
        if (num1 == 0 || num2 == 0) {
            return "Делить на ноль нельзя!";
        } else {
            totalSum = num1 / num2;
            return num1 + " / " + num2 + " = " + totalSum;
        }
    }
}
