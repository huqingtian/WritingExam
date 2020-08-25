import java.util.Scanner;
/*
描述
    输入一个正整数repeat(0<repeat<10)，做repeat次下列运算：
    输入一个整数，输出它的位数以及各位数之和。

输入
    正整数repeat及repeat个整数

输出
    整数的位数以及各位数之和
 */
public class NumberAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for(int i = 0; i < repeat; i++){
            int n = Math.abs(sc.nextInt());
            int sum = 0, time = 0;
            while(n >= 1){
                sum += n % 10;
                n /= 10;
                time++;
            }
            System.out.println("number=" + time + ",sum=" + sum);
        }
    }
}
