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

        // Reversing a string
//        String country = "USA";
//        char[] array = country.toCharArray();
//        for(int i = array.length - 1; i >= 0; i--){
//            System.out.print(array[i]);
//        }

//        String reverse = "";
//        for(int i = country.length() - 1; i >= 0; i--){
//            reverse = reverse + country.charAt(i) ;
//        }
//        System.out.println(reverse);



//        String name = "Shraddha";
//        String reverse = "";
//        for(int i = name.length() - 1; i >= 0; i--){
//            reverse = reverse + name.charAt(i);
//        }
//        System.out.println(reverse);

        // Reverse the number
//        int num = 23456;
//        int reverse =  0;
//        for(; num!=0; num /= 10){
//            int remainder = num % 10;
//            reverse = reverse * 10 + remainder;
//        }
//        System.out.println(reverse);

//        int num = 12323445;
//        int count = 0;
//        for(; num!=0; num /= 10){
//            count++;
//        }
//        System.out.println(count);

        // Count the number of words

//        String word = "Mount Everest, known locally as Sagarmatha ";
//        int wordCount = 0;
//        for(int i = 0; i <= word.length(); i++){
//            wordCount = word.split("\\s").length;
//        }
//        System.out.println(wordCount);

        // Count digits in a number
//        int num = 123123;
//        int count = 0;
//        for(; num!= 0; num/=10){
//            count++;
//        }
//        System.out.println(count);

        // Reverse a number

//        int num = 123;
//        int digit = 0;
//        for(; num!=0; num /= 10){
//            int remainder = num % 10;
//            digit = digit * 10 + remainder;
//        }
//        System.out.println(digit);

        // CCheck for palindrome

//        int originalNum = 1221;
//        int num = originalNum;
//        int digit = 0;
//        for(; num!=0; num /= 10){
//            int remainder = num % 10;
//            digit = digit * 10 + remainder;
//        }
//
//        if(originalNum == digit){
//            System.out.println(digit + " is palindrome");
//        }
//        else{
//            System.out.println(digit + " is not a palindrome");
//        }

//        int originalNum = 1221;
//        int num = originalNum;
//        int digit = 0;
//        for(; num!=0; num /= 10){
//            int remainder = num % 10;
//            digit = digit * 10 + remainder;
//        }
//
//        if(originalNum == digit){
//            System.out.println(digit + " is palindrome");
//        }
//        else{
//            System.out.println(digit + " is not palindrome");
//        }

        // Sum of digits

//        int num = 123;
//        int sum = 0;
//        for(; num != 0 ; num /= 10){
//            int remainder = num % 10;
//            sum += remainder;
//        }
//        System.out.println(sum);

//        for(int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Write programs to print the following patterns using loops:
//        Right-angled triangle

//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Write programs to print the following patterns using loops:
//        Inverted Right-angled triangle

//
//        for(int row = 5; row >= 1; row--){
//            for(int column = 1; column <= row; column++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int rows = 5;
//        for(int i = 1; i<= rows; i++){
//
//            for (int j = 1; j <= rows- i; j++) {
//                System.out.print(" ");
//            }
//                for(int k = 1; k <= (2 * i - 1); k++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }


        /* Basic Loop Questions
        Print Numbers from 1 to N: Write a program to print all numbers from 1 to a given number N.

                Print Even Numbers: Print all even numbers between 1 and 100.

        Sum of First N Numbers: Calculate the sum of the first N natural numbers.

                Factorial of a Number: Compute the factorial of a given number N using a loop.

                Multiplication Table: Print the multiplication table of a given number up to 10.

        Count Digits in a Number: Write a program to count the number of digits in a given integer.

                Reverse a Number: Reverse the digits of a given number using a loop.

        Check for Palindrome: Determine if a given number or string is a palindrome (reads the same backward as forward).
        */

//        int num = 100;
//        for(int i = 2; i <= num; i+=2){
//            System.out.println(i);
//        }

//        int num = 5;
//        int sum = 0;
//        for(int i = 1; i <=num; i++){
//            sum += i;
//        }
//        System.out.println(sum);


//        int num = 3;
//        int factorial = 1;
//        for(int i = 1; i <= num; i++){
//            factorial*= i;
//        }
//        System.out.println(factorial);

//        int num = 5;
//        for(int i = 1; i<= 10; i++){
//            System.out.println(num + " * " + i + " = " + num*i);
//        }

//        int num = 123456;
//        int count = 0;
//        for(; num!=0; num/=10){
//            count++;
//        }
//        System.out.println(count);

// Count a char
//        String name = "Sadikshya";
//        int count = 0;
//        for(int i = 0; i < name.length(); i++){
//            count++;
//        }
//        System.out.println(count);

        // Reversing a number

//        int num = 1234;
//        int digit = 0;
//        for(; num!=0; num/=10){
//            int remainder = num % 10;
//            digit = digit * 10 + remainder;
//        }
//        System.out.println(digit);

        // Reversing a string
//        String name = "Sadikshya";
//        char arr[] = name.toCharArray();
//        for(int i = arr.length - 1; i >= 0; i--){
//            System.out.print(arr[i]);
//        }

        // Sum of digits of number
//        int num = 12345;
//        int sum = 0;
//        for(; num!=0; num /= 10){
//            int remainder = num % 10;
//            sum += remainder;
//        }
//        System.out.println(sum);

        // Intermediate Loop

        // Fibonacci Series

//        int num = 10;
//        int first = 0, second = 1;
//
//        for(int i = 3; i <= num; i++){
//            int nextTerm = first + second;
//            System.out.print(nextTerm + " , ");
//            first = second;
//            second = nextTerm;
//        }


        // Fibonacci Series
//        int num = 10;
//        int firstTerm = 1;
//        int secondTerm = 2;
//        System.out.print(firstTerm + "  " + secondTerm + "  ");
//
//        for(int i = 2; i <= num; i++){
//            int nextTerm = firstTerm + secondTerm;
//            System.out.print(nextTerm + "  ");
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }


//        int num = 5;
//        int firstTerm = 1, secondTerm = 2;
//        System.out.print(firstTerm + " , " + secondTerm + " , ");
//
//        for(int i = 3; i <= num; i++){
//            int nextTerm = firstTerm + secondTerm;
//            System.out.print(nextTerm + " , ");
//
//            if(i == num){
//                System.out.print(nextTerm);
//            }
//            else {
//                System.out.print(nextTerm + " , ");
//            }
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }


//        int num  = 5;
//        int firstTerm = 1, secondTerm = 2;
//        System.out.print(firstTerm + " , " + secondTerm + " , ");
//
//        for(int i = 3; i <= num; i++){
//           int nextTerm = firstTerm + secondTerm;
//
//           if(i == num){
//               System.out.print(nextTerm);
//           }
//           else{
//               System.out.print(nextTerm + " , ");
//           }
//
//           firstTerm = secondTerm;
//           secondTerm = nextTerm;
//        }

        // Fibonacci Series

//        int num = 10;
//        int firstTerm = 1, secondTerm = 2;
//        System.out.print(firstTerm + " , " + secondTerm + " , ");
//
//        for(int i = 3; i <= num; i++){
//            int nextTerm = firstTerm + secondTerm;
//
//            if(i == num){
//                System.out.print(nextTerm);
//            }
//            else
//            {
//                System.out.print(nextTerm + " , ");
//            }
//
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }


        // Check prime number

        int num = 4;
        boolean isPrime = false;

        if(num == 0 || num == 1)
        {
          isPrime = false;
        }

        for(int i = 2; i <= num / 2; ++i) {
            if(num % i == 0){
                isPrime = true;
                break;
            }
        }

        if(!isPrime){
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }


    }
}
