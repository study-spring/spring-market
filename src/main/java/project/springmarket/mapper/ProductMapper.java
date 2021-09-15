package project.springmarket.mybatis;

import org.apache.ibatis.annotations.Mapper;
import project.springmarket.model.product.ProductVO;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductVO> findProducts(int addressNo);
}
