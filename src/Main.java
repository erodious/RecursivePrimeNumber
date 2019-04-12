public class Main {

    public static void main(String[] args) {
        int n = 409;
        boolean result = isPrime(n);

        System.out.print("Number " + n + ": ");
        if(!result)
            System.out.print("NOT ");

        System.out.println("PRIME");
    }

    static boolean isPrime(int n) {
        if(n % 2 == 0) return false;
        return isPrime(n, 3);
    }

    static boolean isPrime(int n, int d) {
        //System.out.println("N: " + n + ", D: " + d);
        if(n / 2 < d) return true;
        if(n % d == 0) return false;
        return isPrime(n, d + 2);
    }
}
