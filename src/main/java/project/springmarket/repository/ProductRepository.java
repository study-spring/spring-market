package project.springmarket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.springmarket.model.product.ProductVO;
import project.springmarket.mapper.ProductMapper;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final ProductMapper productMapper;

    public List<ProductVO> findProducts(int addressNo) {
        return productMapper.findProducts(addressNo);
    }

    public List<ProductVO> findProductsUsingPosition(double lat, double lng) {
        return productMapper.findProductsUsingPosition(lat,lng);
    }

}
