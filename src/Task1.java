import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Task 1.1");
        System.out.println("Enter x: ");
        float x = console.nextFloat();
        System.out.println("Enter y: ");
        float y = console.nextFloat();

        double result = ((1/x*y)+(1/(x*x)+(y*y))*(x-y));
        System.out.println("Result of calculation 1: " + result);

        System.out.println("Task 1.2");
        System.out.println("Enter x: ");
        int x1 = console.nextInt();
        System.out.println("Enter y: ");
        int y1 = console.nextInt();
        double resultDouble = ((1/x1*y1)+(1/(x1*x1)+(y1*y1))*(x1-y1));
        System.out.println("Result of calculation 2: " + resultDouble);

        System.out.println("Task 1.3");
        System.out.println("Enter x: ");
        float x2 = console.nextFloat();
        System.out.println("Enter y: ");
        float y2 = console.nextFloat();
        double resultInt = ((1/x2*y2)+(1/(x2*x2)+(y2*y2))*(x2-y2));
        System.out.println("Result of calculation 3: " + resultInt);
    }
}