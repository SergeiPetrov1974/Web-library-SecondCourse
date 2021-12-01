package pro.sky.java.course2.weblibrarysecondcourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculate {
    private final ServiceCalculate serviceCalculate;


    public ControllerCalculate(ServiceCalculate serviceCalculate) {
        this.serviceCalculate = serviceCalculate;
    }

    @GetMapping(path = "")
    public String answerGreeting() {
        return serviceCalculate.answerGreeting();
    }

    @GetMapping(path = "plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculate.plus(num1, num2);
    }

    @GetMapping(path = "negative")
    public String negative(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculate.negative(num1, num2);
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculate.multiply(num1, num2);
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return serviceCalculate.divide(num1, num2);
    }
}
