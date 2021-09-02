package project.springmarket.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import project.springmarket.example.exception.NotFoundException;
import project.springmarket.example.model.ExampleVO;
import project.springmarket.example.service.ExampleService;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @Autowired
    ExampleService exampleService;

    // controller layer는 사용자로부터 요청을 받고 응답을 처리하는 계층
    // 하위 계층에서 발생하는 Exception이나 Error에 대한 처리를 수행

    @GetMapping("/")
    public ExampleVO find(){
        return exampleService.find(1);
    }

    @GetMapping("/error")
    public ExampleVO errorTest(){
        return exampleService.find(2);
    }

    // 해당 Controller에서 발생하는 Exception 처리
    // 이렇게 Controller마다 정의할 수도 있고 ControllerAdvice를 정의해서 할 수 있음(ControllerAdvice가 한번에 관리하기 편해서 추천)
    // 침고 : https://www.baeldung.com/exception-handling-for-rest-with-spring
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public void handleException() {

    }
}
