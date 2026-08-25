import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (y != 0) {
                int temp = x % y;
                x = y;
                y = temp;
            }

            System.out.println(x);
        }
    }
}