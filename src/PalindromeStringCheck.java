public class PalindromeStringCheck {
    public static void main(String[] args) {

//        String text = "madam";
//        String originalText = text;
//
//        String reverse = "";
//        for(int i = text.length() - 1; i >= 0; i--){
//            reverse = reverse + text.charAt(i);
//        }
//
//        if(originalText.equals(reverse)){
//            System.out.println(text + " is a palindrome string");
//
//        }
//        else {
//            System.out.println(text + " is not a palindrome string.");
//        }

        String text = "Welcome";
        String originalText = text;
        String reverse = "";

        for(int i = text.length() - 1; i >= 0; i--){
            reverse += text.charAt(i);
        }

        if(originalText.equals(reverse)){
            System.out.println(originalText + " is a Palindrome String.");
        }
        else
        {
            System.out.println(originalText + " is not a Palindrome String.");
        }












    }
}
