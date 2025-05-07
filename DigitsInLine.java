import java.util.*;
class DigitsInLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long digit = s.nextLong();
        while (digit > 0) {
            long i = digit % 10;
            digit /= 10;
            System.out.println(i);
        }
    }
}