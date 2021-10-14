package project.springmarket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.springmarket.model.product.request.FindProductRequestDTO;
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

    public List<ProductVO> findProductsUsingPosition(FindProductRequestDTO findProductRequestDTO) {
        return productMapper.findProductsUsingPosition(findProductRequestDTO);
    }

    public boolean registerProduct(ProductVO productVO) {
        return productMapper.registerProduct(productVO) > 0; // 1개이상의 상품이 등록되었는가
    }
}
