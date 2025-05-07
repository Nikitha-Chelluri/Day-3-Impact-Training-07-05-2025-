import java.util.*;
class Divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        for(int i =  start; i <= end; i++) {
            if ((i % 7 == 0) && (i % 9 == 0)) {
                System.out.println(i);
            }
        }
    }
}