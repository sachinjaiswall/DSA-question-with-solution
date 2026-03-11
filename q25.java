import java.util.*;
public class q25 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] arr = new int[result.size()];
        int i = 0;

        for (int num : result) {
            arr[i++] = num;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] res = intersection(nums1, nums2);

        for(int num : res){
            System.out.print(num + " ");
        }
    }
}
    
