import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 4, 2, 6, 7, 9, 8};
        Arrays.sort(num);
//        System.out.println(num);     -- Error
        System.out.println(Arrays.toString(num));
    }
}
