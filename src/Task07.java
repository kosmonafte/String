import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        TasksObject task07 = new TasksObject();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(task07.happy(str));
        System.out.println(task07.happyTwo(str));
    }
}
