public class Product {

    String productName; // 상품명
    int price; // 가격
    String description; // 설명
    int stockQuantity; // 재고수량

   public Product(String productName, int price, String description, int stockQuantity ) {
        this.productName = productName;
        this.price = price;
        this.stockQuantity= stockQuantity;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }
    public int getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public String getDescription() {
        return description;
    }
}
