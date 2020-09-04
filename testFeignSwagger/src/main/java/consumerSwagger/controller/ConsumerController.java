package consumerSwagger.controller;

import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import provider.service.CalculateService;

@ApiModel(description = "计算器")
@RestController
public class ConsumerController{
    @Autowired
    CalculateService calculateService;

    @RequestMapping("/test")
    public String test(@RequestBody RequestP p) {
        Integer result = calculateService.add(p.getA(), p.getB());
        String res = "the result is " + result;
        return res;
    }

}
