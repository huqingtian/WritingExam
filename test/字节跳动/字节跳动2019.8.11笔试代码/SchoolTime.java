import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 通过80%  代码未完善
 */
public class SchoolTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        Queue<Short> queue = new LinkedList<Short>();
        for (short i = 0; i < 2 * n; i++) {
            queue.add(sc.nextShort());
        }
        short x = sc.nextShort();
        short hour = sc.nextShort();
        short min = sc.nextShort();
        boolean b = true;
        while (x > min) {
            b = false;
            hour--;
            min += 60;
            if (x > min) continue;
            else {
                min -= x;
                break;
            }
        }
        if (b) min -= x;
        short max_h = 0;
        short max_m = 0;
        for (short i = 0; i < n; i++) {
            short temp_h = queue.poll();
            short temp_m = queue.poll();
            if (temp_h <= hour && temp_m <= min) {
                if (max_h <= temp_h && max_m <= temp_m) {
                    max_h = temp_h;
                    max_m = temp_m;
                }
            }
        }
        System.out.println(max_h + " " + max_m);
    }
}
