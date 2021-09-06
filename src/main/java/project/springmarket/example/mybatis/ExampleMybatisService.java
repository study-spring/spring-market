package project.springmarket.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExampleMybatisService {
    private final ExampleMybatis exampleMybatis;

    public List<String> find() {
        return exampleMybatis.find();
    }
}
