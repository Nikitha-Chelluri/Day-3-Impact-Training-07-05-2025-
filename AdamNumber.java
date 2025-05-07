import java.util.*;
class AdamNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int square = n * n;
        int temp = n;
        int reverse = 0; 
        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10; 
        }
        int reverseSquare = reverse * reverse;
        int reverseReverseSquare = 0;
        while (reverseSquare > 0) {
            int remainder = reverseSquare % 10;
            reverseReverseSquare = reverseReverseSquare * 10 + remainder;
            reverseSquare /= 10; 
        }
        if (square == reverseReverseSquare){
            System.out.println("Adam Number");
        }
        else {
            System.out.println("Not Adam Number");
        }
    }
}