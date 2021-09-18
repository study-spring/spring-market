package project.springmarket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.springmarket.model.product.request.FindProductDTO;
import project.springmarket.model.product.request.ProductRegisterRequestDTO;
import project.springmarket.model.product.ProductVO;
import project.springmarket.mapper.ProductMapper;
import project.springmarket.model.product.response.FindProductResponseDTO;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final ProductMapper productMapper;

    public FindProductResponseDTO findProducts(int addressNo) {
        List<ProductVO> products = productMapper.findProducts(addressNo);
        return FindProductResponseDTO
                .builder()
                .products(products)
                .build();
    }

    public FindProductResponseDTO findProductsUsingPosition(FindProductDTO findProductDTO) {
        List<ProductVO> products = productMapper.findProductsUsingPosition(findProductDTO);

        return FindProductResponseDTO
                .builder()
                .products(products)
                .build();
    }

    public boolean registerProduct(ProductRegisterRequestDTO productRegisterRequestDTO) {
        return productMapper.registerProduct(productRegisterRequestDTO) > 0; // 1개이상의 상품이 등록되었는가
    }
}
