import java.util.Scanner;
/*
描述
    对于表达式n^2+n+41，当n在（x,y）范围内取整数值时（包括x,y）(-39<=x<y<=50)，判定该表达式的值是否都为素数。

输入
    输入数据有多组，每组占一行，由两个整数x，y组成，当x=0,y=0时，表示输入结束，该行不做处理。

输出
    对于每个给定范围内的取值，如果表达式的值都为素数，则输出"OK",否则请输出“Sorry”,每组输出占一行。
 */
public class PrimeJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) return;
            boolean tag = true;
            for (int n = x; n <= y; n++) {
                if (isPrime(n * n + n + 41) == false) {
                    tag = false;
                    break;
                }
            }
            if (tag) System.out.println("OK");
            else System.out.println("Sorry");
        }
    }

    static boolean isPrime(int n) {
        double sqrt = Math.sqrt(n);
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
