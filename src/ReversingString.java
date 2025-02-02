import javax.print.attribute.standard.MediaSize;

public class ReversingString {
    public static void main(String[] args) {
//        String name = "Sadikshya";

//        for(int i = name.length() - 1; i >= 0; i--){
//            System.out.print(name.charAt(i));
//        }

        // Using Char Array

//        char[] characters = name.toCharArray();
//        for(int i = characters.length - 1; i >= 0; i--){
//            System.out.print(characters[i]);
//        }

//        StringBuilder sb = new StringBuilder(name);
//        System.out.println(sb.reverse());

//        StringBuffer sb = new StringBuffer(name);
//        System.out.println(sb.reverse());


//        String name = "Shraddha";
//        name.concat("Acharya");
//        System.out.println(name);
//        name.substring(0);
//        System.out.println(name);


        // String - immutable - we cannot change
        // StringBuffer, StringBuilder - mutable - we can change

        StringBuffer sb = new StringBuffer("Shraddha");
//        sb.append(" Acharya");
        sb.substring(3,6);
        System.out.println(sb);

//        StringBuilder sb1 = new StringBuilder("Shraddha");
//        sb1.append(" Acharya");
//        System.out.println(sb1);


    }
}
