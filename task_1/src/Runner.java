import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Полстяной Игорь");
        String name = scanner.nextLine();
        Task_1 task = new Task_1();
        Task_1_Tests.test(task, name);
    }
}
