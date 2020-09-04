package consumerSwagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients(basePackages = {"provider"})
@SpringBootApplication
public class ConsumerApp {
    public static void main(String []args){
        SpringApplication.run(ConsumerApp.class,args);
    }
}
