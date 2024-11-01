import java.util.Scanner;

public class zadasha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Оцените наше приложение от 1 до 5:");
        int rating = sc.nextInt();
        if (rating == 1){
            System.out.println("Очень плохо");
        } else if (rating == 2) {
            System.out.println("Плохо");
        } else if (rating == 3) {
            System.out.println("Нормально");
        } else if (rating == 4) {
            System.out.println("Хорошо");
        } else if (rating == 5) {
            System.out.println("Отлично");
        } else {
            System.out.println("Error");
        }
    }
}