package project.springmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import project.springmarket.model.product.ProductVO;
import project.springmarket.model.product.request.ProductRegisterRequestDTO;
import project.springmarket.model.product.request.FindProductRequestDTO;
import project.springmarket.model.product.response.FindProductResponseDTO;
import project.springmarket.service.ProductService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/address/{addressNo}")
    public FindProductResponseDTO findProducts(@PathVariable("addressNo") int addressNo) {
        List<ProductVO> products = productService.findProducts(addressNo);
        return FindProductResponseDTO
                .builder()
                .products(products)
                .build();
    }

    @PostMapping("/address")
    public FindProductResponseDTO findProductsUsingPosition(@RequestBody @Valid FindProductRequestDTO findProductRequestDTO) {
        List<ProductVO> products = productService.findProductsUsingPosition(findProductRequestDTO);
        return FindProductResponseDTO
                .builder()
                .products(products)
                .build();
    }

    @PostMapping("/register")
    public boolean registerProduct(@RequestBody @Valid ProductRegisterRequestDTO productRegisterRequestDTO) {
        return productService.registerProduct(productRegisterRequestDTO);
    }
}
