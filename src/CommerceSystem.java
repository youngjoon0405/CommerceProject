import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner =  new Scanner(System.in);
    private List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    public void start() {
        int number = 1; // 정렬 번호 표시 용도
        System.out.printf("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        for (Category category : categories) {
            for (Product product : category.getProducts()) {
                System.out.printf("%d. %s | %,d원 | %s%n",
                        number,
                        product.getProductName(),
                        product.getPrice(),
                        product.getDescription(),
                        product.getStockQuantity());
                number++;
            }
            System.out.printf("%d. %s | %s%n", 0, "종료", "프로그램 종료");

            int end = scanner.nextInt(); // 종료 숫자 입력
            if (end == 0) System.out.println("커머스 플랫폼을 종료합니다.");
        }
    }
}