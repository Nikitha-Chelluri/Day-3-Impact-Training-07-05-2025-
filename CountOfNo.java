import java.util.*;
class CountOfNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        int m = s.nextInt();
        int count = 0;
        while (num > 0) {
            long i = num % 10;
            num /= 10;
            if (i == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}