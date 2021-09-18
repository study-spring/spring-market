package project.springmarket.model.product.response;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import project.springmarket.model.product.ProductVO;

import java.util.List;

@Getter
@Builder
@ToString
public class FindProductResponse {
    private List<ProductVO> products;
}
