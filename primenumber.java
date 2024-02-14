public class primenumber {
    public static void main(String[] args) {
        int maxNumber = 20;
        System.out.println("Prime numbers between 1 and " + maxNumber + " are:");
        for (int i = 2; i <= maxNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
