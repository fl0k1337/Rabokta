import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите доход за месяц (SEK): ");
        int income = scanner.nextInt();
        int afterTaxIncome;
        if (income <= 18800) {
            afterTaxIncome = income - income * 11 / 100;
        } else if (income <= 468700) {
            afterTaxIncome = income - income * 20 / 100;
        } else if (income <= 675700) {
            afterTaxIncome = income - income * 32 / 100;
        } else {
            afterTaxIncome = income - income * 40 / 100;
        }
        System.out.println("Доход с учетом налога: " + afterTaxIncome + " SEK");
    }
}
