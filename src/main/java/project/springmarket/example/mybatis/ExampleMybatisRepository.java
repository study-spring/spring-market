package project.springmarket.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ExampleMybatisRepository {
    private final ExampleMapper exampleMapper;

    public List<String> find() {
        return exampleMapper.find();
    }
}
