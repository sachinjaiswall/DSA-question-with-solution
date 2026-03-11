import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int n;
        System.out.println("Enter the numbers of semester ");
        n = sc.nextInt();
        int max = -1;
        boolean invalid = false;
        for (int i= 1; i<=n; i++){
            System.out.println("En4ter the marks of semester " + i+":");
            int mark = sc.nextInt();
            if (mark <0 || mark > 100){
                invalid = true;
                break;

            }if(mark>max){
                max = mark;
            }
            
        }
        if(invalid){
            System.out.println("you have entered invalid marks ");
        }
        else{
            System.out.println("Maximum marks scored  " + max );
        }
        sc.close();
    }

    
}
