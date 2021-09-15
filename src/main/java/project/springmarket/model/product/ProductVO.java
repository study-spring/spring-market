package project.springmarket.model.product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ProductVO {
    private int productNo;
    private int sellerNo;
    private int buyerNo;
    private String productName;
    private String description;
    private ProductStatus productStatus;
    private String ProductImages;
    private int category;
    private int addressNo;
}
