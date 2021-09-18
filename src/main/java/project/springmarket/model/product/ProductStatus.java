package project.springmarket.model.product;

public enum ProductStatus {
    판매, 예약, 판매완료;

    ProductStatus getProductStatus() {
        return ProductStatus.판매;
    }
}
