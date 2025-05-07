import java.util.*;
class DivisibleBySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            sum += i;
            n /= 10;
        }
        if (n % sum == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}