public class Arrays {

    public static void main(String[] args) {
//        Object a[] = {'A', 100, 10.0f, 122.222, "Welcome"};

//        for(Object array:a){
//            System.out.println(array);
//        }

//        for(int i = 0; i <= a.length-1; i++){
//            System.out.println(a[i]);
//        }


//        int array[] = new int[3];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[0] = 4;
//        System.out.println(array[0]);
//        System.out.println(array.length);

//        for(int i = 0; i <= array.length - 1; i++){
//            System.out.println(array[i]);
//        }

//        for(int arr : array){
//            System.out.println(arr);
//        }

        // Multi-Dimensional Array / Two Dimensional Array

//        int array[][] = {{1,3,5,7,9}, {2,4,6,8,10}};
//        for(int i = 0; i <= array.length - 1; i++){ // row
//            for(int j = 0; j <= array[i].length - 1; j++){ //column
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Enhanced Loop

//        for(int a[]:array){
//            for(int x:a){
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }

        // Java Type Casting

        // Converting a smaller type to a larger type size

       // byte - short - char - int - long - float - double

//        byte num = 12;
//        double number = num;
//        System.out.println(number);


        // Converting a larger type to a smaller size type

       // double - float - long - int - char - short - byte

//       double doubleNum = 10.0;
//       int intNum = (int) doubleNum;
//        System.out.println(intNum);


//        int userScore = 300;
//        int maxScore = 500;
//        float percentage = (float) userScore/maxScore * 100.0f;
//        System.out.println(percentage);

//        int num1 = 10;
//        int num2 = 3;
//        float result = (float) num1/num2;
//        System.out.println(result);


//        int[] number = {2,3,47,1,8,11,30};
//        int largestNum = number[0];
//        for(int i = 0; i <=number.length - 1; i++){
//            if(number[i] > largestNum){
//                largestNum = number[i];
//            }
//        }
//        System.out.println(largestNum);

//        int number[] = {98, 97, 96, 95, 94, 93, 932, 91, 90, 42};
//        int smallestNumber = number[0];
//        for(int i = 0; i <= number.length - 1; i++){
//            if(smallestNumber > number[i]){
//                smallestNumber = number[i];
//            }
//        }
//        System.out.println(smallestNumber);

//        int number[] = {2, 4, 1, 45, 47, 49};
//        for(int i = 0; i <= number.length - 1; i++){
//            if(number[i] % 2 == 0){
//                System.out.println("Even numbers: " + number[i]);
//            }
//        }


        // Print the even number from array
//        int number[] = {12, 3, 24, 35, 89, 80, 60, 50};
//        for(int i = 0; i < number.length - 1; i++){
//            if(number[i] % 2 == 0){
//                System.out.println("Even number: " + number[i]);
//            }
//        }

        // Print odd number from array

//        int number[] = {12, 22, 23, 34, 45, 67, 89, 66};
//        for(int i = 0; i <number.length - 1; i++){
//            if(number[i] % 2 != 0){
//                System.out.println("Odd Number: " + number[i]);
//            }
//        }

        // Reverse an array
//        int[] number = {12, 23, 24, 45, 56, 26, 28, 29};
//        for(int i = number.length - 1; i >= 0; i--){
//            System.out.println(number[i]);
//        }

        // Find duplicate in an array
//        int[] numbers = {12, 1, 2, 3, 4, 5, 6, 7, 8, 4, 3, 2, 1};
//        for(int i = 0; i <= numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] == numbers[j]) {
//                    System.out.println("Duplicate numbers: " + numbers[i]);
//                }
//            }
//        }

        // Search an element in an array
//        int numbers[] = {12, 34, 2, 3,4 ,5,6 ,7,8};
//        int searchNum = 8;
//        boolean status = false;
//
//        for(int i= 0; i < numbers.length; i++){
//            if(numbers[i] == searchNum){
//                System.out.println("Element Found!!!");
//                status = true;
//                break;
//            }
//        }
//
//        if(status == false){
//            System.out.println("Element not found!!!");
//        }

        // Print the repeatitive number in an array

//        int numbers[] = {1, 20, 31, 30, 42, 41, 2, 3, 5, 4, 3};
//        for(int i = 0; i <= numbers.length - 1; i++){
//            for(int j = i + 1; j <= numbers.length - 1; j++){
//            if(numbers[i] == numbers[j]) {
//                System.out.println(numbers[i]);
//            }
//            }
//        }

        // Print the repeatitive number in an array
//        int numbers[] = {2, 3, 4, 5, 6, 6, 7, 8, 6, 6, 6, 6, 6, 9};
//        int targetNumber = 6;
//        int count = 0;
//
//        for(int i = 0; i < numbers.length ; i++){
//           if(numbers[i] == targetNumber){
//               count++;
//           }
//        }
//        System.out.println(count);


        // Print the repeatitive number in an array

//        int numbers[] = {1, 2, 3,4, 5, 6, 1, 2,2, 2, 2};
//        int targetNumber = 2;
//        int count = 0;
//        for(int i = 0; i < numbers.length - 1; i++){
//            if(numbers[i] == targetNumber){
//                count++;
//            }
//        }
//        System.out.println(count);


        // Find the smallest element of an array
//        int numbers[] = {1, 2, 3, 4, 5,6 , 8, 3, 3, 3, 3};
//        int smallestNum = numbers[1];
//        for(int i = 0; i <= numbers.length - 1; i++){
//            if(smallestNum > numbers[i]){
//                smallestNum = numbers[i];
//            }
//        }
//        System.out.println(smallestNum);


        // Count the number of characters appear in a String
//        String name = "Shraddha";
//        char a[] = name.toCharArray();
//        int count = 0;
//        char target = 'a';
//
//        for(int i = 0; i <name.length() - 1; i++){
//            if(a[i] == target){
//                count++;
//                System.out.println(target + ": " + count);
//            }
//        }

//        String name = "Amirrrrrr";
//        char target = 'r';
//        int count = 0;
//
//        for(int i = 0; i <= name.length() - 1; i++){
//            if(name.charAt(i) == target){
//                count++;
//            }
//        }
//
//        System.out.println(target + " is repeated " + count + " times.");

        // Types of Operators
        /*

        1. Arithmetic Operator
        2. Assignment Operator
        3. Comparison Operator
        4. Logical Operator
        5. Bitwise Operator

        */


        // Arithmetic Operator
        // +, -, *, /, %, ++, --

        // Assignment Operator
        // +=, -=, *=, /=, %=, =, |=, ^=

        // Comparison Operator
        // <=, >=, <, >, ==, !=

        // Logical Operator
        // &&, !, ||

//        String name = " Sadikshya ";
//        System.out.println(name.trim());

//        String name = "Amir";
//        String caste = " Acharya";

//        System.out.println(name.length());
//        System.out.println(name.indexOf('A'));
//        System.out.println(name.charAt(2));
//        System.out.println(name.concat(" Acharya"));
//        System.out.println(name + " " + caste);
//        System.out.println(name.concat(caste));
//        System.out.println(name.substring(1));
//        System.out.println(name.substring(0,2));

//        System.out.println(name.equals("amir"));
//        System.out.println(name.equals("Amir"));

//        System.out.println(name.contains("r"));
//        System.out.println(name.contains("ri"));
//        System.out.println(name.equalsIgnoreCase("amiR"));

//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());


        // Concatenate Amir20
//        int num = 20;
//        System.out.println(name + num);

//        String name = "Sadikshya.Acharya";
//        String[] names = name.split("\\.");
//        for(String array: names)
//        System.out.println(array);

//        String word = "I am from .Lalitpur, Nepal";
//        String[] words = word.split("\\.");
//        for(String x :words){
//            System.out.print(x);
//        }

//        String name = "Shraddha";
//        String caste = "Acharya";
//
//        System.out.println(name + " " + caste);
//        System.out.println(name.concat( " " + caste));
//        System.out.println(name.concat(" Marasini"));

        String name = "Sadikshyb";
//        System.out.println(name.replace("b", "a"));

//        System.out.println(name.startsWith("a"));
//        System.out.println(name.endsWith("b"));

        // Join multiple strings
//        String[] partsToJoin = {"Sadikshya", "Acharya"};
//        String joinedString = String.join(" ", partsToJoin);
//        System.out.println(joinedString);

        // Print Special Characters
//        String text = "I\'m from \"Nepal\"";
//        System.out.println(text);

//        String text = "I\'m from Nepal";
//        System.out.println(text);

//        String text = "My name is \"Sadikshya Acharya\"";
//        System.out.println(text);


//        String word = "I am from \"Nepal\"";
//        System.out.println(word);

//        String words = "I\'m from \"Nepal\".";
//        System.out.println(words);

        String text0 = "I\'m from \n Nepal";
        System.out.println(text0);

        String text = "I\'m from \r Nepal";
        System.out.println(text);

        String text1 = "I\'m from \t Nepal";
        System.out.println(text);

        String text2 = "I\'m from \b Nepal";
        System.out.println(text);

        String text3 = "I\'m from \f Nepal";
        System.out.println(text);


//        System.out.println(name.substring(0));







    }
}
