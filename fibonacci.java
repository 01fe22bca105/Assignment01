public class fibonacci {
    public static void main(String[] args) {
        int limit = 10; 
        generateFibonacciSeries(limit);
    }

    public static void generateFibonacciSeries(int limit) {
        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series up to " + limit + " terms:");
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < limit; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}
