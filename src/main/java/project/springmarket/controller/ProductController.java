package project.springmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.springmarket.model.product.Product;
import project.springmarket.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/address/{addressNo}")
    public List<Product> findProducts(@PathVariable("addressNo") int addressNo) {
        return productService.findProducts(addressNo);
    }
}
