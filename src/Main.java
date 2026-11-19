import java.util.ArrayList;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        List<Product> electronicsProducts = new ArrayList<>(); // 전자제품 리스트
        List<Product> clothingProducts = new ArrayList<>();  // 의류 리스트
        List<Product> foodProducts = new ArrayList<>(); // 식품 리스트
        List<Category> categories = new ArrayList<>(); // 카테고리 리스트

        electronicsProducts.add(new Product(
                " Galaxy S25 ",1200000, "최신 안드로이드 스마트폰",1));
        electronicsProducts.add(new Product(
                "iPhone 16", 1350000, "Apple의 최신 스마트폰", 5));
        electronicsProducts.add(new Product(
                "MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 3));
        electronicsProducts.add(new Product(
                "AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20));
        clothingProducts.add(new Product(
                "반팔 티셔츠", 25000, "면 소재 반팔", 10));
        clothingProducts.add(new Product(
                "청바지", 49000, "데님 팬츠", 5));


        Category category1 = new Category("전자제품", electronicsProducts);
        categories.add(category1);
        Category category2 = new Category("의류",clothingProducts);
        categories.add(category2);

        CommerceSystem system = new CommerceSystem(categories);
        system.start();
    }
}