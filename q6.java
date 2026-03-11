import java.util.*;
public class q6 {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        int[] discount = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name, price, discount%: ");
            String input = sc.nextLine();

            String[] data = input.split(",");
            name[i] = data[0];
            discount[i] = Integer.parseInt(data[2]);
        }

        int min = discount[0];
        for (int i = 1; i < n; i++) {
            if (discount[i] < min) {
                min = discount[i];
            }
        }

        System.out.println("Item(s) with minimum discount:");
        for (int i = 0; i < n; i++) {
            if (discount[i] == min) {
                System.out.println(name[i]);
            }
        }
    }
}
    

