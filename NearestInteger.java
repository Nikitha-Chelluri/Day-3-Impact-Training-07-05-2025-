import java.util.*;
class NearestInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int m = s.nextInt();
        int q = (num / m);
        int lb = q * m;
        int up = (q+1)  * m;
        int d1 = num - lb;
        int d2 = up - num;
        if (d1 == d2) {
            System.out.println(up);
        }
        else if (d1 > d2) {
            System.out.println(up);
        }
        else if (d1 < d2) {
            System.out.println(lb);
        }
    }
}