import java.util.Scanner;
/*
Description
	我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
	现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
	注意，是第n个素数到第m个素数之间的所有的素数，并不是n和m之间的所有的素数。

Input
	两个整数，第一个表示n，第二个表示m。

Output
	一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
*/
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int ans = 0;
        int n = 0, m = 0;
        boolean flag;
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 2;; i++) {
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                num++;
                if(num >= n && num <= m)
                    ans += i;
                if (num == m)
                    break;
            }
        }
        System.out.println(ans);
        in.close();
    }
}
