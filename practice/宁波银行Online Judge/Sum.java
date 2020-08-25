import java.util.Scanner;
/*
描述
    计算 1 + 2 + 3 + ... + n

输入
    输入将包含一系列整数n，每行一个整数。

输出
    对于每种情况，在一行中输出答案， 结果将在32位整数的范围内。
 */
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long n = sc.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
