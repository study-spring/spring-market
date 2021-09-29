package project.springmarket.mapper;

import org.apache.ibatis.annotations.Mapper;
import project.springmarket.model.product.request.FindProductRequestDTO;
import project.springmarket.model.product.request.ProductRegisterRequestDTO;
import project.springmarket.model.product.ProductVO;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductVO> findProducts(int addressNo); // 상품조회(사용자 주소기반)

    List<ProductVO> findProductsUsingPosition(FindProductRequestDTO findProductRequestDTO); // 상품조회(사용자 위치기반)

    int registerProduct(ProductRegisterRequestDTO productRegisterRequestDTO); // 상품등록
}
