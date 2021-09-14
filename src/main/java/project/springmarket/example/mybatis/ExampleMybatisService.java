package project.springmarket.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExampleMybatisService {
    private final ExampleMybatisRepository exampleMybatisRepository;

    public List<String> find(){
        return exampleMybatisRepository.find();
    }
}
