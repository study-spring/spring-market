package project.springmarket.mybatis;

import org.apache.ibatis.annotations.Mapper;
import project.springmarket.model.product.Product;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findProducts(int addressNo);
}
