package project.springmarket.model.product.request;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ProductRegisterRequestDTO {
    @NotNull
    private int sellerNo;
    @NotNull
    @NotEmpty
    private String productName;
    private String description;
    private String productImages;
    private int categoryNo;
    @NotNull
    private int addressNo;
}
