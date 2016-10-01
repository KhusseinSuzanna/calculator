import java.util.Scanner;

/**
 * Created by Suzanna on 01.10.2016.
 */
public class Calculator {
    int a, b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int Add(int a, int b) {
        return a+b;
    }
    public int Deduct(int a, int b) {
        return a-b;
    }
    public int Multiply(int a, int b) {
        return a*b;
    }
    public float Divide(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calculator calc = new Calculator(a, b);
        System.out.println("Enter: 1 to add, 2 to deduct, 3 to multiply, 4 to divide");
        int n = scanner.nextInt();
        switch (n) {
            case 1: System.out.println(a+"+"+b+"="+calc.Add(a, b));
                break;
            case 2: System.out.println(a+"-"+b+"="+calc.Deduct(a, b));
                break;
            case 3: System.out.println(a+"*"+b+"="+calc.Multiply(a, b));
                break;
            case 4: System.out.println(a+"/"+b+"="+calc.Divide(a, b));
                break;
            default: System.out.println("Wrong");
        }

    }
}
