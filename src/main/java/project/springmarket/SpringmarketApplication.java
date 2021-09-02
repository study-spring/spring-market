package project.springmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "project.springmarket")
public class SpringmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmarketApplication.class, args);
    }

}
