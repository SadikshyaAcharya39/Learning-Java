public class StringComparison {
    public static void main(String[] args) {

        // Case: 1

       /* String s1 = "Sadikshya";
        String s2 = "Sadikshya";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        */

        // Case: 2

        /*
        String s1 = new String("Sadikshya");
        String s2 = "Sadikshya";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        */

        // Case: 3

        String s1 = new String("Sadikshya");
        String s2 = new String("Sadikshya");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
