package project.springmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.springmarket.model.product.ProductVO;
import project.springmarket.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductVO> findProducts(int addressNo) {
        return productRepository.findProducts(addressNo);
    }

    public List<ProductVO> findProductsUsingPosition(double lat, double lng) {
        return productRepository.findProductsUsingPosition(lat,lng);
    }
}
