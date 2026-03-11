import java.util.Scanner;
public class q27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid Month Entered");
        }
        else if (month >= 3 && month <= 5) {
            System.out.println("Spring Season");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("Summer Season");
        }
        else if (month >= 9 && month <= 11) {
            System.out.println("Autumn Season");
        }
        else {
            System.out.println("Winter Season");
        }

      
    }
}
    

