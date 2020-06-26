import java.util.Scanner;
/*
Description
    你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。

Input
    一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。

Output
    两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
 */
public class NumberOfOddAndEven {
    public static void main(String[] args) {
        int input, num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            input = sc.nextInt();
            if(input == -1) break;
            if(input % 2 == 0) num2++;
            else num1++;
        }
        System.out.println(num1 + " " + num2);
    }
}
