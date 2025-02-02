public class ArmStrongNumber {
    public static void main(String[] args) {

//        int originalNum = 153;
//        int num = originalNum;
//        int count = 0;
//        int sum = 0;
//
//        // Count the number of digits
//        int temp = num;
//        for(; temp !=0; temp /= 10){
//            count++;
//        }
//
//        temp = num;
//        // To find the power and add numbers
//        for(; temp!=0; temp /= 10){
//            int remainder = temp % 10;
//            sum += Math.pow(remainder, count);
//        }
//
//        if(sum == originalNum){
//            System.out.println(originalNum + " is ArmStrong number.");
//        }
//        else
//        {
//            System.out.println(originalNum + " is not Armstrong number.");
//        }

        int originalNum = 153;
        int num = originalNum;
        int count = 0;
        int sum = 0;

        int temp = num;
        for(; temp != 0; temp/=10){
            count++;
        }

        temp = num;
        for(; temp!=0; temp/=10){
            int remainder = temp % 10;
            sum+= Math.pow(remainder, count);
        }

        if(originalNum == sum){
            System.out.println(originalNum + " is an Armstrong number.");
        }
        else
        {
            System.out.println(originalNum+ " is not an Armstrong number.");
        }

    }
}
