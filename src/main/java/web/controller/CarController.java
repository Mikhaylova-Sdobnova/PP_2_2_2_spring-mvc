package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import web.Model.Car;
import web.Service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = CarService.defaultCarList();
        if(count == null || count >= 5) {
            model.addAttribute("cars", carList);
        } else {
            model.addAttribute("cars", carList.stream().limit(count).toList());
        }
        return "cars";
    }
}
