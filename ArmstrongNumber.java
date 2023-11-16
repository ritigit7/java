public class ArmstrongNumber {
    public static void main(String[] args) {
        int numbers[] = {153, 370, 371, 407, 123, 456}; 

        System.out.println("Armstrong Numbers:");

        for (int number : numbers) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
