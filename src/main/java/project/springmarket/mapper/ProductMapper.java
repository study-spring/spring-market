package project.springmarket.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import project.springmarket.model.product.FindProductDTO;
import project.springmarket.model.product.ProductVO;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductVO> findProducts(int addressNo);

    List<ProductVO> findProductsUsingPosition(FindProductDTO findProductDTO);


}
