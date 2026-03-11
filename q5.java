import java.util.Scanner;
public class q5 {
    static int calculateTyres(int cars, int bikes) {
        return (cars * 4) + (bikes * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of dealerships: ");
        int d = sc.nextInt();

        for (int i = 1; i <= d; i++) {
            System.out.print("Enter number of cars in dealership " + i + ": ");
            int cars = sc.nextInt();

            System.out.print("Enter number of bikes in dealership " + i + ": ");
            int bikes = sc.nextInt();

            int tyres = calculateTyres(cars, bikes);

            System.out.println("Total tyres in dealership " + i + " = " + tyres);
        }

        sc.close();
    }
}


