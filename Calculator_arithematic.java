import java.util.Scanner;
public class Calculator_arithematic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a= scan.nextInt();
        System.out.println("Enter second number");
        int b= scan.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice");
        int c= scan.nextInt();
        switch (c){
            case 1:
                System.out.println("Addition" + (a+b));
                break;
            case 2:
                System.out.println("Subtraction" + (a-b));
                break;
            case 3:
                System.out.println("Multiplication" + (a*b));
                break;
            case 4:
                System.out.println("Division" + (a/b));
                break;
            default:
                System.out.println("Enter valid number");
        }
    }
}
