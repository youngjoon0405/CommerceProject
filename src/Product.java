public class Product {

   private String productName; // 상품명
   private int price; // 가격
   private String description; // 설명
    private int stockQuantity; // 재고수량

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
