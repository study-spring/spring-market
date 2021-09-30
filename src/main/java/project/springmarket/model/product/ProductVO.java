package project.springmarket.model.product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ProductVO {
    private int productNo;
    private int sellerNo;
    private int buyerNo;

    @NotNull
    @NotEmpty(message = "product's name must not empty")
    private String productName;

    @NotNull
    @NotEmpty(message = "description must not empty")
    private String description;

    private ProductStatus productStatus ;
    private String ProductImages;
    private int category;
    private int addressNo;
}
