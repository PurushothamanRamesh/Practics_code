package realiti;

public class MultiplesOfThreeOrFive {
    public static void main(String[] args) {
       int output = sumOfMultiples(3, 5, 999);
        System.out.println("Sum of all multiples below 1000 is : "+output);
    }

    public static int sumOfMultiples(int multiple1, int multiple2, int limit) {
        if (limit <= 0) {
            return 0;
        } else {
            int sum = 0;
            if (limit % multiple1 == 0 || limit % multiple2 == 0) {
                sum = limit;
            }
            return sum + sumOfMultiples(multiple1, multiple2, limit - 1);
        }
    }
}