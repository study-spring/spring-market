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
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products/address/{addressNo}")
    public FindProductResponseDTO findProducts(@PathVariable("addressNo") int addressNo) {
        return new FindProductResponseDTO(productService.findProducts(addressNo));
    }

    @PostMapping("/products/address")
    public FindProductResponseDTO findProductsUsingPosition(@RequestBody @Valid FindProductRequestDTO findProductRequestDTO) {
        return new FindProductResponseDTO(productService.findProductsUsingPosition(findProductRequestDTO));
    }

    @PostMapping("/products")
    public boolean registerProduct(@RequestBody ProductVO productVO) {
        return productService.registerProduct(productVO);
    }
}
