package project.springmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.springmarket.model.product.ProductVO;
import project.springmarket.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/address/{addressNo}")
    public List<ProductVO> findProducts(@PathVariable("addressNo") int addressNo) {
        return productService.findProducts(addressNo);
    }

    @GetMapping("/address/{lat}/{lng}")
    public List<ProductVO> findProductsUsingPosition(@PathVariable("lat") double lat,
                                                     @PathVariable("lng") double lng) {
        return productService.findProductsUsingPosition(lat, lng);
    }
}
