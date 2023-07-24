import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        TasksObject obj = new TasksObject();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        int max = obj.maxInt(input);
        System.out.println(max);
    }
}
