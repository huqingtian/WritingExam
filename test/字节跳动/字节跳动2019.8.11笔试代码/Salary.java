import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 通过80%  代码未完善
 */
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextShort();
        }
        money[0] = 100;
        int total = 100;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) money[i] = money[i - 1] + 100;
            else money[i] = 100;
            total += money[i];
        }
        System.out.println(total);
    }
}
