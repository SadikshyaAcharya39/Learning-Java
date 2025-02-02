import java.util.Arrays;

public class RemoveSpecialCharacterFromString {
    public static void main(String[] args) {

//        String name = "Sadikshya....Acharya";
//        String replaceString = name.replace(".", " ");
//        System.out.println(replaceString);


        // Remove white spaces in String
//        String name = "S ad iks hy a Ac ha r ya";
//        String formattedString = name.replace(" ", "");
//        System.out.println(formattedString);

        // Count co-occurences of character in a String

//        String name = "Sadikshya";
//        char letter = 'a';
//        int count = 0;
//        for(int i = 0; i <= name.length() - 1; i++){
//            if(name.charAt(i) == letter){
//                count++;
//            }
//        }
//        System.out.println(letter + " is repeated " + count + " times in " + name);

//        int num = 223221;
//        int targetNum = 2;
//        String nums = String.valueOf(num);
//
//        int count = 0;
//
//        for (int i = 0; i <= nums.length() - 1; i++) {
//            if (nums.charAt(i) == (char) (targetNum)){
//                count++;
//            }
//        }
//
//        System.out.println(targetNum + " is present " + count + " times in a " + num);


        // Remove junk or special characters in a string

//        String text = " wel###com$$$$e";
//        String formatedText1 = text.replace("#", "");
//        System.out.println(formatedText1);
//
//        String formattedText2 = formatedText1.replace("&", "");
//        System.out.println(formattedText2);

        // Replace all non-alphanumeric characters
//        String formattedText = text.replaceAll("[^a-zA-Z*]", "");
//        System.out.println(formattedText);

        String text = "wel###com$$$$e";
        int count = 0;
        for(int i = 0; i <= text.length() - 1; i++){
            count++;
        }
        System.out.println(count);

    }
}
