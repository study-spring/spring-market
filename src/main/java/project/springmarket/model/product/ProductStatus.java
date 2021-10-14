package project.springmarket.model.product;

public enum ProductStatus {
    SELL, RESERVED, SOLD_OUT;

    ProductStatus getProductStatus() {
        return ProductStatus.SELL;
    }
}
