import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter your sex: ");
        String sex = scanner.nextLine();

        System.out.println("your name is : " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your sex is:" + sex);
        scanner.close();

    }
}
