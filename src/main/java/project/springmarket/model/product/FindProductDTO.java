package project.springmarket.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@AllArgsConstructor
@Getter
public class FindProductDTO {
    @Range(min = 32, max = 39, message = "lat value must between 32 and 39")
    private double lat;

    @Range(min = 124, max = 132, message = "lng value must between 124 and 132")
    private double lng;

    @Range(min = 0, max = 10, message = "distance must between 0 and 10")
    private double distance;
}
