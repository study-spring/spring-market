package project.springmarket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.springmarket.model.product.Product;
import project.springmarket.mybatis.ProductMapper;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final ProductMapper productMapper;

    public List<Product> findProducts(int addressNo){
        return productMapper.findProducts(addressNo);
    }

}
