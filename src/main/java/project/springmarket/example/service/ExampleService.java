package project.springmarket.example.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.springmarket.example.exception.NotFoundException;
import project.springmarket.example.model.ExampleVO;
import project.springmarket.example.repository.ExampleRepository;

@Service
public class ExampleService {
    @Autowired
    ExampleRepository exampleRepository;

    // Service는 Business layer로 Control layer와 Persistence layer를 연결하는 역할
    // 보통 Transaction 처리를 담당하거나, 이름 그대로 서비스(비즈니스)로직을 처리

    public ExampleVO find(long id){
        ExampleVO exampleVO = exampleRepository.find(id);

        if(exampleVO == null || StringUtils.isEmpty(exampleVO.getName())){
            throw new NotFoundException();
        }

        return exampleVO;
    }
}
