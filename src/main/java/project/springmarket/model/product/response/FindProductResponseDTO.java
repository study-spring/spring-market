package project.springmarket.model.product.response;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import project.springmarket.model.product.ProductVO;

import java.util.List;

@Getter
@ToString
public class FindProductResponseDTO {
    private List<ProductVO> products;

    public FindProductResponseDTO(List<ProductVO> products) {
        this.products = products;
    }
}
