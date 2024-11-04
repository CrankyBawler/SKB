import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Кофемашина");

        System.out.println("Введите количетсво денег:");
        int moneuAmount = new Scanner(System.in).nextInt();

        int cappuccinoPrice = 200;
        int espressoPrice = 100;
        int waterPrice = 50;

        if (moneuAmount >= cappuccinoPrice) {
            System.out.println("Вы можете купить куппучино");

        }
        if (moneuAmount >= espressoPrice) {
            System.out.println("Вы можете купить еспрессо");

        }
        if (moneuAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");

        }


    }

}
