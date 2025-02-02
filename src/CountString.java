public class CountString {
    public static void main(String[] args) {
        String name = "Sadikshya";
        int count = 0;

        for(int i = 0; i <= name.length() - 1; i++){
            count++;
        }
        System.out.println("The number of characters present in string are: " + count);
    }
}
