import java.util.Scanner;
public class q4 {
    static int calculate(int a, int b, int c) {
        int result = a*a*a + 3*a*a*b + 3*a*b*b + b*b*b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        System.out.print("Enter value of c: ");
        c = sc.nextInt();   

        int result = calculate(a, b, c);

        System.out.println("Result = " + result);
    }
}
    
