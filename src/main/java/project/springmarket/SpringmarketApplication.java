package project.springmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "project.springmarket")
@MapperScan(basePackages = "project.springmarket")
public class SpringmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmarketApplication.class, args);
    }

}
