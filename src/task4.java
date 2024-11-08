import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] expenses = new int[7];
        int total = 0;
        int usdRate = 9;
        int eurRate = 8;

        System.out.println("Введите расходы за каждый день недели (в SEK):");
        for (int i = 0; i < 7; i++) {
            System.out.print("День " + (i + 1) + ": ");
            expenses[i] = scanner.nextInt();
            total += expenses[i];
        }
        System.out.println("Общая сумма расходов за неделю: " + total + " SEK");
        System.out.print("Конвертировать сумму в (1 - USD, 2 - EUR): ");
        
        int choice = scanner.nextInt();
        int convertedAmount;
        
        if (choice == 1) {
            convertedAmount = total * usdRate / 100;
            System.out.println("Сумма в долларах: " + convertedAmount + " USD");
        } else if (choice == 2) {
            convertedAmount = total * eurRate / 100;
            System.out.println("Сумма в евро: " + convertedAmount + " EUR");
        } else {
            System.out.println("Неверный выбор.");
        }
    }
}
