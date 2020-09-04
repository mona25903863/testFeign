package provider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import provider.service.CalculateService;

@RestController
@RequestMapping("/api")
public class CalculateController implements CalculateService {
    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a-b;
    }
    /*@PostMapping("/add")
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        return a+b;
    }

    @PostMapping("/subtract")
    public Integer subtract(@RequestParam Integer a, @RequestParam Integer b){
        return a-b;
    }
*/}
