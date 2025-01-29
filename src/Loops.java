import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.desktop.PreferencesEvent;

public class Loops {
    public static void main(String[] args) {
        // While Loop
//        int i = 1;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }

        // Do-While Loop
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i <= 10);

//        for(int num = 0; num <= 10; num+=2){
//            System.out.println(num);
//        }

//        int sum = 0;
//
//        for(int i = 1; i <= 5;i++) {
//            sum += i;
//
//            System.out.println("Sum of first 5 natural numbers" + sum);
//        }

//        int sum = 0;
//        int i = 1;
//        while(i <= 5){
//            sum += i;
//            System.out.println(sum);
//            i++;
//        }

//        do{
//            sum += i;
//            System.out.println(sum);
//            i++;
//        }while (i<=5);

        // Factorial
//        int n = 5;
//        int factorial = 1;
//
//        for(int i= 1; i<=n; i++){
//            factorial *= i;
//            System.out.println(factorial);
//        }

//        int i = 1;
//        while(i <= n){
//            factorial  *= i;
//            System.out.println(factorial);
//            i++;
//        }

//        int num = 5;
//        for(int i = 1; i <= 10; i++){
//            System.out.println(num + " * " + i + " = " + (num*i));
//        }

        // Count the number of digits

//        int num = 123456;
//        int count = 0;
////
//        for(; num != 0; num/=10 ){
//            count++;
//        }
//        System.out.println(count);

//        while(num!=0){
//            num /= 10;
//            count++;
//        }
//        System.out.println(count);

//        int num = 234567891;
//        int count = 0;
//        for(; num != 0; num /= 10){
//            count++;
//        }
//        System.out.println(count);


        // Reverse a number
//        int num = 223456778;

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        System.out.println(sb.reverse());

//        StringBuilder sb1 = new StringBuilder(String.valueOf(num));
//        System.out.println(sb1.reverse());

//        char[] arr = name.toCharArray();
//        for(int i = arr.length -1; i>=0; i--){
//            System.out.print(arr[i]);
//        }

//        String reverse = " ";
//
//        for(int i = 0; i < name.length(); i++){
//            reverse = name.charAt(i) + reverse;
//        }
//        System.out.println(reverse);

//        String name = "Sadikshya";
//        char arr[] = name.toCharArray();
//        for(int i = arr.length - 1; i >=0; i--){
//            System.out.print(arr[i]);
//        }

        // Palindrome
//        String name = "Acharya";
//        String rev = " ";
////        System.out.println(name.length());
//        char arr[] = name.toCharArray();
//        for(int i = arr.length - 1; i >= 0; i--) {
//            rev += arr[i];
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//            if (name.equals(rev)) {
//                System.out.println(name + " is a Palindrome!");
//            }
//            else {
//                System.out.println(name + " is not a Palindrome!");
//
//        }

//        String countryName = "Nepal";
//        char arr[] = countryName.toCharArray();
//        String reverse= "";
//        for(int i = countryName.length() - 1; i >= 0; i--){
//            reverse +=  arr[i];
//        }
//
//        System.out.println(reverse);
//        if (countryName == reverse) {
//            System.out.println(countryName + " is palindrome");
//        }
//        else{
//            System.out.println(countryName + " is not palindrome");
//        }

        // Reverse
//        int num = 1231;
//        int reverse = 0;
//        while(num!=0){
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num /=10;
//        }
//        System.out.println(reverse);
//
//        for(; num!=0; num/=10){
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//        }
//        System.out.println(reverse);


        // Reversing the string

//        String name = "Shraddha";
//        char arr[] = name.toCharArray();
//        for(int i = arr.length - 1; i >= 0; i--){
//            System.out.print(arr[i]);
//        }

        // Reversing the number
//        int num = 121;
//        int reverse = 0;
//        for(; num != 0; num /=10){
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//        }
//        System.out.println(reverse + " is palindrome.");


//        int i = 1;
//        for(; i <= 10; i+=2){
//            System.out.println(i);
//        }

//        int sum = 0;
//        for(int i = 1; i <= 5; i++){
//            sum= sum + i;
//        }
//        System.out.println(sum);

//          int factorial = 1;
//          for(int i = 1; i <= 5; i++){
//          factorial = factorial * i;
//          }
//        System.out.println(factorial);

//        int num = 23456681;
//        int count = 0;
//         for(; num!= 0; num/=10){
//             count++;
//        }
//        System.out.println(count);

//        String name = "Sadikshya";
//        char arr[] = name.toCharArray();
//        for(int i = arr.length - 1; i >= 0; i--){
//            System.out.print(arr[i]);
//        }

        // Count number of words
//        String word = "Nepal is a beautiful country";
//        int countWords = word.split("\\s").length;
//        System.out.println(countWords);

//        int arr[] = {1,2,3,4,5};
//        for(int i = 1; i <= arr.length ; i++){
//            System.out.println(i);
//        }

    }
}
