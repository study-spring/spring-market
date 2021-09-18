package project.springmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import project.springmarket.model.product.request.ProductRegisterRequestDTO;
import project.springmarket.model.product.request.FindProductDTO;
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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> handleMethodArgumentNotValidException(BindingResult bindingResult) {
        Map<String, Object> map = new HashMap<>();
        if (bindingResult.hasErrors()) {
            List<FieldError> errors = bindingResult.getFieldErrors();

            errors.forEach(err -> {
                map.put(err.getField(),
                        err.getDefaultMessage() + " >> input value : " + err.getRejectedValue());
            });
        }
        return map;
    }

    @GetMapping("/address/{addressNo}")
    public FindProductResponseDTO findProducts(@PathVariable("addressNo") int addressNo) {
        return productService.findProducts(addressNo);
    }

    @PostMapping("/address/")
    public FindProductResponseDTO findProductsUsingPosition(@RequestBody @Valid FindProductDTO findProductDTO) {
        return productService.findProductsUsingPosition(findProductDTO);
    }

    @PostMapping("/register")
    public boolean registerProduct(@RequestBody @Valid ProductRegisterRequestDTO productRegisterRequestDTO) {
        return productService.registerProduct(productRegisterRequestDTO);
    }
}
