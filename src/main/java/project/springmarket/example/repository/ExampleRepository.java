package project.springmarket.example.repository;

import org.springframework.stereotype.Repository;

import project.springmarket.example.model.ExampleVO;

@Repository
public class ExampleRepository {

    // Repository layer는 Persistence layer로 데이터 처리를 담당하는 계층
    // 주로 데이터의 생성/수정/삭제/선택(검색)과 같은 CRUD 연산을 수행하는 계층
    // Mybatis를 사용할 경우 Repository가 mapper를 call해서 sql을 db로 보냄
    // JPA를 사용할 경우, JPARepository를 상속받아서 직접 mapper를 작성하지 않아도 사용가능
    // 참고 하면 좋은 자료 : https://gmlwjd9405.github.io/2018/12/25/difference-jdbc-jpa-mybatis.html

    public ExampleVO find(long id) {
        return id == 1 ? new ExampleVO(id, "lewongi") : new ExampleVO(id, null);
    }

}
