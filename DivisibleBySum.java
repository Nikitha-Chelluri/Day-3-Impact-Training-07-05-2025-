import java.util.*;
class DivisibleBySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int i = temp % 10;
            sum += i;
            temp /= 10;
        }
        if (n % sum == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
