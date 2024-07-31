package pro.sky.Spring_2_11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Spring_2_11.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("id") List<Integer> id) {
        return basketService.add(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return basketService.get();
    }
}
