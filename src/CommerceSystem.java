import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    private List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    public void start() { // 실시간 커머스 플렛폼 메인 화면
        System.out.println("[ 실시간 커머스 플렛폼 메인]");
        int number = 1; // 카테고리 정렬을 위한 번호
        for (Category category : categories) {
            System.out.println(number + ". " + category.getCategoryName());
            number++;
        }
        System.out.printf("%d. %s | %s%n", 0, "종료", "프로그램 종료");

        int selectNumber = scanner.nextInt(); // 사용자가 선택한 번호
        if (selectNumber == 0) {
            System.out.println("프로그램을 종료합니다.");
            return; // 마지막 줄이기 때문에 생략 가능
        }
        showProducts(selectNumber);
    }

    public void showProducts(int selectNumber) {// 사용자가 해당 카테고리 번호 선택 후 제품 화면
        int categoryNumber = 1; // 카테고리 번호
        int number = 1; // 상품 정렬을 위한 번호

        for (Category category : categories) {

            if (selectNumber == categoryNumber) {

                System.out.println("[ " +  category.getCategoryName() + "카테고리"+ "]" );

                // 상품 목록 출력
                for (Product product : category.getProducts()) {
                    System.out.printf("%d. %s | %,d원 | %s%n",
                            number,
                            product.getProductName(),
                            product.getPrice(),
                            product.getDescription(),
                            product.getStockQuantity());
                    number++;
                }
                System.out.println("0. 뒤로가기");
                int finalSelectNumber = scanner.nextInt();
                if(finalSelectNumber == 0) {
                    start();
                }
                // 선택한 상품 찾기
                Product product = category.getProducts().get(finalSelectNumber-1);
                System.out.printf("%d. %s | %,d원 | %s%n",
                        number,
                        product.getProductName(),
                        product.getPrice(),
                        product.getDescription(),
                        product.getStockQuantity());
                        return;
            }
            categoryNumber++;
        }
            }
        }




