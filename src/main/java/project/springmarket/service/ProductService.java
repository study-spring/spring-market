package project.springmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.springmarket.model.product.ProductVO;
import project.springmarket.model.product.request.FindProductRequestDTO;
import project.springmarket.model.product.request.ProductRegisterRequestDTO;
import project.springmarket.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductVO> findProducts(int addressNo) {
        return productRepository.findProducts(addressNo);
    }

    public List<ProductVO> findProductsUsingPosition(FindProductRequestDTO findProductRequestDTO) {
        return productRepository.findProductsUsingPosition(findProductRequestDTO);
    }

    public boolean registerProduct(ProductRegisterRequestDTO productRegisterRequestDTO) {
        return productRepository.registerProduct(productRegisterRequestDTO);
    }
}
