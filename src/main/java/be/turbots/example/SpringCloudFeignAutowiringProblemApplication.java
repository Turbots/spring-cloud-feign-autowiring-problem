package be.turbots.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringCloudFeignAutowiringProblemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignAutowiringProblemApplication.class, args);
    }
}
