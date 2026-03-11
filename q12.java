public class q12 {
public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } 
            else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("Second Smallest: -1");
        else
            System.out.println("Second Smallest: " + secondSmallest);

        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("Second Largest: -1");
        else
            System.out.println("Second Largest: " + secondLargest);
    }
}
    

