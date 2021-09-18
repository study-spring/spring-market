package project.springmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.springmarket.model.product.request.FindProductDTO;
import project.springmarket.model.product.ProductRegisterRequestDTO;
import project.springmarket.model.product.ProductVO;
import project.springmarket.model.product.response.FindProductResponse;
import project.springmarket.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public FindProductResponse findProducts(int addressNo) {
        return productRepository.findProducts(addressNo);
    }

    public FindProductResponse findProductsUsingPosition(FindProductDTO findProductDTO) {
        return productRepository.findProductsUsingPosition(findProductDTO);
    }

    public boolean registerProduct(ProductRegisterRequestDTO productRegisterRequestDTO) {
        return productRepository.registerProduct(productRegisterRequestDTO);
    }
}
