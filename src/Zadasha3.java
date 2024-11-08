import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] movies = new String[30];
        int count = 0;

        System.out.println("Введите названия фильмов. Для завершения введите 'выход'.");
        for (int i = 0; i < movies.length; i++) {
            System.out.print("Введите название фильма: ");
            String movie = scanner.nextLine();

            if (movie.equals("выход")) {
                break;
            }
            movies[i] = movie;
            count++;
        }
        System.out.println("Ваш список фильмов:");
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i]);
        }
    }
}
