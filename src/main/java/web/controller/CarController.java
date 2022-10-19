package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

/**
 * @author Guliamov Rustam
 */
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/cars")
    public String getCars(@RequestParam int count, ModelMap model) {
        model.put("messages", carService.getCars(count));
        return "cars";
    }
}
