import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Кофемашина");

        System.out.println("Введите количетсво денег:");
        int moneyAmount = new Scanner(System.in).nextInt();

        ArrayList<Product> products = new ArrayList<>();


        products.add(new Product(200, "Каппучино"));
        products.add(new Product(100, "Эспрессо"));
        products.add(new Product(50, "Вода"));

        checkPrices(moneyAmount, products);

    }
     public static void checkPrices (int moneyAmount, ArrayList < Product > products) {

        for (Product product : products) {
            if (moneyAmount >= product.getPrice()) {
                System.out.println("Вы можете купить " + product.getName());

        }



    }

}
}
