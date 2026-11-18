import java.util.ArrayList;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        CommerceSystem system = new CommerceSystem(categories);

        Product product1 = new Product(
                " Galaxy S25 ",1200000,
                "최신 안드로이드 스마트폰",1);
        Product product2= new Product(
                "iPhone 16", 1350000,
                "Apple의 최신 스마트폰", 5);
        Product product3 = new Product(
                "MacBook Pro", 2400000,
                "M3 칩셋이 탑재된 노트북", 3);
        Product product4= new Product(
                "AirPods Pro", 350000,
                "노이즈 캔슬링 무선 이어폰", 20);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Category category1 = new Category("전자제품", products);
        categories.add(category1);



        system.start();
    }
}