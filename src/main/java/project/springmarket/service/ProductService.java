package project.springmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.springmarket.model.product.request.FindProductDTO;
import project.springmarket.model.product.request.ProductRegisterRequestDTO;
import project.springmarket.model.product.response.FindProductResponseDTO;
import project.springmarket.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public FindProductResponseDTO findProducts(int addressNo) {
        return productRepository.findProducts(addressNo);
    }

    public FindProductResponseDTO findProductsUsingPosition(FindProductDTO findProductDTO) {
        return productRepository.findProductsUsingPosition(findProductDTO);
    }

    public boolean registerProduct(ProductRegisterRequestDTO productRegisterRequestDTO) {
        return productRepository.registerProduct(productRegisterRequestDTO);
    }
}
