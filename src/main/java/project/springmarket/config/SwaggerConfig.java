package project.springmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    // swagger는 API를 시각화 해주는 프레임워크임
    // Application을 실행하고 http://localhost:8080/swagger-ui.html 로 접근하면 swaager에서 제공하는 UI로 API를 보고 테스트 할 수 있음
    // 대단한 기술은 아니고, Contoller 어노테이션이 붙은 컴퍼넌트를 다 찾아서 시각화 해주느거임
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
